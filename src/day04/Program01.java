package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {

	public static void main(String[] args) {
		//Dropdown
		// Another form to find X-path - Syntax : //tagname[text()='text-value']
		// To select multiple languages 
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//a[text()='Hindi']")).click();
		driver.findElement(By.xpath("//a[text()='Malay']")).click();
		

	}

}
