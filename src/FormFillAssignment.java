import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFillAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Abhishek");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abhishek@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Abhishek@123");
		driver.findElement(By.id("exampleCheck1")).click();
		
		Select se = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		se.selectByIndex(0);
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("03-03-2001");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		
		String str = driver.findElement(By.cssSelector(".alert")).getText();
		
		for(int i = 2 ; i < str.length(); i++)System.out.print((str.charAt(i)));
		
		driver.close();
	}

}
