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

WebUI.callTestCase(findTestCase('TotalPlay-Shop/TC_1_InterfaceLogin'), [:], FailureHandling.STOP_ON_FAILURE)

PCPSearch_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Search/PCP Search', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID]))

WS.verifyResponseStatusCode(PCPSearch_Response, 200)


productId = '[0].productId'
productName = '[0].productName'
link = '[0].link'
linkType = '[0].linkType'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCPSearch_Response, productId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCPSearch_Response, productId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCPSearch_Response, productName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCPSearch_Response, productName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCPSearch_Response, link)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCPSearch_Response, link)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(PCPSearch_Response, linkType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(PCPSearch_Response, linkType)





