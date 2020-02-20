import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.Utilities.CommonUtilities.launchSite'()

WebUI.click(findTestObject('Page_PHPTRAVELS  Travel Technology Partner/a_Flights'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_PHPTRAVELS  Travel Technology Partner/CalenderIcon'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_PHPTRAVELS  Travel Technology Partner/div_29'))

WebUI.click(findTestObject('Page_PHPTRAVELS  Travel Technology Partner/button_Search'))


/* Validating Result Page - Below code can be added to for loop to verify all result flight records meet the search criteria*/

//Check 1 : Result page shows flight details when clicked on

WebUI.click(findTestObject('Object Repository/Page_Flights Results - From to NYC to MIA/div_Modify Search_theme-search-results-item-mask-link'))


//Check 2 : If the flights fetched are for the specific date

findTestObject('Object Repository/Page_Flights Results - From to NYC to MIA/p_Saturday 29 Feb 2020')


//Check 3 : If source is New York

findTestObject('Object Repository/Page_Flights Results - From to NYC to MIA/b_New York')


//Check 4 : If destination is Miami

WebUI.click(findTestObject('Object Repository/Page_Flights Results - From to NYC to MIA/b_Miami'))


WebUI.click(findTestObject('Object Repository/Page_Flights Results - From to NYC to MIA/div_'))


/* Verify if stop filter works */

WebUI.click(findTestObject('Object Repository/Page_Flights Results - From to NYC to MIA/label_2 Stop'))


/* Verify if Airlines filter works */

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Flights Results - From to NYC to MIA/label_American Airlines'))

