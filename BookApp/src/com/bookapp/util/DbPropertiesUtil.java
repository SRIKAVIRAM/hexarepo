package com.bookapp.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbPropertiesUtil {
	
      public static Properties getProperties() {
    	  
    	  Properties properties = new Properties();
    InputStream inputStream =  DbPropertiesUtil.class
    	               .getClassLoader().getResourceAsStream("jdbc.properties");
	
    
    try {
    	properties.load(inputStream);
    }  catch (IOException e) {
    	//TODO Auto-generated catch block
    	e.printStackTrace();
    }
    return properties;
      }
}