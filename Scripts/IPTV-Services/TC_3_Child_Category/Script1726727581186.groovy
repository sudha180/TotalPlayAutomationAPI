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
 
Child_Ctegory_Response=WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/IPTV Services Copy/Get Children Category', [('URL') : GlobalVariable.URL]))
 
WS.verifyResponseStatusCode(Child_Ctegory_Response, 200)
 
CustomKeywords.'totalplay.Common.printResponseinText'(Child_Ctegory_Response)
 
Response_IdResult='Response.IdResult'
Response_Result='Response.Result'
Response_ResultDescription='Response.ResultDescription'
categories_0_alias='categories[0].alias'
categories_0_id='categories[0].id'
categories_0_name='categories[0].name'
categories_0_children_0_alias='categories[0].children[0].alias'
categories_0_children_0_id='categories[0].children[0].id'
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Child_Ctegory_Response, Response_IdResult)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Child_Ctegory_Response, Response_IdResult)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Child_Ctegory_Response, Response_Result)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Child_Ctegory_Response, Response_Result)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Child_Ctegory_Response, Response_ResultDescription)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Child_Ctegory_Response, Response_ResultDescription)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Child_Ctegory_Response, categories_0_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Child_Ctegory_Response, categories_0_alias)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Child_Ctegory_Response, categories_0_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Child_Ctegory_Response, categories_0_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Child_Ctegory_Response, categories_0_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Child_Ctegory_Response, categories_0_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Child_Ctegory_Response, categories_0_children_0_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Child_Ctegory_Response, categories_0_children_0_alias)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Child_Ctegory_Response, categories_0_children_0_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Child_Ctegory_Response, categories_0_children_0_id)
 