package com.freeIpt;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart {
	
	static WebDriver driver;

	public static void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
	}
	
	
	public static void ScreenShot() throws IOException, AWTException {
		
//		TakesScreenshot ts=(TakesScreenshot) driver;			//normal practice
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dest=new File(".//screenshots/Flipkart.png");
//		FileHandler.copy(src, dest);
		
		Date date=new Date();
		
		System.out.println(date);
		
		String date1 = date.toString().replace(" ","_").replace(":","_");
//		
//		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(src, new File(".//screenshots"+date1 +".png"));
//		
		
		Robot robot=new Robot();
		Rectangle rectangle=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage screenCapture = robot.createScreenCapture(rectangle);
		File dest=new File(".//screenshots"+date1+".png");
		ImageIO.write(screenCapture,"png", dest);
		
	}
	
	public static void tableCheck() {
		
//		List<WebElement> element1 = driver.findElements(By.xpath("(//table)[3]/tbody/tr/td"));
//		for (WebElement data : element1) {
//			System.out.println(data.getText());
//		}
		
//		List<WebElement> element2 = driver.findElements(By.xpath("(//table)[3]/tbody/tr[1]/td"));
//		for (WebElement rowdata : element2) {
//			System.out.print(rowdata.getText()+" ");
//		}
		
//		List<WebElement> element3 = driver.findElements(By.xpath("(//table)[3]/tbody/tr/td[2]"));
//		for (WebElement colData : element3) {
//			System.out.println(colData.getText());
//		}
		
//		System.out.println(driver.findElement(By.xpath("(//table)[3]/tbody/tr[4]/td[4]")).getText());
	
		List<WebElement> element4 = driver.findElements(By.xpath("(//table)[3]/thead/tr/th"));
		for (WebElement theadData : element4) {
			System.out.println(theadData.getText());
		}
	}
	
	public static void main(String[] args) throws IOException, AWTException {
		launchBrowser();
		tableCheck();
//		ScreenShot();
	}

}
