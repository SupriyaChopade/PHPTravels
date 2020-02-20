package com.Utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import internal.GlobalVariable

public class CommonUtilities {

	@Keyword
	def boolean login(String username, String password) {

		WebUI.click(findTestObject('Page_PHPTRAVELS_Home/a_My Account'))

		WebUI.click(findTestObject('Page_PHPTRAVELS_Home/a_Login'))

		WebUI.click(findTestObject('Object Repository/Page_Login/span_Email'))

		WebUI.setText(findTestObject('Object Repository/Page_Login/input_Login_username'), username)

		WebUI.click(findTestObject('Object Repository/Page_Login/span_Password'))

		WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email_password'), password)

		WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

		WebUI.delay(3)

		if(WebUI.getUrl()=="https://www.phptravels.net/account/") {
			return true;
		}

		if(findTestObject('Object Repository/Page_Login/div_InvalidEmailorPassword')) {
			return false;
		}

		return false;
	}
	@Keyword
	def launchSite() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://www.phptravels.net/home')

		WebUI.delay(5)
	}

	@Keyword
	def SignUp(String fName, String lName, String phone, String email, String password) {

		WebUI.navigateToUrl('https://www.phptravels.net/login')

		WebUI.click(findTestObject('Object Repository/Page_Login/a_Sign Up'))

		WebUI.click(findTestObject('Object Repository/Page_Register/span_First Name'))

		WebUI.setText(findTestObject('Object Repository/Page_Register/input_Sign Up_firstname'), fName)

		WebUI.click(findTestObject('Object Repository/Page_Register/span_Last Name'))

		WebUI.click(findTestObject('Object Repository/Page_Register/input_First Name_lastname'))

		WebUI.setText(findTestObject('Object Repository/Page_Register/input_First Name_lastname'), lName)

		WebUI.click(findTestObject('Object Repository/Page_Register/span_Mobile Number'))

		WebUI.setText(findTestObject('Object Repository/Page_Register/input_Last Name_phone'), phone)

		WebUI.click(findTestObject('Object Repository/Page_Register/span_Email'))

		WebUI.setText(findTestObject('Object Repository/Page_Register/input_Mobile Number_email'), email)

		WebUI.click(findTestObject('Object Repository/Page_Register/span_Password'))

		WebUI.setText(findTestObject('Object Repository/Page_Register/input_Email_password'), password)

		WebUI.click(findTestObject('Object Repository/Page_Register/span_Confirm Password'))

		WebUI.click(findTestObject('Object Repository/Page_Register/span_Email'))

		WebUI.setText(findTestObject('Object Repository/Page_Register/input_Password_confirmpassword'), password)

		WebUI.click(findTestObject('Object Repository/Page_Register/span_Email'))

		WebUI.click(findTestObject('Object Repository/Page_Register/button_Sign Up'))

		WebUI.delay(3)

		logout()
	}

	@Keyword
	def logout() {

		WebUI.click(findTestObject('Page_My Account/a_AccountMenu'))

		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/Page_My Account/a_Logout'))
	}
}
