 package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static void main(String[]args){
		
		//ChromeOptions options= new ChromeOptions ();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 System.out.println("Browser opened");
		 driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");
		 driver.manage().window().maximize();
		 WebElement FirstName= driver.findElement(By.id("input-firstname"));
		 FirstName.sendKeys("test");
		 System.out.println("firstname");
		 driver.findElement(By.id("input-lastname")).sendKeys("test1");
		 System.out.println("lastname");
		 driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		 System.out.println("email");
		 driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("876543234");
		 System.out.println("telephone");

		 driver.findElement(By.id("input-password")).sendKeys("23456");
		 System.out.println("password");
		 
		 driver.findElement(By.id("input-confirm")).sendKeys("23456");
		 System.out.println("password");
		 
		 WebElement checkbox=driver.findElement(By.name("agree"));
		 checkbox.click();
		 WebElement clickbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		 clickbutton.click();

		
		}
}