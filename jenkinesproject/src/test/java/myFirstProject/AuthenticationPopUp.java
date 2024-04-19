package myFirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AuthenticationPopUp {
	@Test
	public  void authPopUp() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String username= "admin";
		String password= "admin";
		String url= "https://"+username+ ":" +password+ "@" + "basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/";
//		driver.get(url);
		
//		OR
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		String text = driver.findElement(By.xpath("//*[text()='congratulations with valid credentials']")).getText();
		Reporter.log(text, true);
		driver.quit();
	}
	@Test
	public void sampletest21()
			{
				Reporter.log("sample---21", true);
			}
	
}
