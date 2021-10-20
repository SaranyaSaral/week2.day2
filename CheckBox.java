package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();
driver.get("http://leafground.com/pages/checkbox.html");
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();



WebElement select= driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
       boolean selenium=select.isSelected();
       if(selenium==true) {
    	   System.out.println(" The  check box is selected ");
       }
       WebElement frist= driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")) ;
       if(frist.isSelected()) {
    	   frist.click();
       }
       WebElement sec=driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
       if (sec.isSelected()) {
    	   sec.click();
       }
       driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
       
       
       driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
       driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
       driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
       driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
   }

}
