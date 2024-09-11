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

orderHistory = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/OrderHistory/OrderHistory', [('URL') : GlobalVariable.URL
            , ('SITEID') : GlobalVariable.SITEID, ('Authorization') : GlobalVariable.Authorization]))


_v	=	 '_v'
_type	=	 '_type'
id	=	 'id'
name	=	 'name'
c_result_orders_0_order_no	=	 'c_result.orders[0].order_no'
c_result_orders_0_sellerNames	=	 'c_result.orders[0].sellerNames'
c_result_orders_0_edd	=	 'c_result.orders[0].edd'
c_result_orders_0_order_created	=	 'c_result.orders[0].order_created'
c_result_orders_0_products_count	=	 'c_result.orders[0].products_count'
c_result_orders_0_corporate_name	=	 'c_result.orders[0].corporate_name'
c_result_orders_0_order_total	=	 'c_result.orders[0].order_total'
c_result_orders_0_sellerIds	=	 'c_result.orders[0].sellerIds'
c_result_orders_0_storeDetails_ID	=	 'c_result.orders[0].storeDetails.ID'
c_result_orders_0_storeDetails_name	=	 'c_result.orders[0].storeDetails.name'
c_result_orders_0_storeDetails_phone	=	 'c_result.orders[0].storeDetails.phone'
c_result_orders_0_storeDetails_storeEvents	=	 'c_result.orders[0].storeDetails.storeEvents'
c_result_orders_0_storeDetails_storeHours	=	 'c_result.orders[0].storeDetails.storeHours'
c_result_orders_0_storeDetails_logo	=	 'c_result.orders[0].storeDetails.logo'
c_result_orders_0_storeDetails_verticalType	=	 'c_result.orders[0].storeDetails.verticalType'
c_result_orders_0_status	=	 'c_result.orders[0].status'
c_result_order_total_count= 'c_result.order_total_count'
c_result_total_pages = 'c_result.total_pages'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,_v)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,_v)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,_type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,c_result_orders_0_order_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,c_result_orders_0_order_no)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,c_result_orders_0_sellerNames)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,c_result_orders_0_sellerNames)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,c_result_orders_0_edd)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,c_result_orders_0_edd)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,c_result_orders_0_order_created)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,c_result_orders_0_order_created)

CustomKeywords.'totalplay.Common.getNumValueofObject'(orderHistory,c_result_orders_0_products_count)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,c_result_orders_0_corporate_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,c_result_orders_0_corporate_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,c_result_orders_0_order_total)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,c_result_orders_0_order_total)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,c_result_orders_0_sellerIds)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,c_result_orders_0_sellerIds)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,c_result_orders_0_storeDetails_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,c_result_orders_0_storeDetails_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,c_result_orders_0_storeDetails_ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,c_result_orders_0_storeDetails_ID)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,c_result_orders_0_storeDetails_ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,c_result_orders_0_storeDetails_ID)

CustomKeywords.'totalplay.Common.verifyPropertyValueNotEmptyorNotNull'(orderHistory,c_result_orders_0_storeDetails_phone)

CustomKeywords.'totalplay.Common.verifyPropertyValueNotEmptyorNotNull'(orderHistory,c_result_orders_0_storeDetails_storeHours)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,c_result_orders_0_storeDetails_logo)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,c_result_orders_0_storeDetails_logo)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,c_result_orders_0_storeDetails_verticalType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,c_result_orders_0_storeDetails_verticalType)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(orderHistory,c_result_orders_0_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(orderHistory,c_result_orders_0_status)

CustomKeywords.'totalplay.Common.getNumValueofObject'(orderHistory,c_result_order_total_count)
CustomKeywords.'totalplay.Common.getNumValueofObject'(orderHistory,c_result_total_pages)
