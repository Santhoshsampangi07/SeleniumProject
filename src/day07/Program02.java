package day07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program02 {

	public static void main(String[] args) {
		
		// To print particular bitcoin details and which line it is present 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gadgets360.com/finance/crypto-currency-price-in-india-inr-compare-bitcoin-ether-dogecoin-ripple-litecoin");
		List<WebElement> currencydetails= driver.findElements(By.xpath("//div[@class='_cptbl']//tbody//tr//td[1]"));
		int row=1;
		for(WebElement x:currencydetails)
		{
			if(x.getText().contains("Bitcoin(BTC)"))//?? doubt
			{
				break;
			}
			row++;
		}
		System.out.println(row);

		List<WebElement> Bitcoin= driver.findElements(By.xpath("//div[@class='_cptbl']//tbody//tr["+row+"]//td[1]"));
		
	}

}
