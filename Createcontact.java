package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("saranya");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("saranaya");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("adi");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("saranya@gmail.com");
		WebElement country=driver.findElement(By.xpath("//select[@id='input-country']"));
		Select dd=new Select(country);
		dd.selectByVisibleText("India");
		driver.findElement(By.xpath(" //label[text()='Password']/following-sibling::input")).sendKeys("sarana123");
	}

}
