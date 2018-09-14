package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWebdriver {
	
	private static SeleniumWebdriver seleniumWebdriver;
	
	private static WebDriver _driver;
	private static WebDriverWait _waitDriver;
	private final static int TIMEOUT = 30;
	private final static int PAGE_LOAD_TIMEOUT = 50;
	
	private SeleniumWebdriver()
	{
		_driver = new ChromeDriver();
		_driver.manage().window().maximize();
		
		_driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		_driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
	public static void openPage(String url)
	{
		_driver.get(url);
	}
	
	public static WebDriver getDriver()
	{
		return _driver;
	}
	
	public static void setUpDriver()
	{
		if(seleniumWebdriver == null)
		{
			seleniumWebdriver = new SeleniumWebdriver();
		}
	}
	
	public static void tearDown()
	{
		if(_driver != null) 
		{
			_driver.close();
			_driver.quit();
		}
		seleniumWebdriver = null;
	}
}
