package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/Link.html");
//driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).click();
driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
driver.navigate().back();
WebElement findElement = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']"));
String attribute = findElement.getAttribute("href");
System.out.println(attribute);
WebElement link = driver.findElement(By.linkText("Verify am I broken?"));
String attribute2 = link.getAttribute("href");
driver.navigate().to(attribute2);
System.out.println(driver.getTitle());
driver.navigate().back();
String attribute3 = driver.findElement(By.xpath("(//a[@href='../home.html'])[2]")).getAttribute("href");
driver.navigate().to(attribute3);
driver.navigate().back();
List<WebElement> link2 = driver.findElements(By.tagName("a"));
int size = link2.size();
System.out.println("total no of link"  +size);

//driver.get("http://leafground.com/pages/Link.html");



	}

}
