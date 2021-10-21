package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='yes']")).click();
		  
		
		WebElement find=driver.findElement(By.xpath("(//input[@name='news'])[2]"));
		 boolean seclect=find.isSelected();
		if(seclect==true) {
			System.out.println("defult selected ");
			
		}
		driver.findElement(By.xpath("//input[@name='age']")).click();
	}

}
