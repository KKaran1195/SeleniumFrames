package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {
	
	private static String frame2;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ADMIN\\eclipse-workspace\\BrowserLaunchSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int size = frames.size();
		System.out.println(size);
		
		driver.switchTo().frame(0);
		
		WebElement btnClick = driver.findElement(By.id("Click"));
		btnClick.click();
		
		String data = btnClick.getText();
		System.out.println(data);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//iframe[@src='page.html']"));
		
		driver.switchTo().frame(frame2);
		
	}

}
