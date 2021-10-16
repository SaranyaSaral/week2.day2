package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaf6 {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/Edit.html");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saranyanathiya2408@gmail.com");
driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("test");
String name=  driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
System.out.println(name);
driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
WebElement disableBox=driver.findElement(By.xpath("//input[@disabled='true']"));
 boolean enabled=disableBox.isEnabled();
 System.out.println(enabled);

	}

}
