# AutomationCode

Framework used - Selenium - Cucumber -Ant
Highlights of framework: 
  1. Customized extended cucumber report in pdf format
  2. Triggers mail after execution
  3. Captures snippets of execution like number of test cases, passed, failed etc and displays in the mail body.
  4. PDF report also gets attached in the mail.
  5. config.properties file used to get the configuration values
  6. Page Object Model used to capture all elements and the action on elements.
  7. Framework can be customized to run with Appium for mobile automation and RestAssured for API Automation
  8. Framework can be customized to run in docker containers with selenium grid (parallel execution in chrome and firefox browsers)

Steps to run the build.xml file
  1. Clone the project
  2. Project -> Configure build path -> Add Jars -> add all libraries from libs folder alternatively from terminal cd to project folder and type ant
  3. From IDE, right click and run as ANT Build triggers execution and upon completion mail will be send.
  4. TestRunner.java is the runner class with glue code
  5. ToDoPages.java is the POM class
  6. ToDoTestCases.java is the step definition
  7. todo.feature is the feature file
  8. build.xml file is the ant xml file


