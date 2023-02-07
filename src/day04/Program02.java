package day04;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program02 {

	public static void main(String[] args) {
		// To select country :
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//span[@aria-expanded='false']")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Bangladesh");
		driver.findElement(By.xpath("//li[text()='Bangladesh']")).click();
	}

}
