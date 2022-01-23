package TestInfo;

import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FlipKartTest {
	
	public static WebDriver driver;
	
	@Test
	public void launchBrowserAndProductSearch() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("FossilWatches");
        driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
        Thread.sleep(2000);
	}
	@Test
	public void selectDesireProductAndAddToCart() throws InterruptedException {
		WebElement modelVerification = driver.findElement(By.xpath("//a[contains(text(),'BQ2125')]"));
		String modelText = modelVerification.getText();
		System.out.println("model name is:" + modelText);
		if (modelText.contains("BQ2125")) {
			modelVerification.click();
			Thread.sleep(2000);
			String parentId = driver.getWindowHandle();
			System.out.println("parent id is" + parentId);
			Set<String> allId = driver.getWindowHandles();
			System.out.println("all id is" + allId);
			for (String switchId : allId) {
				if (!parentId.equals(switchId)) {
					driver.switchTo().window(switchId);					
				}
				}
			
			
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(5000);
					
		}else {
			System.out.println("valid Model is not selected");
		}
	
      WebElement price = driver.findElement(By.xpath("//div[@class='Ob17DV _3X7Jj1']"));
      System.out.println("Item Model added to cart is: " + modelText);
      System.out.println("Price of added item: " + price.getText());   
      
      SoftAssert softAssert = new SoftAssert();
      softAssert.assertEquals(modelText, "BQ2125");
      softAssert.assertNotEquals(price.getText(), "5,997");
		//Assert.assertEquals("BQ2125", modelText);
     System.out.println("valid iterm added to cart");
     String title = driver.getTitle();
System.out.println("title name: " + title);
	}
	
	
@Test
public void placeOrderAndAddAddress() throws InterruptedException {
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
	
	
	
}

}
