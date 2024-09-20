import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsOpening {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com/");

		// Count of the Link in the Entire Page
		// System.out.println("Links in the Page");

		// System.out.println(driver.findElements(By.tagName("a")).size());

		// Count of links in the footer section of the page
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));

		// System.out.println("Links in the footer section");
		// System.out.println(footer.findElements(By.tagName("a")).size());

		// WebElement col =
		// footer.findElement(By.xpath("//div[2]/table/tbody/tr/td[2]/ul[2]"));
		WebElement col = footer.findElement(By.xpath("//div[2]/table/tbody/tr/td[1]"));

		// System.out.println("Links in the 2nd coloumn of the section");
		// System.out.println(col.findElements(By.tagName("a")).size());

//		String Beforeclicking = null;
//		String Afterclicking;
//		
//		for (int i = 0; i < col.findElements(By.tagName("a")).size(); i++) {
//
//			if (col.findElements(By.tagName("a")).get(i).getText().contains("Site map")) {
//				Beforeclicking = driver.getTitle();
//				System.out.println(Beforeclicking);
//
//				col.findElements(By.tagName("a")).get(i).click();
//				break;
//			}
//		}
//		
//		Afterclicking = driver.getTitle();
//		
//		System.out.println(Afterclicking);
//		
//		if (Beforeclicking != Afterclicking) {
//
//			if (driver.getPageSource().contains("sitemap")) System.out.println("PASS");
//		} else {
//			System.out.println("FAIL");
//		}

		for (WebElement e : col.findElements(By.tagName("a"))) {
			String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			e.sendKeys(clickonlink);

			Thread.sleep(5000L);
		}

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		System.out.println("Windows Open on Driver");

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

		driver.quit();
	}

}
