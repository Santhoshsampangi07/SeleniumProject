package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program04 {
	//iv) Mouse over

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement src= driver.findElement(By.xpath("//span[text()='Beauty, Health & Daily Needs']"));
		WebElement a= driver.findElement(By.xpath("//span[text()='Skin Care']"));
		Actions x= new Actions(driver);
		x.moveToElement(src).click(a).build().perform();
		

	}

}
