
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.ResponseObject

import java.lang.Double



def static "totalplay.Common.createNewUser"(
    	int age	
     , 	String username	
     , 	String password	
     , 	String gender	
     , 	int expectedStatus	) {
    (new totalplay.Common()).createNewUser(
        	age
         , 	username
         , 	password
         , 	gender
         , 	expectedStatus)
}


def static "totalplay.Common.findUserById"(
    	int id	
     , 	int age	
     , 	String username	
     , 	String password	
     , 	String gender	
     , 	int expectedStatus	) {
    (new totalplay.Common()).findUserById(
        	id
         , 	age
         , 	username
         , 	password
         , 	gender
         , 	expectedStatus)
}


def static "totalplay.Common.verifyPropertyExist"(
    	ResponseObject Response	
     , 	String JsonPath	) {
    (new totalplay.Common()).verifyPropertyExist(
        	Response
         , 	JsonPath)
}


def static "totalplay.Common.verifyPropertyExistOptional"(
    	ResponseObject Response	
     , 	String JsonPath	) {
    (new totalplay.Common()).verifyPropertyExistOptional(
        	Response
         , 	JsonPath)
}


def static "totalplay.Common.verifyPropertyEmpty"(
    	ResponseObject Response	
     , 	String JsonPath	) {
    (new totalplay.Common()).verifyPropertyEmpty(
        	Response
         , 	JsonPath)
}


def static "totalplay.Common.verifyPropertyValueExist"(
    	ResponseObject Response	
     , 	String JsonPath	) {
    (new totalplay.Common()).verifyPropertyValueExist(
        	Response
         , 	JsonPath)
}


def static "totalplay.Common.verifyPropertyValueNotEmpty"(
    	ResponseObject Response	
     , 	String JsonPath	) {
    (new totalplay.Common()).verifyPropertyValueNotEmpty(
        	Response
         , 	JsonPath)
}


def static "totalplay.Common.verifyPropertyValueEmptyString"(
    	ResponseObject Response	
     , 	String JsonPath	) {
    (new totalplay.Common()).verifyPropertyValueEmptyString(
        	Response
         , 	JsonPath)
}


def static "totalplay.Common.verifyPropertyValueEmpty"(
    	ResponseObject Response	
     , 	String JsonPath	) {
    (new totalplay.Common()).verifyPropertyValueEmpty(
        	Response
         , 	JsonPath)
}


def static "totalplay.Common.verifyPropertyValueNotEmptyorNotNull"(
    	ResponseObject Response	
     , 	String JsonPath	) {
    (new totalplay.Common()).verifyPropertyValueNotEmptyorNotNull(
        	Response
         , 	JsonPath)
}


def static "totalplay.Common.verifyIntegerPropertyExist"(
    	ResponseObject Response	
     , 	Double JsonPath	) {
    (new totalplay.Common()).verifyIntegerPropertyExist(
        	Response
         , 	JsonPath)
}


def static "totalplay.Common.getDecimalValueofObject"(
    	ResponseObject Response	
     , 	String JsonPath	) {
    (new totalplay.Common()).getDecimalValueofObject(
        	Response
         , 	JsonPath)
}


def static "totalplay.Common.getBooleanValueofObject"(
    	ResponseObject Response	
     , 	String JsonPath	) {
    (new totalplay.Common()).getBooleanValueofObject(
        	Response
         , 	JsonPath)
}


def static "totalplay.Common.getNumValueofObject"(
    	ResponseObject Response	
     , 	String JsonPath	) {
    (new totalplay.Common()).getNumValueofObject(
        	Response
         , 	JsonPath)
}


def static "totalplay.Common.printResponseinText"(
    	ResponseObject Response	) {
    (new totalplay.Common()).printResponseinText(
        	Response)
}


def static "totalplay.Common.verifyValueInObject"(
    	ResponseObject Response	
     , 	String JsonPath	) {
    (new totalplay.Common()).verifyValueInObject(
        	Response
         , 	JsonPath)
}
