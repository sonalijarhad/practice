package com.autoit;

import java.io.IOException;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIt {

	public static void main(String[] args) throws Exception {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Users/Pratik/Desktop/fileupload.html");
      driver.findElement(By.xpath("//input[@type='file']")).click();
      Thread.sleep(2000);
      Runtime.getRuntime().exec("C:\\Users\\Pratik\\Desktop\\autoit\\fileupload.exe");
      
	}

}
