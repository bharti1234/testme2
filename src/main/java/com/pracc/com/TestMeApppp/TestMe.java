package com.pracc.com.TestMeApppp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestMe {
	
	@Test
	public void Testt()
	{
		System.setProperty("webdriver.chrome.driver","D:\\cucumber files\\Chrome\\chromedriver.exe" );
		WebDriver c=new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		
		c.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		c.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
		c.findElement(By.name("userName")).sendKeys("bharti5");
		c.findElement(By.name("firstName")).sendKeys("bhartii");
		c.findElement(By.name("lastName")).sendKeys("aroraa");
		c.findElement(By.name("password")).sendKeys("password12");
		c.findElement(By.name("confirmPassword")).sendKeys("password12");
		
		c.findElement(By.xpath(".//*[@value='Female']")).click();
		
		c.findElement(By.name("emailAddress")).sendKeys("info@testmeapp.com");
		c.findElement(By.name("mobileNumber")).sendKeys("9898912345");
		c.findElement(By.name("dob")).sendKeys("11/14/1196");
		c.findElement(By.name("address")).sendKeys("123, Velachery Main Road\r\nChennai,India\r\n");
		
		Select select = new Select(c.findElement(By.name("securityQuestion")));
		select.selectByVisibleText("What is your Birth Place?");
		
		c.findElement(By.name("answer")).sendKeys("Chennai");
		
		c.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
