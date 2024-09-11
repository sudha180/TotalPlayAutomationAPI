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

GetAddress_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Address/Get Customer Address', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID, ('sla_customerId') : GlobalVariable.sla_customerId]))

WS.verifyResponseStatusCode(GetAddress_Response,200)
CustomKeywords.'totalplay.Common.printResponseinText'(GetAddress_Response)

type = '_type'
address1 = 'data[0].address1'
address_id = 'data[0].address_id'
city = 'data[0].city'
company_name = 'data[0].company_name'
country_code = 'data[0].country_code'
creation_date = 'data[0].creation_date'
full_name = 'data[0].full_name'
last_modified = 'data[0].last_modified'
last_name = 'data[0].last_name'
phone = 'data[0].phone'
postal_code = 'data[0].postal_code'
preferred = 'data[0].preferred'
c_alias = 'data[0].c_alias'
c_brmId = 'data[0].c_brmId'
c_crm_address_id = 'data[0].c_crm_address_id'
c_isBilling = 'data[0].c_isBilling'
c_isContact = 'data[0].c_isContact'
c_isShipping = 'data[0].c_isShipping'
c_label = 'data[0].c_label'
c_latitude = 'data[0].c_latitude'
c_longitude = 'data[0].c_longitude'
c_streetName = 'data[0].c_streetName'
c_state = 'data[0].c_state'
total = 'total'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, city)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, company_name)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, company_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, creation_date)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, last_modified)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, postal_code)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(GetAddress_Response, preferred)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, preferred)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, c_brmId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, c_brmId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, c_crm_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, c_crm_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, c_isBilling)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, c_isBilling)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, c_isContact)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, c_isContact)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, c_isShipping)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, c_isShipping)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, c_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, c_streetName)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, c_state)

CustomKeywords.'totalplay.Common.getNumValueofObject'(GetAddress_Response, total)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, total)




