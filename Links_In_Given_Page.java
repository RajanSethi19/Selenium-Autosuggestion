package Auto_Suggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_In_Given_Page {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> e1 = driver.findElements(By.tagName("a"));

		int count = e1.size();
		System.out.println(count);
		for (WebElement w1 : e1) {

			String w2 = w1.getText();
			System.out.println(w2);
			String w3=w1.getAttribute("href");
			System.out.println(w3);
			
		}

	}

}
