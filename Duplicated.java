package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicated {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		WebElement  eleuername=  driver.findElement(By.id("username")); 
		eleuername.sendKeys("demosalesmanager");
		 
		 driver.findElement (By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
		 driver.findElement(By.name("emailAddress")).sendKeys("saranaya@gmail.com");
		// driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 //driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		 String text = driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).getText();
			System.out.println(text);
			driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
			driver.findElement(By.linkText("Duplicate Lead")).click();
			String title = driver.getTitle();
			System.out.println(title);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			String value = driver.findElement(By.id("viewLead_firstName_sp")).getText();
			if (value.contains(text)) {
				System.out.println("it is same");
			}
			driver.close();
		
		 
		 
	}

}
