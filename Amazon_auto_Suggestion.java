package Auto_Suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_auto_Suggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes");
		Thread.sleep(2000);
		List<WebElement> e2 = driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]/div/div"));
		Thread.sleep(2000);
		int len = e2.size();
		System.out.println(len);
		e2.get(4).click();

	}

}
