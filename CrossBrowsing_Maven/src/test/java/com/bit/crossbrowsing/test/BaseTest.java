package com.bit.crossbrowsing.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {
	WebDriver dr;
//	@Before
//	public void start() throws InterruptedException, IOException
//	{
//		FileInputStream f = new FileInputStream("config.properties");
//		Properties p = new Properties();
//		p.load(f);
//		
//		String x = p.getProperty("browser");
//		String y = p.getProperty("runMode");
//		
//		if(x.equals("Firefox"))
//		{
//			if(y.equals("local"))
//			{
//				System.setProperty("webdriver.gecko.driver", "C:\\Users\\tanzi\\Desktop\\driver\\geckodriver.exe");
//				dr = new FirefoxDriver();
//			}
//			else if(y.equals("remote"))
//			{
//				System.out.println("ran remotely");
//			}
//		}
//		else if(x.equals("Chrome"))
//		{
//			if(y.equals("local"))
//			{
//				System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanzi\\Desktop\\driver\\chromedriver.exe");
//				dr = new ChromeDriver();
//			}
//			else if(y.equals("remote"))
//			{
//				System.out.println("ran remotely");
//			}
//		}
//		else if(x.equals("IE"))
//		{
//			if(y.equals("local"))
//			{
//				System.setProperty("webdriver.ie.driver", "C:\\Users\\tanzi\\Desktop\\driver\\IEDriverServer.exe");
//				dr = new InternetExplorerDriver();
//			}
//			else if(y.equals("remote"))
//			{
//				System.out.println("ran remotely");
//			}
//		}	
//		else
//		{
//			dr=new FirefoxDriver();
//		}
//		
//		dr.get("https://www.eshopper24.com/");
//		Thread.sleep(3000);
//	}
	@Before
	public void start() throws InterruptedException
	{
		String x = System.getProperty("browser");
		String y = System.getProperty("runMode");
		
		if(x.equals("Firefox"))
		{
			if(y.equals("local"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\tanzi\\Desktop\\driver\\geckodriver.exe");
				dr = new FirefoxDriver();
				System.out.println("God help me");
			}
			else if(y.equals("remote"))
			{
				System.out.println("ran remotely");
			}
		}
		else if(x.equals("Chrome"))
		{
			if(y.equals("local"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanzi\\Desktop\\driver\\chromedriver.exe");
				dr = new ChromeDriver();
			}
			else if(y.equals("remote"))
			{
				System.out.println("ran remotely");
			}
		}
		else if(x.equals("IE"))
		{
			if(y.equals("local"))
			{
				System.setProperty("webdriver.ie.driver", "C:\\Users\\tanzi\\Desktop\\driver\\IEDriverServer.exe");
				dr = new InternetExplorerDriver();
			}
			else if(y.equals("remote"))
			{
				System.out.println("ran remotely");
			}
		}	
		else
		{
			dr=new FirefoxDriver();
		}
		
		dr.get("http://www.eshopper24.com");
		Thread.sleep(3000);
	}



	@After
	public void close()
	{
		dr.quit();
	}
}