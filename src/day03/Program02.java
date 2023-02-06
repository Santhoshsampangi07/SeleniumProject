package day03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Program02 {

	public static void main(String[] args) {
		// Topic : Dropdown select tag
		// type ii) Select by value attribute
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Select dropdownSkill=new Select(driver.findElement(By.xpath("//select [@ng-model='Skill']")));
		dropdownSkill.selectByValue("C");
	}

}
