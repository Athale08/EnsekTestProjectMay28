package firstPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnsekTestProject01 {
@Test
	public void registertest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://ensekautomationcandidatetest.azurewebsites.net/");
		
		driver.findElement(By.xpath("//a[@id='registerLink']")).click();
		
				
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kishorathale@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("EnsekTest01#");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("EnsekTest01#");
		
		WebElement Register = driver.findElement(By.xpath("//body/div[2]/form[1]/div[5]/div[1]/input[1]"));
		Assert.assertTrue(Register.isEnabled());
		Register.click();
		driver.quit();
		
		}

	}


