package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlertPopUps {
	
	@Test
	public void sampletest1()
			{
				Reporter.log("sample---1", true);
			}
	
	
	
	@Test
	public void popUp()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//promt popup

		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		WebElement ele = driver.findElement(By.id("buttonAlert1"));
		ele.click();
		Alert a = driver.switchTo().alert();
		String promtText = a.getText();
		
		Reporter.log(promtText, true);
		a.sendKeys("yes");
		a.accept();

		String text = driver.findElement(By.xpath("//p[@class='pt-2 text-center']")).getText();
		Reporter.log(text, true);

		driver.quit();
	}

}
