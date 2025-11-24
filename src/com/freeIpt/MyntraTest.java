package com.freeIpt;



import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraTest {

	static WebDriver driver;
	static String text;
	static List<Integer> list=new ArrayList<Integer>();
	
	
	public static void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-sports-shoes");
	}
	
	public static void getallPrice() {
	
	List<WebElement> allPrice = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));
	for (WebElement price : allPrice) {
		text = price.getText();
		System.out.println(text);
		String replaceAll = text.replaceAll("Rs. ","");
		int parseInt = Integer.parseInt(replaceAll);
		list.add(parseInt);
	}
	System.out.println(list);

	}
	
	public static void getMinPrice() {
		
		Integer min = Collections.min(list);
		System.out.println(min);
	}
	
	public static void getMaxPrice() 
	{
		Integer max = Collections.max(list);
		System.out.println(max);
	}
	
	public static void captureScreenshot(String fileName) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\Gayathri Vignesh\\eclipse-workspace\\freeIpt\\screenshots"+   +".png");
		
	}
	
	public static void cssSelector() {
		
		String text = driver.findElement(By.cssSelector("span[class='product-discountedPrice']")).getText();
//		driver.findElement(By.cssSelector("div#sec-overlay"))
		System.out.println(text);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.)
	}
	public static void main(String[] args) {
		launchBrowser();
//		getallPrice();
//		getMinPrice();
//		getMaxPrice();
		
//		captureScreenshot("mynta");
		
		cssSelector();
		
	}

}
