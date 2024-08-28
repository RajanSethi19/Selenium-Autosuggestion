package Auto_Suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion_on_Google {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement inputbox=driver.findElement(By.id("APjFqb"));
		inputbox.sendKeys("India");
		Thread.sleep(3000);
		List <WebElement> auto=driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]//ul/li"));
		auto.size();
		Thread.sleep(3000);
		WebElement x=auto.get(3);
		x.click();
		System.out.println(x);
		
		
		

	}

}
