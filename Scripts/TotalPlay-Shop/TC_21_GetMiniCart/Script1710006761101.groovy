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

GetMiniCart_Response = WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/Cart/Get Mini Cart', [('URL') : GlobalVariable.URL, ('SITEID') : GlobalVariable.SITEID
            , ('sla_customerId') : GlobalVariable.sla_customerId]))
WS.verifyResponseStatusCode(GetMiniCart_Response, 200)

_type = 'baskets[0]._type'
basket_id = 'baskets[0].basket_id'
creation_date = 'baskets[0].creation_date'
order_total = 'baskets[0].order_total'
product_sub_total = 'baskets[0].product_sub_total'
product_total = 'baskets[0].product_total' 
shipping_total = 'baskets[0].shipping_total' 
shipping_total_tax = 'baskets[0].shipping_total_tax'
c_corporateImgUrl = 'baskets[0].c_corporateImgUrl' 
c_corporateColorCode = 'baskets[0].c_corporateColorCode'
name = 'baskets[0].c_currentBasket.name' 
productCount = 'baskets[0].c_currentBasket.productCount'
ID = 'baskets[0].c_currentBasket.cartItems[0].ID'
productID = 'baskets[0].c_currentBasket.cartItems[0].productID' 
isOnDemandStoreItem = 'baskets[0].c_currentBasket.cartItems[0].isOnDemandStoreItem'
alt = 'baskets[0].c_currentBasket.cartItems[0].productImage[0].alt'
url = 'baskets[0].c_currentBasket.cartItems[0].productImage[0].url'
title = 'baskets[0].c_currentBasket.cartItems[0].productImage[0].title'
sellerId = 'baskets[0].c_currentBasket.cartItems[0].sellerId'
quantity = 'baskets[0].c_currentBasket.cartItems[0].quantity'
name = 'baskets[0].c_currentBasket.cartItems[0].name' 

c_SellerList_name = 'baskets[0].c_SellerList[0].name'
c_SellerList_corporateImgURL = 'baskets[0].c_SellerList[0].corporateImgURL'
c_SellerList_corporateColorCode = 'baskets[0].c_SellerList[0].corporateColorCode'
c_SellerList_productsCount = 'baskets[0].c_SellerList[0].productsCount'
c_SellerList_productID = 'baskets[0].c_SellerList[0].cartItems[0].productID'
c_SellerList_sellerId = 'baskets[0].c_SellerList[0].cartItems[0].sellerId'
c_SellerList_isOnDemandStoreItem = 'baskets[0].c_SellerList[0].cartItems[0].isOnDemandStoreItem'
c_SellerList_alt = 'baskets[0].c_SellerList[0].cartItems[0].productImage[0].alt'
c_SellerList_url = 'baskets[0].c_SellerList[0].cartItems[0].productImage[0].url'
c_SellerList_title = 'baskets[0].c_SellerList[0].cartItems[0].productImage[0].title'
c_SellerList_quantity = 'baskets[0].c_SellerList[0].cartItems[0].quantity'
c_SellerList_name = 'baskets[0].c_SellerList[0].cartItems[0].name'
c_SellerList_total = 'total'

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, _type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, _type)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, basket_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, basket_id)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, creation_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, creation_date)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(GetMiniCart_Response, order_total)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, order_total)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(GetMiniCart_Response, product_sub_total)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, product_sub_total)

CustomKeywords.'totalplay.Common.getDecimalValueofObject'(GetMiniCart_Response, product_total)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, product_total)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(GetMiniCart_Response, shipping_total)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, shipping_total)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(GetMiniCart_Response, shipping_total_tax)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, shipping_total_tax)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, c_corporateImgUrl)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_corporateImgUrl)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, c_corporateColorCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_corporateColorCode)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, name)

CustomKeywords.'totalplay.Common.getNumValueofObject'(GetMiniCart_Response, productCount)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, productCount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, ID)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, productID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, productID)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(GetMiniCart_Response, isOnDemandStoreItem)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, isOnDemandStoreItem)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, alt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, title)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, sellerId)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, sellerId)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, quantity)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, quantity)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, c_SellerList_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_SellerList_name)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, c_SellerList_corporateImgURL)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_SellerList_corporateImgURL)

CustomKeywords.'totalplay.Common.getBooleanValueofObject'(GetMiniCart_Response, c_SellerList_corporateColorCode)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_SellerList_corporateColorCode)

CustomKeywords.'totalplay.Common.getNumValueofObject'(GetMiniCart_Response, c_SellerList_productsCount)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_SellerList_productsCount)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, c_SellerList_productID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_SellerList_productID)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, c_SellerList_sellerId)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_SellerList_sellerId)

//CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, c_SellerList_isOnDemandStoreItem)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_SellerList_isOnDemandStoreItem)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, c_SellerList_alt)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_SellerList_alt)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, c_SellerList_url)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_SellerList_url)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, c_SellerList_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_SellerList_title)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, c_SellerList_quantity)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_SellerList_quantity)

CustomKeywords.'totalplay.Common.verifyPropertyExist'(GetMiniCart_Response, c_SellerList_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_SellerList_name)

CustomKeywords.'totalplay.Common.getNumValueofObject'(GetMiniCart_Response, c_SellerList_total)
//CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(GetMiniCart_Response, c_SellerList_total)

