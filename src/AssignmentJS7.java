import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentJS7 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		//js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		Thread.sleep(3000);

		WebElement we =  driver.findElement(By.id("product"));
		
		System.out.println("Number of Rows Available in the Table : " + we.findElements(By.tagName("tr")).size());
		System.out.println("Number of Cloumns Available in the Table : " + we.findElements(By.tagName("th")).size());
		
		for(WebElement w : we.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"))) System.out.println(w.getText());	
		
		driver.close();
			

	}

}

		