import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Asssignment3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		String username = driver.findElement(By.xpath("(//i)[1]")).getText();
		String password = driver.findElement(By.xpath("(//i)[2]")).getText();
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		new Select(driver.findElement(By.xpath("//select[@class='form-control']"))).selectByIndex(0);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn.btn-info")));
		
		for(WebElement we : driver.findElements(By.cssSelector("button.btn.btn-info"))) we.click();
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		
		driver.close();
	}

}
