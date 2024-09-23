import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
 
 
WebUI.callTestCase(findTestCase('IPTV-services/TC_1_Interface_Login'), [:], FailureHandling.STOP_ON_FAILURE)
 
Main_Category_Response =WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/IPTV Services Copy/Get Main Categories', [('URL') : GlobalVariable.URL]))
 
WS.verifyResponseStatusCode(Main_Category_Response, 200)
 
CustomKeywords.'totalplay.Common.printResponseinText'(Main_Category_Response)
 
categories_0_alias='categories[0].alias'
categories_0_id='categories[0].id'
categories_0_name='categories[0].name'
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Main_Category_Response, categories_0_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Main_Category_Response, categories_0_alias)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Main_Category_Response, categories_0_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Main_Category_Response, categories_0_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Main_Category_Response, categories_0_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Main_Category_Response, categories_0_name)
 