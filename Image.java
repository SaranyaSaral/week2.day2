package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.navigate().back();
	
		String attribute = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("src");
	
	driver.navigate().to(attribute);
	System.out.println(driver.getTitle());
	driver.navigate().to("http://leafground.com/pages/Image.html");
	driver.get("http://leafground.com/pages/Image.html");

	driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
	driver.navigate().back();
	
	
	
	}
	
	
	
	
	
	

}
