package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program03 {
	// TOPIC : FRAME 

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Frames.html");
		 driver.switchTo().frame("SingleFrame");
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing");	
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();

	}

}
