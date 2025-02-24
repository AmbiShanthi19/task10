

package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program1_Datepicker {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();//Open the Firefox driver
		
		driver.get("https://jqueryui.com/datepicker/"); //opens the url link
		
		driver.manage().window().maximize(); //window gets Maximized
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //waits for 15 seconds
		
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
		driver.findElement(By.xpath("//a[@text()='22']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='datepicker']")).getText());
		
		driver.close();
		
		driver.quit();
	}

}
