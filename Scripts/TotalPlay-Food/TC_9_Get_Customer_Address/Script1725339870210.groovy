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

WebUI.callTestCase(findTestCase('TotalPlay-Food/TC_1_Login_Service'), [:], FailureHandling.STOP_ON_FAILURE)

GetAddress_Response = WS.sendRequest(findTestObject('TotalPlay-Food/GetAddresses', [('URL') : GlobalVariable.URL, ('sla_customerId') : GlobalVariable.sla_customerId]))
CustomKeywords.'totalplay.Common.printResponseinText'(GetAddress_Response)

WS.verifyResponseStatusCode(GetAddress_Response, 200)

/*
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

*/

_v	=	'_v'
_type	=	'_type'
count	=	'count'
data_0__type	=	'data[0]._type'
data_0__resource_state	=	'data[0]._resource_state'
data_0_address1	=	'data[0].address1'
data_0_address_id	=	'data[0].address_id'
data_0_city	=	'data[0].city'
data_0_country_code	=	'data[0].country_code'
data_0_creation_date	=	'data[0].creation_date'
data_0_first_name	=	'data[0].first_name'
data_0_full_name	=	'data[0].full_name'
data_0_last_modified	=	'data[0].last_modified'
data_0_last_name	=	'data[0].last_name'
data_0_phone	=	'data[0].phone'
data_0_postal_code	=	'data[0].postal_code'
data_0_preferred	=	'data[0].preferred'
data_0_c_addressupdatedtime	=	'data[0].c_addressupdatedtime'
data_0_c_alias	=	'data[0].c_alias'
data_0_c_brmId	=	'data[0].c_brmId'
data_0_c_crm_address_id	=	'data[0].c_crm_address_id'
data_0_c_dateRegister	=	'data[0].c_dateRegister'
data_0_c_dateUpdate	=	'data[0].c_dateUpdate'
data_0_c_delegation	=	'data[0].c_delegation'
data_0_c_isBilling	=	'data[0].c_isBilling'
data_0_c_isContact	=	'data[0].c_isContact'
data_0_c_isShipping	=	'data[0].c_isShipping'
data_0_c_label	=	'data[0].c_label'
data_0_c_latitude	=	'data[0].c_latitude'
data_0_c_longitude	=	'data[0].c_longitude'
data_0_c_nExt	=	'data[0].c_nExt'
data_0_c_neighborhood	=	'data[0].c_neighborhood'
data_0_c_references	=	'data[0].c_references'
data_0_c_rfc	=	'data[0].c_rfc'
data_0_c_state	=	'data[0].c_state'
data_0_c_status	=	'data[0].c_status'
data_0_c_streetName	=	'data[0].c_streetName'
start	=	'start'
total	=	'total'



CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, _v)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, _v)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, _type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, _type)

CustomKeywords.'totalplay.Common.getNumValueofObject'(GetAddress_Response, count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0__type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0__type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0__resource_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0__resource_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_address1)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_address1)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_city)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_country_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_country_code)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_creation_date)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_first_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_first_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_full_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_full_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_last_modified)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_last_modified)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_last_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_last_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_phone)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_postal_code)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_postal_code)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(GetAddress_Response, data_0_preferred)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_addressupdatedtime)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_addressupdatedtime)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_alias)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_alias)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_brmId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_brmId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_crm_address_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_crm_address_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_dateRegister)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_dateRegister)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_dateUpdate)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_dateUpdate)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_delegation)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_delegation)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_isBilling)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_isBilling)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_isContact)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_isContact)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_isShipping)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_isShipping)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_label)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_latitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_latitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_longitude)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_longitude)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_nExt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_nExt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_neighborhood)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_neighborhood)
//
//CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_references)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_references)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_rfc)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_rfc)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_state)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_status)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetAddress_Response, data_0_c_streetName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetAddress_Response, data_0_c_streetName)

CustomKeywords.'totalplay.Common.getNumValueofObject'(GetAddress_Response, start)
CustomKeywords.'totalplay.Common.getNumValueofObject'(GetAddress_Response, total)
