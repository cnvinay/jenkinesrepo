package myFirstProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FileUploadPopUpTest {

	@Test
	public void sampletest41()
	{
		Reporter.log("sample---41", true);
	}

	@Test
	public  void fileUp() throws AWTException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// multiple files upload
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/multiple?sublist=3");
		WebElement ele = driver.findElement(By.xpath("//input[@id='fileInput']"));
		ele.sendKeys(System.getProperty("user.dir")+"C:\\Users\\VINAY C N\\OneDrive\\Desktop\\vinay-resume.D.pdf");

	}
}
