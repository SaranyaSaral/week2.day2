package week2.day2;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();

ChromeDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://leafground.com/pages/Dropdown.html");
Thread.sleep(2000);
 WebElement dropdown =driver.findElement(By.id("dropdown1"));
 Select dd=new Select(dropdown);
 dd.selectByIndex(4);
 WebElement dropdown1 =driver.findElement(By.name("dropdown2"));
 Select dd1=new Select(dropdown1);
 dd1.selectByValue("2");
 WebElement dropdown2 =driver.findElement(By.id("dropdown3"));
 Select dd2=new Select(dropdown2);
 dd2.selectByVisibleText("Selenium");
 
 
 
  WebElement dropdowm4=driver.findElement(By.xpath("//select[@class='dropdown']"));
  Select drp4= new Select(dropdowm4);
  
  
 System.out.println("the num of element"    +drp4.getOptions().size() );
  WebElement drpdown5 =driver.findElement(By.xpath("(//div[@class='example']/select)[5]"));
  
  drpdown5.sendKeys(Keys.ARROW_DOWN);
  
  drpdown5.sendKeys(Keys.ENTER);
 
    
 
 driver.findElement(By.xpath("(//option[text()='Selenium'])[6]")).click();
 
 
 
 
 
 
 
 
 


////Thread.sleep(3000);
 //WebElement multiselect=driver.findElement(By.xpath("")
 //Select multibox= new Select(multiselect);
 //multibox.selectByIndex(2);
 //multibox.selectByIndex(3);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	}

}
