package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {
	// TOPIC : ALERTS

	public static void main(String[] args) throws Exception {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.automationtesting.in/Alerts.html");
		 driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();		 
		 System.out.println(driver.switchTo().alert().getText());
		 Thread.sleep(5000);// delay purpose (5 secs)
		 driver.switchTo().alert().accept();

	}

}