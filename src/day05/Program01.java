package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program01 {
	
	
	//Topic :- Action
	//  	   i) Drag and drop option 

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement des = driver.findElement(By.xpath("//li[@class='placeholder']"));
		Actions x=new Actions(driver);
		x.dragAndDrop(src, des).build().perform();
		
		WebElement srcSale= driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement desSale= driver.findElement(By.xpath("//ol[@id='loan']"));
		x.dragAndDrop(srcSale, desSale).build().perform();

	}

}
