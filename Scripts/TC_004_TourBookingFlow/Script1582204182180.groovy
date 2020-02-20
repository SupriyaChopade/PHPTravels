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

def fName = findTestData('TestData').getValue(1,1 )

def phoneNo = findTestData('TestData').getValue(3, 1)


WebUI.delay(2);

WebUI.navigateToUrl("https://www.phptravels.net/offers")

WebUI.delay(5);

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS_Home/Page_Special Offers/div_Summer Vacation'))

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS_Home/Page_Special Offers/a_Read More'))

WebUI.delay(2);

WebUI.setText(findTestObject('Object Repository/Page_PHPTRAVELS_Home/Page_Summer Vacation/input_Name_name'), fName)

WebUI.setText(findTestObject('Object Repository/Page_PHPTRAVELS_Home/Page_Summer Vacation/input_Phone_phone'), phoneNo)

WebUI.setText(findTestObject('Object Repository/Page_PHPTRAVELS_Home/Page_Summer Vacation/textarea_Message_message'), 'QA Check')

WebUI.click(findTestObject('Object Repository/Page_PHPTRAVELS_Home/Page_Summer Vacation/input_Message_btn btn-success btn-success btn-block btn-lg'))

WebUI.delay(2);

// If success message-object is not found test case fails 

findTestObject('Object Repository/Page_PHPTRAVELS_Home/Page_Summer Vacation/div_Thanks For Contacting')

