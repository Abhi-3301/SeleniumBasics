import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAutoSuggestion8 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(3000);
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
//		for (WebElement option : driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"))) {
//
//			if (option.getText().equalsIgnoreCase("India")) {
//				option.click();
//				break;
//
//			}
//
//		}
		
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		driver.close();
	}

}


//String val = "return document.getElementById(\"hiddentext"\).value;";
//String text = (String)js.executeScript(val);


