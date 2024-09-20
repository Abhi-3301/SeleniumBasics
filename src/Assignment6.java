import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		String option = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		driver.findElement(By.id("checkBoxOption2")).click();
		
		Select se = new Select(driver.findElement(By.id("dropdown-class-example")));
		se.selectByVisibleText(option);
		
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		
		if(driver.switchTo().alert().getText().contains(option))
			System.out.println("Text Match");
		else
			System.out.println("Text Mismatch");
	}

}
