import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExecrcise {
	
	public static void main(String args[]) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		/*
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * 
		 * if(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * System.out.println("It's Selected");
		 * 
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * 
		 * if(!driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * System.out.println("It's Not Selected");
		 */
		
		System.out.println("No. of checkboxes available on Webpage : " + driver.findElements(By.xpath("//input[@type='checkbox'")).size());
	}

}
