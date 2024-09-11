package totalplay

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import groovy.json.JsonOutput as JsonOutput
import static groovy.test.GroovyAssert.shouldFail
import static groovy.test.GroovyAssert.assertNotNull


import groovy.json.JsonSlurper

public class Common {

	public static JsonSlurper jsonSlurper = new JsonSlurper()

	@Keyword
	def int createNewUser(int age, String username, String password, String gender, int expectedStatus) {
		def response = WS.sendRequestAndVerify(findTestObject("Object Repository/TotalPlay-Shop/POST a new user",
				["age": age, "username": username, "password": password, "gender": gender]))

		def jsonResponse = jsonSlurper.parseText(response.getResponseText())
		return jsonResponse.id
	}

	@Keyword
	def static void findUserById(int id, int age, String username, String password, String gender, int expectedStatus) {
		WS.sendRequestAndVerify(findTestObject('Object Repository/TotalPlay-Shop/GET user by id', [('id') : id]))
	}
	//verify property exist in response
	@Keyword
	def verifyPropertyExist(ResponseObject Response, String JsonPath) {

		//WS.verifyElementsCount(SellerPDPResponse, 'c_result.pages[0].regions[5].components[0].custom.products[0].id', 1);
		int PropertyCount = WS.getElementsCount(Response, JsonPath);
		assert PropertyCount>0
		//WS.getElementPropertyValue(SellerPDPResponse, 'c_result.pages[0].regions[5].components[0].custom.products[0].id')
		//String propertyValue = WS.getElementPropertyValue(Response, JsonPath, FailureHandling.STOP_ON_FAILURE)
		//assert propertyValue!=null & propertyValue !=''
	}
	@Keyword
	def verifyPropertyExistOptional(ResponseObject Response, String JsonPath) {

		//WS.verifyElementsCount(SellerPDPResponse, 'c_result.pages[0].regions[5].components[0].custom.products[0].id', 1);
		int PropertyCount = WS.getElementsCount(Response, JsonPath);
		assert PropertyCount>0
		if(PropertyCount <=0) {
			KeywordUtil.markWarning("The number is not greater than 5. Your input: " + PropertyCount)
		}
		//WS.getElementPropertyValue(SellerPDPResponse, 'c_result.pages[0].regions[5].components[0].custom.products[0].id')
		//String propertyValue = WS.getElementPropertyValue(Response, JsonPath, FailureHandling.STOP_ON_FAILURE)
		//assert propertyValue!=null & propertyValue !=''
	}
	@Keyword
	def verifyPropertyEmpty(ResponseObject Response, String JsonPath) {
		if(JsonPath.isEmpty()) {
			println("emptyObject")
		}
		else {
			println("object is not empty")
		}
		//assert (WS.getElementsCount(Response, JsonPath)).isEmptyObject()
		//WS.verifyElementsCount(SellerPDPResponse, 'c_result.pages[0].regions[5].components[0].custom.products[0].id', 1);
		//int PropertyCount = WS.getElementsCount(Response, JsonPath);
		//assert PropertyCount==0
		/*
		 Object isObjectEmpty = (objectName) => {
		 return JSON.stringify(objectName) === "{}";
		 };*/

		//  console.log(isObjectEmpty(userDetails)); // false
		// console.log(isObjectEmpty(JsonPath)); // true
		//WS.getElementPropertyValue(SellerPDPResponse, 'c_result.pages[0].regions[5].components[0].custom.products[0].id')
		//String propertyValue = WS.getElementPropertyValue(Response, JsonPath, FailureHandling.STOP_ON_FAILURE)
		//assert propertyValue!=null & propertyValue !=''
	}
	//verify element property is not null or not empty or not 0
	@Keyword
	def verifyPropertyValueExist(ResponseObject Response, String JsonPath) {
		def propertyValue = WS.getElementPropertyValue(Response, JsonPath)

		KeywordUtil.logInfo(propertyValue)
		assert propertyValue!=null | propertyValue !='' |  propertyValue !=0
	}
	//verify element property is not empty
	@Keyword
	def verifyPropertyValueNotEmpty(ResponseObject Response, String JsonPath) {
		def propertyValue = WS.getElementPropertyValue(Response, JsonPath)

		KeywordUtil.logInfo(propertyValue)
		assert propertyValue !=''
	}
	//verify element property is not empty
	@Keyword
	def verifyPropertyValueEmptyString(ResponseObject Response, String JsonPath) {
		def propertyValue = WS.getElementPropertyValue(Response, JsonPath)

		KeywordUtil.logInfo(propertyValue)
		assert propertyValue ==''
	}

	//
	@Keyword
	def verifyPropertyValueEmpty(ResponseObject Response, String JsonPath) {
		def propertyValue = WS.getElementPropertyValue(Response, JsonPath)

		KeywordUtil.logInfo(propertyValue)
		assert propertyValue =='' | propertyValue!=''
	}
	//verify element property is not null or not empty
	@Keyword
	def verifyPropertyValueNotEmptyorNotNull(ResponseObject Response, String JsonPath) {
		def propertyValue = WS.getElementPropertyValue(Response, JsonPath)

		KeywordUtil.logInfo(propertyValue)
		assert propertyValue!=null | propertyValue !=''
	}
	@Keyword
	def verifyIntegerPropertyExist(ResponseObject Response, Double JsonPath) {

		//WS.verifyElementsCount(SellerPDPResponse, 'c_result.pages[0].regions[5].components[0].custom.products[0].id', 1);
		int PropertyCount = WS.getElementsCount(Response, JsonPath);
		assert PropertyCount>0
		//WS.getElementPropertyValue(SellerPDPResponse, 'c_result.pages[0].regions[5].components[0].custom.products[0].id')
		//String propertyValue = WS.getElementPropertyValue(Response, JsonPath, FailureHandling.STOP_ON_FAILURE)
		//assert propertyValue!=null & propertyValue !=''
	}
	@Keyword
	def getDecimalValueofObject(ResponseObject Response, String JsonPath) {
		Double DecimalValue = WS.getElementPropertyValue(Response, JsonPath.toString())
		println(DecimalValue)
	}

	@Keyword
	def getBooleanValueofObject(ResponseObject Response, String JsonPath) {
		Boolean booleanValue = WS.getElementPropertyValue(Response, JsonPath.toString())
		println(booleanValue)
	}
	@Keyword
	def getNumValueofObject(ResponseObject Response, String JsonPath) {
		Integer intValue = WS.getElementPropertyValue(Response, JsonPath.toString())
		println(intValue)
	}
	@Keyword
	def printResponseinText(ResponseObject Response) {
		//def responseText = Response.getResponseText()
		def responseText = Response.getResponseText()
		//Double DecimalValue = WS.getElementPropertyValue(Response, JsonPath.toString())
		//println(DecimalValue)
		println(JsonOutput.println(responseText))
	}
	@Keyword
	def verifyValueInObject(ResponseObject Response, String JsonPath) {
		String ObjectValue = WS.getElementPropertyValue(Response, JsonPath)
		KeywordUtil.logInfo(ObjectValue)
		if(ObjectValue!=null) {
			KeywordUtil.markPassed("value is present")
		}
		else {
			KeywordUtil.markFailed("value is not present")
		}
	}
}


