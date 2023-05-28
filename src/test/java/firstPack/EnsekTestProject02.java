
/*EndToEnd Scenario 02: Buy Energy- gas type.
Launch Browser and navigate to application URL.
Click on Buy energy option> will be redirected to Buy energy page.
Enter an integer value(1000) in the field for Gas type and click Buy energy.
This should redirect you to Sale Confirmed page>if yes its a Pass, if any error it is a Fail/
 */

package firstPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EnsekTestProject02 {
@Test
	public void buyenergy() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://ensekautomationcandidatetest.azurewebsites.net/");
	driver.findElement(By.xpath("//a[contains(text(),'Buy energy »')]")).click();
	driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]")).sendKeys("1000");
	driver.findElement(By.xpath("//tbody/tr[1]/td[5]/input[1]")).click();
	String expectedtxt="Sale Confirmed";
	String actualtxt = driver.findElement(By.xpath("//h2[contains(text(),'Sale Confirmed!')]")).getText();
	Assert.assertTrue(expectedtxt.contains(actualtxt));
	driver.quit();
	}
}

