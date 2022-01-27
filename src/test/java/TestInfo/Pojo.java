package TestInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseMethods {
	
	public Pojo () {
		PageFactory.initElements(driver, this);				
	}
	@FindBys (
		@FindBy (xpath = "//button[@class='_2KpZ6l _2doB4z']" )
	) private WebElement closePopUp;

		@FindBy (xpath = "//input[@type='text']" )
	 private WebElement searchProduct;

		@FindBy (xpath = "//button[@class='L0Z3Pu']" )
		 private WebElement ClickSearch;
		
		@FindBy (xpath = "//a[contains(text(),'BQ2125')]" )
		 private WebElement productSelection;
		
		@FindBy (xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
		 private WebElement addToCart;
		
		@FindBy (xpath = "//div[@class='Ob17DV _3X7Jj1']")
		 private WebElement priceCheck;
		
		@FindBy (xpath = "//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")
		 private WebElement placeOrder;	
		@FindBy (xpath = "//input[@type='text']")
		 private WebElement mobileNumber;

		@FindBy (xpath = "//button[@class='_2KpZ6l _20xBvF _3AWRsL']")
		 private WebElement countinueMobileNumber;	
		
		@FindBy (xpath = "//input[@type='password']")
		 private WebElement password;
		@FindBy (xpath = "//button[@type='submit']")
		 private WebElement logInClick;

		@FindBy (xpath = "//button[@class='_2KpZ6l RLM7ES _3AWRsL']")
		 private WebElement deliveryAddress;
		
		@FindBy (xpath = "//button[@class='_2KpZ6l _1seccl _3AWRsL']")
		 private WebElement paymentSlotClick;		
		
		@FindBy (xpath = "(//div[@class='_1XFPmK'])[2]")
		 private WebElement paymentModeClick;
		
		@FindBy (xpath = "(//button[@class='_32l7f0'])[3]")
		 private WebElement changeOrderClick;

		@FindBy (xpath = "//div[@class='_3dsJAO']")
		 private WebElement removeItemClick;

		public WebElement getClosePopUp() {
			return closePopUp;
		}

		public WebElement getSearchProduct() {
			return searchProduct;
		}

		public WebElement getClickSearch() {
			return ClickSearch;
		}

		public WebElement getProductSelection() {
			return productSelection;
		}

		public WebElement getAddToCart() {
			return addToCart;
		}

		public WebElement getPriceCheck() {
			return priceCheck;
		}

		public WebElement getPlaceOrder() {
			return placeOrder;
		}

		public WebElement getMobileNumber() {
			return mobileNumber;
		}

		public WebElement getCountinueMobileNumber() {
			return countinueMobileNumber;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogInClick() {
			return logInClick;
		}

		public WebElement getDeliveryAddress() {
			return deliveryAddress;
		}

		public WebElement getPaymentSlotClick() {
			return paymentSlotClick;
		}

		public WebElement getPaymentModeClick() {
			return paymentModeClick;
		}

		public WebElement getChangeOrderClick() {
			return changeOrderClick;
		}

		public WebElement getRemoveItemClick() {
			return removeItemClick;
		}
}