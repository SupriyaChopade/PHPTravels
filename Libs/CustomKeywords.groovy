
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


def static "com.Utilities.CommonUtilities.login"(
    	String username	
     , 	String password	) {
    (new com.Utilities.CommonUtilities()).login(
        	username
         , 	password)
}

def static "com.Utilities.CommonUtilities.launchSite"() {
    (new com.Utilities.CommonUtilities()).launchSite()
}

def static "com.Utilities.CommonUtilities.SignUp"(
    	String fName	
     , 	String lName	
     , 	String phone	
     , 	String email	
     , 	String password	) {
    (new com.Utilities.CommonUtilities()).SignUp(
        	fName
         , 	lName
         , 	phone
         , 	email
         , 	password)
}

def static "com.Utilities.CommonUtilities.logout"() {
    (new com.Utilities.CommonUtilities()).logout()
}
