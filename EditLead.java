package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("saranay");
		
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
		 //driver.findElement(By.xpath("//div[@ class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 driver.findElement(By.xpath("//input[@class='inputBox']")).clear();
		 driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("privete");
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 
		 String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		 //System.out.println(text);
		 if(text.contains("private")) {
			 System.out.println("yes,chenged");
			 
		 }
			 
	}

}
