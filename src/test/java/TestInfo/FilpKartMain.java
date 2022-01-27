package TestInfo;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FilpKartMain extends BaseMethods {

	@BeforeTest
	
	public void launchBrowserAndUrl() {
		chromeLaunch();
		loadUrl("https://www.flipkart.com/");
		maximize();}
@Test
public void homePageAndSearchProduct() throws InterruptedException {
	Pojo pojoObject = new Pojo();
	pojoObject.getClosePopUp().click();
	pojoObject.getSearchProduct().sendKeys("FossilWatches");
	pojoObject.getClickSearch().click();
	BaseMethods.threadSleep(2000);
	}
@Test (dependsOnMethods = {"homePageAndSearchProduct"})
public void productSelectionAndAddToCart() throws InterruptedException {
	Pojo pojoObject = new Pojo();
String productName = pojoObject.getProductSelection().getText();
BaseMethods.productNameVerification(pojoObject.getProductSelection(),"BQ2125",pojoObject.getAddToCart() );
String priceCheck = pojoObject.getPriceCheck().getText();
System.out.println("Product name is: " + productName);
System.out.println("Price of product is :" + priceCheck);
BaseMethods.assertcheck(productName, priceCheck);
System.out.println("valid iterm added to cart");
 BaseMethods.printTitle();
 pojoObject.getPlaceOrder().click();
 BaseMethods.threadSleep(3000);
 }
@Test (dependsOnMethods = {"productSelectionAndAddToCart"})
public void loginAndRemoveProductInCart() throws IOException, InterruptedException {
	Pojo pojoObject = new Pojo();
	pojoObject.getMobileNumber().sendKeys(BaseMethods.readExcel(0,1, "Sheet1"));
	pojoObject.getCountinueMobileNumber().click();
	BaseMethods.threadSleep(2000);	
	pojoObject.getPassword().sendKeys(BaseMethods.readExcel(1,0, "Sheet1"));
	pojoObject.getLogInClick().click();
	BaseMethods.threadSleep(2000);
	pojoObject.getDeliveryAddress().click();
	BaseMethods.threadSleep(2000);
	pojoObject.getPaymentSlotClick().click();
	BaseMethods.threadSleep(2000);
	pojoObject.getPaymentModeClick().click();
	BaseMethods.threadSleep(2000);
	pojoObject.getChangeOrderClick().click();
	BaseMethods.threadSleep(2000);
	pojoObject.getRemoveItemClick().click();
	System.out.println("Place item removed from cart");
	System.out.println("No items are added in cart");
	BaseMethods.threadSleep(4000);
	driver.quit();}
}





