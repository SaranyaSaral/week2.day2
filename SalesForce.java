package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.get( "https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("saranya");
driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("saran");
driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("saranay@gmail.com");
driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("xyyxyx");
driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("8489849349247");
WebElement job=driver.findElement(By.xpath("//select[@name='UserTitle']"));
Select dropdown= new Select(job);
dropdown.selectByVisibleText("Sales Manager");




WebElement empy=driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
Select dd= new Select(empy);
dd.selectByValue("250");
driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
driver.close();


	}

}
