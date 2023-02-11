package day07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {
	// Topic : WEB TABLE

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gadgets360.com/finance/crypto-currency-price-in-india-inr-compare-bitcoin-ether-dogecoin-ripple-litecoin");
		
		// To get the headers row fully
        List<WebElement>headerList=driver.findElements(By.xpath("//div[@class='_cptbl']//th"));
		for(WebElement x:headerList)
		{
			System.out.println(x.getText());
		}
		
		System.out.println("......................");
		
		// To get particular column inside the body
		List<WebElement> currencyname= driver.findElements(By.xpath("//div[@class='_cptbl']//tbody//tr//td[1]"));

		for(WebElement x:currencyname)
		{
			System.out.println(x.getText());
		}
		
		System.out.println("......................");
		
		
	}

}
