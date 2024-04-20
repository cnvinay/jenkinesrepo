package myFirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ElementPresentOrNotTest {
	public  WebDriver driver ;
	@Test
	public void sampletest31()
	{
		Reporter.log("sample---31", true);
	}
	

	@Test
	public  void elePresent()
	{
		
		//driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		String BROWSER = System.getProperty("browser");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		
		String URL =System.getProperty("url");
		
		
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement phone = driver.findElement(By.id("select1"));
		Select s= new Select(phone);
		s.selectByValue("+91");
		driver.findElement(By.id("phone")).sendKeys("9964023912");
		WebElement gender = driver.findElement(By.id("select2"));
		Select s1= new Select(gender);
		s1.selectByIndex(0);
		WebElement country = driver.findElement(By.id("select3"));
		Select s2= new Select(country);
		List<WebElement> options = s2.getOptions();
		int count= options.size();
		int size=0;
		String element = "india";
		for(int i=1; i<count; i++)
		{
			String text= options.get(i).getText();
			if(text.equalsIgnoreCase(element)) {
				//System.out.println(element+ " : is present");
				size++;
				break;
			}
		}
		if(size==1)
		{
			Reporter.log(element+ " : present", true);
		}
		else {
			Reporter.log(element+ " : not present", true);
		}
		driver.quit();
	}
}
