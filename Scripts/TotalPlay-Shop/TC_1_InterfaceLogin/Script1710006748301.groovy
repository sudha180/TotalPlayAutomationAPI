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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

LoginResponse = WS.sendRequest(findTestObject('TotalPlay-Shop/Interface Login (SLAS)', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID]))

//CustomKeywords.'totalplay.Common.printResponseinText'(LoginResponse)
assert WS.getResponseStatusCode(LoginResponse) == 200

Auth = 'ocapiResponse.access_token'

String sfccAuthorization = WS.getElementPropertyValue(LoginResponse, Auth)

KeywordUtil.logInfo(sfccAuthorization)

//GlobalVariable.bm_auth_token = sfccAuthorization
GlobalVariable.Authorization = "Bearer "+ sfccAuthorization
KeywordUtil.logInfo(GlobalVariable.bm_auth_token)

if (sfccAuthorization.length() == 0) {
    KeywordUtil.markFailed('authorization not generated')
} else {
    KeywordUtil.markPassed('authorization generated')
}

BasketId_loginResponse = 'ocapiResponse.c_basketId'

CustomerId_loginResponse = 'ocapiResponse.customer_id'

String basketId = WS.getElementPropertyValue(LoginResponse, BasketId_loginResponse)

String customerId = WS.getElementPropertyValue(LoginResponse, CustomerId_loginResponse)

GlobalVariable.basketID = basketId

GlobalVariable.sla_customerId = customerId

println(GlobalVariable.basketID)

println(GlobalVariable.sla_customerId)

refresh_token = 'ocapiResponse.refresh_token'

customer_email = 'ocapiResponse.customer_email'

c_brmId = 'ocapiResponse.c_brmId'

customer_name = 'ocapiResponse.customer_name'
CustomKeywords.'totalplay.Common.printResponseinText'(LoginResponse)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(LoginResponse, refresh_token)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(LoginResponse, refresh_token)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(LoginResponse, customer_email)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(LoginResponse, customer_email)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(LoginResponse, customer_name)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(LoginResponse, customer_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(LoginResponse, c_brmId)

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(LoginResponse, c_brmId)

