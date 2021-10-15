package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonAssingnment6 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		//find the position
		WebElement getposition=driver.findElement(By.id("position"));
		 Point xypoint=getposition.getLocation();
		 int xvalue=xypoint.getX();
		 int yvalue=xypoint.getY();
		 System.out.println("x point:"+xvalue  +   "y point:"  +yvalue);
		   
		 
		 //find the color
		 
		
		 WebElement colorbox=driver.findElement(By.id("color"));
		String color= colorbox.getCssValue("background-color");
		System.out.println("find the color"  + color);
		
		// find the sie
		 WebElement size=driver.findElement(By.id("size"));
		int heigth =size.getSize().getHeight();
		int width=size.getSize().getWidth();
		System.out.println("box heigth"  + heigth + "box width:" + width );
		//click the home bottun
		driver.findElement(By.id("home")).click();
		
	}

}
