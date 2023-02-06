package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program01 {
	// Topic : Dropdown select tag
	// type i) Select by option ( using index number)

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Select dropdownSkill=new Select(driver.findElement(By.xpath("//select [@ng-model='Skill']")));
		dropdownSkill.selectByIndex(3);		
		

	}

}
