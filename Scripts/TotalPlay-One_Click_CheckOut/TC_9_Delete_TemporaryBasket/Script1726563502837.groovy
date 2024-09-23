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

WebUI.callTestCase(findTestCase('TotalPlay-One_Click_CheckOut/TC_1_LoginInterface'), [:], FailureHandling.STOP_ON_FAILURE)

TemporaryBasket = WS.sendRequest(findTestObject('One_Click_CheckOut/temporary basket/createTemporaryBasket', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID]))

CustomKeywords.'totalplay.Common.printResponseinText'(TemporaryBasket)

WS.verifyResponseStatusCode(TemporaryBasket, 200)
c_result_basket_id	=	 'c_result.basket_id'

String TemporaryBasketId = WS.getElementPropertyValue(TemporaryBasket, c_result_basket_id)
GlobalVariable.temporary_basket_id= TemporaryBasketId
println(GlobalVariable.temporary_basket_id)

DeleteTemporaryBasket = WS.sendRequest(findTestObject('One_Click_CheckOut/temporary basket/Delete temporary basket', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID, ('temporary_basket_id') : GlobalVariable.temporary_basket_id]))

CustomKeywords.'totalplay.Common.printResponseinText'(DeleteTemporaryBasket)

WS.verifyResponseStatusCode(DeleteTemporaryBasket, 204)

