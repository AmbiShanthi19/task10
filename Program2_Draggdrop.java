

package task10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Assert;

public class Program2_Draggdrop {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();//Open the Firefox driver
		
		driver.get("https://jqueryui.com/droppable/"); //opens the url link
		
		driver.manage().window().maximize(); //window gets Maximized
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //waits for 15 seconds
		
		WebElement Element1=driver.findElement(By.id("draggable"));
		
		WebElement Element2=driver.findElement(By.id("droppable"));
		
		
		Actions Actobj=new Actions(driver);
		
		Actobj.dragAndDrop(Element1, Element2).build().perform();
		
		WebElement Colorchange=(WebElement) driver.findElements(By.cssSelector("//style[outline='FFFA90']"));
				
		
		String msg=Element2.getText();
		
		Assert.assertEquals("fffa90",Colorchange);
		
		if(msg.equalsIgnoreCase("Dropped!"))
		{
			System.out.println("DragDrop successfull");
		}
		else {
			System.out.println("DragDrop not successfull");
		}
		

	}

}
