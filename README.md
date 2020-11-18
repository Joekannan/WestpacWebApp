# WestpacWebApp
This project provides the solution to run the Westpac web app automation using Serenity, Cucumber all working together to run a desktop browser application.
This Readme page helps to understand how to run the test after cloning the project.
# Application under test
In this project, the AUT is https://www.westpac.co.nz/. 
- This project has been configured to run the tests in multiple browser. Here I have tried running the tests in Chrome, Edge and Firefox browsers separately.
- The test in this project has been integrated with Saucelabs to run it in cross browser and cross platform.
- This project has been integrated with Applitools also which is the Visual UI validation tool, to find out the visual bugs in the application UI.
- Also, this project has the capability to run the tests in parallel mode - the feature files will be executed in parallel (not the scenarios in parallel).
# How to run
-	Go to the folder path where your project POM.xml resides and type
-	**mvn clean test -Dcucumber.options=”—tags @smoke”** – This will run one of the scenarios from KiwiSaverCalc.feature in chrome browser
-	In case of running all the scenarios from all feature files, use **“mvn clean test serenity:aggregate”** which will run all scenarios and produce the aggregated results.
-	serenity.properties file contain the configuration for different browsers, Saucelabs integration and Applitools Integration.
-	When you want to run the test in **Saucelabs**, uncomment the Saucelabs configurations and run the test from CLI using **“mvn clean test serenity:aggregate”**
-	When scenarios from “ApplitoolsTest.feature” is executed, make sure that the **Applitools** config in properties file is uncommented.
-	To run the tests in Parallel mode, use **“mvn clean verify”**. This will open 3 chrome driver instances, as thread count 3 is configured in failsafe-plugin. Each feature will be run in one thread (not scenarios)
# How to add further tests
For a new story
-	Design your feature files based on your acceptance criteria and what your user wants to achieve
-	Create your step definitions for how to do what the user wants to achieve
# Reporting
- This project uses the Serenity reports which acts as a living documentation of results.
- After running the **"mvn clean verify", or “mvn clean test”** the report is available at **\kiwisaverWeb\reports\timestamp** folder if the test is initiated from the command prompt.
- If tests are started from **TestRunner** class (which is inside com.westpac.webapp.testRunner package), then results will be available at **target/site/serenity/index.html**
