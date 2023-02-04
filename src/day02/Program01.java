package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {
	// How to insert the text into webpage.
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("santhosh kumar");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("S");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("the transformers fitness");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ssanthoshkumar578@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8838893048");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("junction");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("junction");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).clear(); // To clear the text
		
		
		
		

	}

}
