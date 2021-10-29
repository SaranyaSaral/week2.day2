package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
 driver.findElement(By.linkText("Leads")).click();
 driver.findElement(By.linkText("Find Leads")).click();
 driver.findElement(By.linkText("Phone")).click();
 driver.findElement(By.name("phoneNumber")).sendKeys("7647364761");
 driver.findElement(By.linkText("Find Leads")).click();
 Thread.sleep(3000);
 String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	System.out.println(text);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.findElement(By.linkText("Delete")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
	driver.findElement(By.linkText("Find Leads")).click();
	
	 String text1 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	 if(text.contains(text1))
			 {
		
		 System.out.println("susseful");
	 }
	 
	
 






	}

}
