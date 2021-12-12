package com.firstmaven.SeleniumBasicPGMS;

import java.io.*;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipKart_Login {
	@Test
	public void Login() throws InterruptedException, IOException
	{
	   File src=new File("D:\\#Amit_WorkSpace\\com.firstmaven.Test\\ObjectRepo.properties");
	   FileInputStream fis=new FileInputStream(src);
	   Properties pro=new Properties();
	   pro.load(fis);
	   
		System.setProperty("webdriver.chrome.driver",pro.getProperty("DriverPath"));
		WebDriver driver=new ChromeDriver();
		driver.get(pro.getProperty("BaseUrl"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
	}

}
