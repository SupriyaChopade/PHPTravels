# PHPTravels
Katalon Studio Test cases for PHP Travels for Axelerant skill 

CONTENT OF THIS FILE
*About Katalon Studio
*Execution Steps
*Key Notes


About Katalon Studio
Katalon Studio is an automation testing solution developed by Katalon LLC. The software is built on top of the open-source automation frameworks Selenium, Appium with a specialized IDE interface for web, API, mobile and desktop application testing
For further reference please visit -
https://en.wikipedia.org/wiki/Katalon_Studio
https://www.katalon.com/

Execution steps -

*Running Project in Katalon Studio IDE
1.Download Katalon Studio from official website - https://www.katalon.com/
2.CLone/Download the rpoject from repository to local
3.Open the project from Katalon Studio (launch application from the Katalon resource downloaded)
4.Navigate to Proj>Test Suites folder (Regression Test Suite collection contains all suites such that they can be configured to run from multiple browsers & execution mode can be set to sequential/parallel)

*Running Project from Jenkins
Prerequisite
You must have already installed Jenkins for Windows (click here for a guide) and the browser you’d like to use for the test.
1.Install Katalon Studio plugin
Go to Manage Jenkins > Manage Plugins > Available tab and find Katalon plugin on the list. Select and click Install.
2.Create and configure a new Jenkins project (create a simple freestyle project)
3.Tell Jenkins your workspace or simply use git & provide the repo link
4.Add and configure the build step Execute Katalon Studio tests.
Katalon Studio will be downloaded and installed automatically based on the version you specify. Current latets version is 7.2.1


NOTE -
1.To demonstrate resuable code and usage of parameterized test data, please review login testcase
2.Katalon studio is limited when executing parallel testing cases in a test suite , but a test suite collection has settings for execution mode to be set to sequencial/parallel. Also, the same suites can be run with multiple browsers form suite collection.
3.For test case 4 - the available page was not found , so have tried to automate the flow present on the site currently
