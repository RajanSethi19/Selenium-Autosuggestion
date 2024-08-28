package Auto_Suggestion;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Autosuggestion_By_SelectClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		Select sc = new Select(e1);
		Thread.sleep(2000);
		sc.selectByVisibleText("Books");
		List <WebElement> l1=sc.getOptions();
		
		int count=l1.size();
		System.out.println(count);
		
		/*
		 * for(WebElement e2:l1) { String e3=e2.getText(); System.out.println(e3);
		 * 
		 * }
		 */
		//either do it by for or for each loop
		for(int i=0;i<count;i++) {
			WebElement w=l1.get(i);
			System.out.println(w.getText());
			
		}

	}

}
