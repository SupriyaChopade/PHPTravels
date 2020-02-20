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


//Read email value from Test data file
def email = findTestData('TestData').getValue(4, 1)


//Case 1 : To verify subscription is successful using correct email

WebUI.setText(findTestObject('Page_PHPTRAVELS_Home/input_Newsletter_exampleInputEmail1'), 
    email)

WebUI.click(findTestObject('Page_PHPTRAVELS_Home/button_Subscribe'))

WebUI.delay(2);

findTestObject('Page_PHPTRAVELS_Home/div_Subscribed Successfully')


//Case 2 : To verify notfication is shown to user when registered email is reentered

WebUI.setText(findTestObject('Page_PHPTRAVELS_Home/input_Newsletter_exampleInputEmail1'),
	email)

WebUI.click(findTestObject('Page_PHPTRAVELS_Home/button_Subscribe'))

WebUI.delay(2);

findTestObject('Page_PHPTRAVELS_Home/div_Already Subscribed')


//Case 3 : To verify empty string is not accepted for subscription form

WebUI.setText(findTestObject('Page_PHPTRAVELS_Home/input_Newsletter_exampleInputEmail1'),
	"")

WebUI.click(findTestObject('Page_PHPTRAVELS_Home/button_Subscribe'))

WebUI.delay(2);

findTestObject('Page_PHPTRAVELS_Home/p_The Email field is required')

