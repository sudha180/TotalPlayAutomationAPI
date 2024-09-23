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

FoodOrderHistory = WS.sendRequest(findTestObject('TotalPlay-Food/Food Order History', [('URL') : GlobalVariable.URL]))
CustomKeywords.'totalplay.Common.printResponseinText'(FoodOrderHistory)
WS.verifyResponseStatusCode(FoodOrderHistory, 200)

id='id'
name='name'
c_result_orders='c_result.orders'
c_result='c_result'
c_result_orders0_order_no='c_result.orders[0].order_no'
c_result_orders0_sellerNames='c_result.orders[0].sellerNames'
c_result_orders0_edd='c_result.orders[0].edd'
c_result_orders0_order_created='c_result.orders[0].order_created'
c_result_orders0_productIdsList='c_result.orders[0].productIdsList'
c_result_orders0_products_count='c_result.orders[0].products_count'
c_result_orders0_corporate_name='c_result.orders[0].corporate_name'
c_result_orders0_order_total='c_result.orders[0].order_total'
c_result_orders0_product_info='c_result.orders[0].product_info'
c_result_orders0_sellerIds='c_result.orders[0].sellerIds'
c_result_orders0_product_info0_id='c_result.orders[0].product_info[0].id'
c_result_orders0_product_info0_name='c_result.orders[0].product_info[0].name'
c_result_orders0_product_info0_description='c_result.orders[0].product_info[0].description'
c_result_orders0_storeDetails='c_result.orders[0].storeDetails'
c_result_orders0_storeDetails_ID='c_result.orders[0].storeDetails.ID'
c_result_orders0_storeDetails_name='c_result.orders[0].storeDetails.name'
c_result_orders0_storeDetails_phone='c_result.orders[0].storeDetails.phone'
c_result_orders0_storeDetails_logo='c_result.orders[0].storeDetails.logo'
c_result_orders0_storeDetails_verticalType='c_result.orders[0].storeDetails.verticalType'
c_result_orders0_storeDetails_averageRating='c_result.orders[0].storeDetails.averageRating'
c_result_orders0_status='c_result.orders[0].status'
c_result_orders1_order_no='c_result.orders[1].order_no'
c_result_orders1_sellerNames='c_result.orders[1].sellerNames'
c_result_orders1_edd='c_result.orders[1].edd'
c_result_orders1_order_created='c_result.orders[1].order_created'
c_result_orders1_productIdsList='c_result.orders[1].productIdsList'
c_result_orders1_products_count='c_result.orders[1].products_count'
c_result_orders1_corporate_name='c_result.orders[1].corporate_name'
c_result_orders1_order_total='c_result.orders[1].order_total'
c_result_orders1_sellerIds='c_result.orders[1].sellerIds'
c_result_orders1_product_info='c_result.orders[1].product_info'
c_result_orders1_product_info0_id='c_result.orders[1].product_info[0].id'
c_result_orders1_product_info0_name='c_result.orders[1].product_info[0].name'
c_result_orders1_product_info0_description='c_result.orders[1].product_info[0].description'
c_result_orders1_product_info2_description='c_result.orders[1].product_info[2].description'
c_result_orders1_storeDetails='c_result.orders[1].storeDetails'
c_result_orders1_storeDetails_ID='c_result.orders[1].storeDetails.ID'
c_result_orders1_storeDetails_name='c_result.orders[1].storeDetails.name'
c_result_orders1_storeDetails_phone='c_result.orders[1].storeDetails.phone'
c_result_orders1_storeDetails_logo='c_result.orders[1].storeDetails.logo'
c_result_orders1_storeDetails_verticalType='c_result.orders[1].storeDetails.verticalType'
c_result_orders1_storeDetails_averageRating='c_result.orders[1].storeDetails.averageRating'
c_result_orders1_status='c_result.orders[1].status'
c_result_order_total_count='c_result.order_total_count'
c_result_total_pages='c_result.total_pages'

CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,name)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodOrderHistory,c_result_orders)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodOrderHistory,c_result)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_order_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_sellerNames)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_edd)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_order_created)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodOrderHistory,c_result_orders0_productIdsList)
CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodOrderHistory,c_result_orders0_products_count)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_corporate_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_order_total)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodOrderHistory,c_result_orders0_product_info)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_sellerIds)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_product_info0_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_product_info0_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_product_info0_description)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodOrderHistory,c_result_orders0_storeDetails)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_storeDetails_ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_storeDetails_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_storeDetails_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_storeDetails_logo)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_storeDetails_verticalType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders0_storeDetails_averageRating)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodOrderHistory,c_result_orders0_status)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_order_no)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_sellerNames)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_edd)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_order_created)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodOrderHistory,c_result_orders1_productIdsList)
CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodOrderHistory,c_result_orders1_products_count)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_corporate_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_order_total)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_sellerIds)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodOrderHistory,c_result_orders1_product_info)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_product_info0_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_product_info0_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_product_info0_description)
CustomKeywords.'totalplay.Common.verifyPropertyExist'(FoodOrderHistory,c_result_orders1_storeDetails)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_storeDetails_ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_storeDetails_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_storeDetails_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_storeDetails_logo)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_storeDetails_verticalType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_storeDetails_averageRating)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(FoodOrderHistory,c_result_orders1_status)
CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodOrderHistory,c_result_order_total_count)
CustomKeywords.'totalplay.Common.getNumValueofObject'(FoodOrderHistory,c_result_total_pages)