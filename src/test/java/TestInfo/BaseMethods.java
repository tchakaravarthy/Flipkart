package TestInfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethods {
	public static WebDriver driver;
	private static String product;
	
	public static void chromeLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	}
public static void loadUrl(String url) {
	driver.get(url);}
public static void maximize() {
		driver.manage().window().maximize();
}

public static void printStartTime() {
	System.out.println("test starts");
Date d = new Date();
System.out.println(d);
}
public static void printEndTime() {
	System.out.println("test ends");
	Date d = new Date();
	System.out.println(d);}

public static void printTitle() {
System.out.println(driver.getTitle());
}
public static void threadSleep(int milli) throws InterruptedException {
	Thread.sleep(milli);}

public static void productNameVerification(WebElement ref,String modelName,WebElement ref2) throws InterruptedException {
	if (modelName.contains("BQ2125")) {
		ref.click();
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
		
		
	ref2.click();
	Thread.sleep(5000);
				
	}else {
		System.out.println("valid Model is not selected");
	}

}
public static void titlePrint() {
System.out.println("title name is: " + driver.getTitle());
	
}
public static void assertcheck(String product, String price) {
	if (product.equalsIgnoreCase("BQ2125 FLYNN Analog Watch - For Men") || price.equalsIgnoreCase("4249" )) {
		System.out.println("valid product is added: " + product + "price of product: " + price);
		
	}else {
		System.out.println("valid product is not added: " + product + "price of product: " + price );
		
	}
	
	//SoftAssert softAssert = new SoftAssert();
	//softAssert.assertEquals(productName, "BQ2125");
	//softAssert.assertEquals(price, 4199);
	//return true;
}
public static String readExcel(int row,int cell,String sheetName) throws IOException{
	String workingDir = System.getProperty("user.dir");
	File f =new File (workingDir + "\\resource\\Flipkart.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook W = new XSSFWorkbook(fin);
	Sheet sheet = W.getSheet(sheetName);
Row r = sheet.getRow(row);
Cell cell2 = r.getCell(cell);
String value = cell2.getStringCellValue();
return value;

}}
	

	
	
	
	
	

	
	
	
	
	
	
	


