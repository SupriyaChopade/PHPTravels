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

for (i = 1; i <= 5; i++) {
	
	def fName = findTestData('TestData').getValue(1,i )
	
	def lName = findTestData('TestData').getValue(2, i)
	
	def phoneNo = findTestData('TestData').getValue(3, i)
	
	def email = findTestData('TestData').getValue(4, i)
	
	def password = findTestData('TestData').getValue(5, i)
	
	//SIGN UP
	
	CustomKeywords.'com.Utilities.CommonUtilities.SignUp'(fName,lName,phoneNo,email,password)
	
	//LOGIN

    CustomKeywords.'com.Utilities.CommonUtilities.login'(email,password)

    CustomKeywords.'com.Utilities.CommonUtilities.logout'()
	
	//Add delay
	WebUI.delay(3);
}

