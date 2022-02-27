package com.utility;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.xml.bind.JAXB;

import org.apache.commons.io.FileUtils;



/**
 *
 * ClassName: EmailUtility Description: This class is for sending the email
 */

public class EmailUtility {

	public static String getTestSummaryReport() throws IOException {
		File dump = new File(System.getProperty("user.dir") + "/Reports/"
				+ PropertyUtility.getProperty("ApplicationName")
				+ "-feature-overview-dump.xml");
		String content = FileUtils.readFileToString(dump,
				Charset.defaultCharset());
		content = content.replaceAll("\\[]\\[]", "");
		FileUtils.writeStringToFile(dump, content, Charset.defaultCharset());
		int[][] result = JAXB.unmarshal(dump, int[][].class);
		String scenarioPassed = result[1][0] + "";
		String scenarioFailed = result[1][1] + "";
		String scenarioUndefined = result[1][2] + "";
		String totalScenarios = result[1][0] + result[1][1] + result[1][2] + "";
		String mailText = "<table cellspacing=\"0\" cellpadding=\"0\" border=\"1\" style=\"table-layout:fixed;font-size:13px;font-family:arial,sans,sans-serif;border-collapse:collapse;border:1px solid rgb(204,204,204)\">"
				+ "<colgroup><col width=\"249\"><col width=\"143\"></colgroup><tbody><tr style=\"height:21px\"><td style=\"padding:2px 3px;vertical-align:bottom;background-color:rgb(153,153,153)\" rowspan=\"1\" colspan=\"2\" align=\"center\"><b>Test Run Summary Report</b></td>"
				+ "</tr><tr style=\"height:21px\"><td style=\"vertical-align:bottom\" align=\"center\"><span style=\"font-family:arial;font-size:small\">Total Scenarios Run</span><br></td><td  style=\"vertical-align:bottom\" align=\"center\">"
				+ totalScenarios
				+ "</td></tr><tr style=\"height:21px\"><td style=\"vertical-align:bottom\"align=\"center\">"
				+ "<span style=\"font-family:arial;font-size:small\">Scenarios Passed</span></td><td  style=\"vertical-align:bottom\"align=\"center\">"
				+ scenarioPassed
				+ "</td></tr><tr style=\"height:21px\">"
				+ "<td style=\"vertical-align:bottom\"align=\"center\"><span style=\"font-family:arial;font-size:small\">Scenarios Failed"
				+ "</span></td><td  style=\"vertical-align:bottom\" align=\"center\">"
				+ scenarioFailed
				+ "</td></tr><tr style=\"height:21px\"><td style=\"vertical-align:bottom\"align=\"center\">"
				+ "<span style=\"font-family:arial;font-size:small\">Scenarios Undefined</span></td><td  style=\"vertical-align:bottom\"align=\"center\">"
				+ scenarioUndefined + "</td></tr></tbody></table>";
		return mailText;
	}

	/*
	 * Method Name: main() Description: This function uses the jmail api to send
	 * the mail. sender mail id, password and recipient mail id passed are read
	 * from config.properties file.
	 */
	public static void main(String args[]) throws Exception, IOException {

		final String senderMailId = PropertyUtility.getProperty("Sendermailid");
		final String senderPassword = PropertyUtility
				.getProperty("Senderpassword");
		String toReceipientMailId = PropertyUtility.getProperty("TOReceipient");
		String ccReceipientMailId = PropertyUtility.getProperty("CCReceipient");
		String applicationName = PropertyUtility.getProperty("ApplicationName");
		String reportFile = PropertyUtility.getProperty("ApplicationName")
				+ "-test-results.pdf";
		String reportFilePath = "Reports/" + reportFile;

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.port", "587");
	
		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(senderMailId,
								senderPassword);
					}
				});
		try {

			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("from-email@gmail.com"));
			message.addRecipients(Message.RecipientType.TO,
					InternetAddress.parse(toReceipientMailId));
			message.addRecipients(Message.RecipientType.CC,
					InternetAddress.parse(ccReceipientMailId));
			message.setSubject(applicationName
					+ " Automation Test Summary Report - " + getDate());

			// create the message part
			String fileAttachment = reportFilePath;
			StringBuffer body = new StringBuffer(
					"<html>Hi, <br><br>Following is the Test Summary Report for ");
			body.append(applicationName);
			body.append(" - " + System.getProperty("browser"));
			body.append("<br><br>");
			body.append(getTestSummaryReport());
			body.append("<br><br> Thanks,<br>Nibin");
			body.append("</html>");

			MimeBodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setContent(body.toString(),
					"text/html; charset=utf-8");
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);

			// Part two is attachment
			messageBodyPart = new MimeBodyPart();
			DataSource source = new FileDataSource(fileAttachment);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(reportFile);
			multipart.addBodyPart(messageBodyPart);

			// Put parts in message
			message.setContent(multipart);

			// Send the message
			Transport.send(message);

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}

	public static String getDate() {
		Date date = new Date();
		String dateFormat = "dd/MM/yyyy";
		SimpleDateFormat simpleDateFormatObject = new SimpleDateFormat(
				dateFormat);
		String formattedDate = simpleDateFormatObject.format(date);
		return formattedDate;
	}

}
