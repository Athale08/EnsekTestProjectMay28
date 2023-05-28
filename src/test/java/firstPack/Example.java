package firstPack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Example {
	@Test
	public void SampleTest() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("About"));
		driver.findElement(By.xpath("//header/nav[1]/div[1]/ul[1]/li[2]/div[1]")).click();
		Thread.sleep(5000);
		driver.quit();
		/*int a = 10;
		if (a<20) {
			throw new SkipException("a cannot be less than 20");*/
			
		}
		

	}


