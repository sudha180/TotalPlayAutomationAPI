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
 
Product_Summary_Response=WS.sendRequest(findTestObject('TotalPlay-Shop/Postman/IPTV Services Copy/Product Summary', [('URL') : GlobalVariable.URL]))
 
WS.verifyResponseStatusCode(Product_Summary_Response, 200)
 
CustomKeywords.'totalplay.Common.printResponseinText'(Product_Summary_Response)
 
Response_IdResult	=	 'Response.IdResult'
Response_Result	=	 'Response.Result'
Response_ResultDescription	=	 'Response.ResultDescription'
shippingAddress_id	=	 'shippingAddress.id'
shippingAddress_isDefault	=	 'shippingAddress.isDefault'
shippingAddress_fullName	=	 'shippingAddress.fullName'
shippingAddress_street	=	 'shippingAddress.street'
shippingAddress_zipCode	=	 'shippingAddress.zipCode'
shippingAddress_state	=	 'shippingAddress.state'
shippingAddress_city	=	 'shippingAddress.city'
shippingAddress_phone	=	 'shippingAddress.phone'
shippingAddress_neighborhood_name	=	 'shippingAddress.neighborhood.name'
shippingAddress_next	=	 'shippingAddress.next'
paymentMethod_name	=	 'paymentMethod.name'
paymentMethod_type	=	 'paymentMethod.type'
paymentMethod_images_icon	=	 'paymentMethod.images.icon'
paymentMethod_images_full	=	 'paymentMethod.images.full'
paymentMethod_savedCard_id	=	 'paymentMethod.savedCard.id'
paymentMethod_savedCard_ending	=	 'paymentMethod.savedCard.ending'
paymentMethod_savedCard_ncvv	=	 'paymentMethod.savedCard.ncvv'
paymentMethod_payment_amount	=	 'paymentMethod.payment.amount'
paymentMethod_payment_type	=	 'paymentMethod.payment.type'
paymentMethod_payment_nPayments	=	 'paymentMethod.payment.nPayments'
productDetail_id	=	 'productDetail.id'
productDetail_title	=	 'productDetail.title'
productDetail_rating	=	 'productDetail.rating'
productDetail_inWishlist	=	 'productDetail.inWishlist'
productDetail_description	=	 'productDetail.description'
productDetail_descriptionHtml	=	 'productDetail.descriptionHtml'
productDetail_inStock	=	 'productDetail.inStock'
productDetail_stockAvailable	=	 'productDetail.stockAvailable'
productDetail_seller_id	=	 'productDetail.seller.id'
productDetail_seller_name	=	 'productDetail.seller.name'
productDetail_price_amount	=	 'productDetail.price.amount'
productDetail_price_color	=	 'productDetail.price.color'
productDetail_price_currency	=	 'productDetail.price.currency'
productDetail_price_priceWithDiscountRounded	=	 'productDetail.price.priceWithDiscountRounded'
productDetail_price_priceWithDiscount	=	 'productDetail.price.priceWithDiscount'
productDetail_price_priceHasDiscount	=	 'productDetail.price.priceHasDiscount'
productDetail_promotion_typePromotion	=	 'productDetail.promotion.typePromotion'
productDetail_promotion_discount	=	 'productDetail.promotion.discount'
productDetail_promotion_exipiration	=	 'productDetail.promotion.exipiration'
productDetail_promotion_disccountPrice	=	 'productDetail.promotion.disccountPrice'
productDetail_promotion_quantityDisccount	=	 'productDetail.promotion.quantityDisccount'
productDetail_media_video	=	 'productDetail.media.video'
productDetail_delivery_date	=	 'productDetail.delivery.date'
productDetail_delivery_address	=	 'productDetail.delivery.address'
summary_id	=	 'summary.id'
summary_shipping	=	 'summary.shipping'
summary_shippingType	=	 'summary.shippingType'
summary_discounts	=	 'summary.discounts'
summary_productPrice	=	 'summary.productPrice'
summary_total	=	 'summary.total'
attributes_0_ID	=	 'attributes[0].ID'
attributes_0_name	=	 'attributes[0].name'
attributes_0_attributes_0_label	=	 'attributes[0].attributes[0].label'
attributes_0_attributes_0_value	=	 'attributes[0].attributes[0].value'
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, Response_IdResult)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, Response_IdResult)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, Response_Result)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, Response_Result)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, Response_ResultDescription)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, Response_ResultDescription)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, shippingAddress_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, shippingAddress_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, shippingAddress_isDefault)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, shippingAddress_isDefault)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, shippingAddress_fullName)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, shippingAddress_fullName)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, shippingAddress_street)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, shippingAddress_street)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, shippingAddress_zipCode)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, shippingAddress_zipCode)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, shippingAddress_state)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, shippingAddress_state)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, shippingAddress_city)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, shippingAddress_city)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, shippingAddress_phone)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, shippingAddress_phone)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, shippingAddress_neighborhood_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, shippingAddress_neighborhood_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, shippingAddress_next)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, shippingAddress_next)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, paymentMethod_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, paymentMethod_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, paymentMethod_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, paymentMethod_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, paymentMethod_images_icon)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, paymentMethod_images_icon)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, paymentMethod_images_full)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, paymentMethod_images_full)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, paymentMethod_savedCard_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, paymentMethod_savedCard_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, paymentMethod_savedCard_ending)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, paymentMethod_savedCard_ending)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, paymentMethod_savedCard_ncvv)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, paymentMethod_savedCard_ncvv)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(Product_Summary_Response, paymentMethod_payment_amount)
CustomKeywords.'totalplay.Common.getNumValueofObject'(Product_Summary_Response, paymentMethod_payment_nPayments)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, paymentMethod_payment_type)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, paymentMethod_payment_type)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_title)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_title)
 
CustomKeywords.'totalplay.Common.getDecimalValueofObject'(Product_Summary_Response, productDetail_rating)
CustomKeywords.'totalplay.Common.getBooleanValueofObject'(Product_Summary_Response, productDetail_inStock)
 
CustomKeywords.'totalplay.Common.getNumValueofObject'(Product_Summary_Response, productDetail_stockAvailable)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_descriptionHtml)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_descriptionHtml)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_description)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_description)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_seller_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_seller_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_seller_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_seller_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_price_amount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_price_amount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_price_color)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_price_color)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_price_currency)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_price_currency)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_price_priceWithDiscountRounded)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_price_priceWithDiscountRounded)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_price_priceWithDiscount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_price_priceWithDiscount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_price_priceHasDiscount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_price_priceHasDiscount)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_Summary_Response, productDetail_promotion_typePromotion)
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_Summary_Response, productDetail_promotion_discount)
 
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_Summary_Response, productDetail_promotion_exipiration)
CustomKeywords.'totalplay.Common.verifyPropertyValueEmptyString'(Product_Summary_Response, productDetail_media_video)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_promotion_disccountPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_promotion_disccountPrice)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_promotion_quantityDisccount)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_promotion_quantityDisccount)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_delivery_date)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_delivery_date)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, productDetail_delivery_address)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, productDetail_delivery_address)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, summary_id)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, summary_id)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, summary_shipping)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, summary_shipping)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, summary_shippingType)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, summary_shippingType)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, summary_discounts)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, summary_discounts)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, summary_productPrice)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, summary_productPrice)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, summary_total)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, summary_total)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, attributes_0_ID)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, attributes_0_ID)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, attributes_0_name)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, attributes_0_name)
 
CustomKeywords.'totalplay.Common.verifyPropertyExist'(Product_Summary_Response, attributes_0_attributes_0_label)
CustomKeywords.'totalplay.Common.verifyPropertyValueExist'(Product_Summary_Response, attributes_0_attributes_0_label)
 