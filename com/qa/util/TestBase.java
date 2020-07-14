package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop; 
	
	public TestBase() {
		
		try {
			
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Selenium Training\\Cucumber Framework\\BDD_Framework_FreeCRMAps\\src\\main\\java\\com\\qa\\config\\config.properties");
					
				prop.load(fis);	
			
		}  catch (IOException e) {
			
			e.getMessage();
		}
		
		
		
	}

}
