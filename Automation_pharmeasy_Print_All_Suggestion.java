package Auto_Suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_pharmeasy_Print_All_Suggestion {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://pharmeasy.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath(
				"(//div[@class=\"c-PJLV c-bXbWpx c-bXbWpx-lfylVv-direction-row c-bXbWpx-fMErMJ-justify-left c-bXbWpx-joJbDg-align-center c-bXbWpx-ielOayq-css\"])[2]"));

		e1.click();
		Thread.sleep(3000);
		WebElement inputbox = driver.findElement(By.id("topBarInput"));
		inputbox.sendKeys("Soaps");
		Thread.sleep(3000);
		List<WebElement> auto = driver.findElements(
				By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-bZJlhX-direction-column c-bXbWpx-idIeDmn-css']"));
		int count = auto.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			WebElement e3 = auto.get(i);
			System.out.println(e3.getText());

		}
	}

}
