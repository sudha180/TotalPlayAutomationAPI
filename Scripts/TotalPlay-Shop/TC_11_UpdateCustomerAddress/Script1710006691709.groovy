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

WebUI.callTestCase(findTestCase('TotalPlay-Shop/TC_1_InterfaceLogin'), [:], FailureHandling.STOP_ON_FAILURE)

GetAddress = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Address/Get Customer Address', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
            , ('sla_customerId') : GlobalVariable.sla_customerId]))

Address_Id = 'data[0].address_id'

String address_id = WS.getElementPropertyValue(GetAddress, Address_Id)

KeywordUtil.logInfo(address_id)

GlobalVariable.address_id = address_id

UpdateAddress_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Address/Update Customer Address', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID, ('sla_customerId') : GlobalVariable.sla_customerId, ('address_id') : GlobalVariable.address_id]))

WS.verifyResponseStatusCode(UpdateAddress_Response, 200)

type = '_type'
address1 = 'address1'
address_id = 'address_id'
city = 'city'
company_name = 'company_name'
country_code = 'country_code'
creation_date = 'creation_date'
first_name = 'first_name'
full_name = 'full_name'
last_modified = 'last_modified'
last_name = 'last_name'
phone = 'phone'
postal_code = 'postal_code'
preferred = 'preferred'
c_alias = 'c_alias'
c_brmId = 'c_brmId'
c_crm_address_id = 'c_crm_address_id'
c_isBilling = 'c_isBilling'
c_isContact = 'c_isContact'
c_isShipping = 'c_isShipping'
c_latitude = 'c_latitude'
c_longitude = 'c_longitude'
c_state = 'c_status'
c_status = 'c_status'
c_streetName = 'c_streetName'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, city)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, company_name)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, company_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, creation_date)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, last_modified)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, postal_code)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateAddress_Response, preferred)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, preferred)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, c_brmId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, c_brmId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, c_crm_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, c_crm_address_id)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateAddress_Response, c_isBilling)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, c_isBilling)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateAddress_Response, c_isContact)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, c_isContact)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateAddress_Response, c_isShipping)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, c_isShipping)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateAddress_Response, c_latitude)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, c_latitude)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateAddress_Response, c_longitude)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, c_state)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(UpdateAddress_Response, c_status)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, c_status)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(UpdateAddress_Response, c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(UpdateAddress_Response, c_streetName)

GetAddresss = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Address/Get Customer Address', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
	, ('sla_customerId') : GlobalVariable.sla_customerId]))

postal_code = 'data[0].postal_code'

String postal_code = WS.getElementPropertyValue(GetAddresss, postal_code)
println(postal_code)
if(postal_code == GlobalVariable.postal_code) {
	KeywordUtil.markPassed("Address updated")
	}
else {
	KeywordUtil.markFailed("Address not updated")
}