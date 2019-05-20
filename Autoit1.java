package com.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autoit1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.tinyupload.com/");
	      driver.findElement(By.xpath("//input[@type='file']")).click();
	      Thread.sleep(2000);
	      Runtime.getRuntime().exec("C:\\Users\\Pratik\\Desktop\\autoit\\filenew.exe");

	
		
	}

}
