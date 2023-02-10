package day04;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program03 {
	
	//topic :- To take screen shots of every steps 
	static WebDriver driver;
	public static void main(String[] args)throws IOException {
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		screenshots("Web Application");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("santhosh kumar");
		screenshots("First Name");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("S");
		screenshots("LastName");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("the transformers fitness");
		screenshots("Address");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ssanthoshkumar578@gmail.com");
		screenshots("Email address");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8838893048");
		screenshots("Phone");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		screenshots("Gender");
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		screenshots("Hobbies");
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("junction");
		screenshots("Password");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("junction");
		screenshots("Confirm password");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).clear(); // To clear the text
		screenshots("Clears Confirm password");
		
	}
	
	public static void screenshots(String fileName) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des= new File("./screenShot/"+fileName+".png");
		FileUtils.copyFile(src, des);
		
	}

}
