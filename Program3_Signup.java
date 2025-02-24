

package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program3_Signup {
	
public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();//Open the Firefox driver
		
		driver.get("https://www.guvi.in/"); //opens the url link
		
		driver.manage().window().maximize(); //window gets Maximized
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //waits for 15 seconds
		
		driver.findElement(By.xpath("//a[@normalize-space()='Sign up']")).click();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Johny Johny");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("johny97@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("feb@2025");
		
		driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("1234567891");
		
		driver.findElement(By.xpath("//a[@class='signup-btn']")).click();
		
		System.out.println("User is verified successfully");
		
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("johny97@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("feb@2025");
		
		driver.findElement(By.xpath("//a[@id='login-btn']")).click();
		
		String title=driver.getTitle(); 
		
		System.out.println(title);
		
		driver.close();
}


}
