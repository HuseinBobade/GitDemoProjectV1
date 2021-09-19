package com.scenarios;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FindBrokenLinksInApp {

	public static void main(String[] args) throws InterruptedException, IOException ,MalformedURLException {
		
		//Initiate the driver
		System.setProperty("webdriver.chrome.driver", "E:\\All softwares\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	
		
		//maximize the page
		driver.manage().window().maximize();
		
		//implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Open URL of application
		driver.get("http://www.deadlinkcity.com/");
		
		//Wait
		Thread.sleep(5000);
		
		//Capture links from webpage
		List  <WebElement>links=driver.findElements(By.tagName("a"));
		
		//number of links
		System.out.println("Total Links present in website are "+links.size());
		
		for(int i=0; i<links.size();i++) {
			
			//By Using href attribute we can get URL of required link
			
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			
			URL link=new URL(url);
			
			//Create a connection using url object link
			HttpURLConnection httpcon= (HttpURLConnection) link.openConnection();
			 
			//wait for 2 sec
			Thread.sleep(2000);
			
			//establish connect
			httpcon.connect();
			
			int respcode=httpcon.getResponseCode(); //returns response code , if response code is above 400: it is broken link
			
			if(respcode>=400) {
				
				System.out.println(url+"-"+" is broken link");
			
			}else {
				
				System.out.println(url+"-"+" is valid link");
			}
			
		}
		
		driver.close();
		driver.quit();
		

	}
 
}
