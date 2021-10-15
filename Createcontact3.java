package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact3 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
WebElement  eleuername=  driver.findElement(By.id("username")); 
eleuername.sendKeys("demosalesmanager");
 
 driver.findElement (By.name("PASSWORD")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
 driver.findElement(By.linkText("CRM/SFA")).click();
 driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
 driver.findElement(By.id("firstNameField")).sendKeys("saranya");
 driver.findElement(By.id("lastNameField")).sendKeys("adhi");
 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sran");
 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("sran");
 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("testleaf");
 driver.findElement(By.name("description")).sendKeys(" welcome to testleaf");
 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("saranyanathiya@gmail.com");
  WebElement state=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
  Select dd=new Select(state);
  dd.selectByVisibleText("Idaho");
driver.findElement(By.name("submitButton")).click() ;
driver.findElement(By.xpath("//a[text()='Edit']")).click() ;
driver.findElement(By.name("description")).clear();
driver.findElement(By.name("importantNote")).sendKeys(" welcome to testleaf");
driver.findElement(By.xpath("//input[@name='submitButton']")).click() ;
    String title=driver.findElement(By.xpath("//div[text()='View Contact']")).getText();
    System.out.println(title);

	}

}
