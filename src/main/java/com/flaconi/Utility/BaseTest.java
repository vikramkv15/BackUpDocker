package com.flaconi.Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
	
	static WebDriver driver;
	public static WebDriver initiateDriver() throws  InterruptedException, MalformedURLException{
	/*String drivePath = System.getProperty("user.dir")+PropertyManager.getInstance().getdriverPath();
		
	System.setProperty("webdriver.chrome.driver",drivePath);
	ChromeOptions options= new ChromeOptions();
	Boolean headlessvalue= Boolean.valueOf(PropertyManager.getInstance().getHeadlessValue());
	options.setHeadless(headlessvalue);*/
		DesiredCapabilities dc = DesiredCapabilities.chrome();

        String host = System.getProperty("seleniumHubHost");
        
        driver = new RemoteWebDriver(new URL("http://" + host + ":4444/wd/hub"), dc);
        
	driver.manage().window().maximize();
	return driver;
	
	}
	
}
