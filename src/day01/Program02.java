package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program02 {
	//  To print the title and URL of the web page .

	public static void main(String[] args) {
		WebDriver driver;
	     driver = new ChromeDriver();
	     driver.get("https://github.com/Santhoshsampangi07?tab=repositories");
	     System.out.println(driver.getTitle());
	     System.out.println(driver.getCurrentUrl());
	     
		

	}

}
