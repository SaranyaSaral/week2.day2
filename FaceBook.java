package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement elecreate= driver.findElement(By.xpath("//a[text()=\"Create New Account\"]"));
		elecreate.click();
		
		driver.findElement(By.name("firstname")).sendKeys("saranya");
		driver.findElement(By.name("lastname")).sendKeys("saran") ;
		driver.findElement(By.name("reg_email__")).sendKeys("saranyanathiya24@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("saranyanathiya24@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("saran");
        WebElement dbay=driver.findElement(By.name("birthday_day"));
        Select dropdown=new Select(dbay);
        dropdown.selectByVisibleText("24");
        
        WebElement bmon=driver.findElement(By.name("birthday_month"));
        Select dropdown2=new Select(bmon);
        dropdown2.selectByIndex(7);
        
        WebElement byear= driver.findElement(By.name("birthday_year"));
        Select dropdown3=new Select(byear);
        dropdown3.selectByValue("1999"); 
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        
	}

}
