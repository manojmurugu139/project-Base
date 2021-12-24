package failedtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	  static WebDriver driver;
		
		// browser Launch

		
		public static WebDriver chromeBrowser() {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			return driver;
			
		}
		
		// url Launch
		
		public static void urlLaunch(String url) {
			driver.get(url);
		}
		
		//current url
		public static String GetCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
			
		}
		public static void click(WebElement e) {
			e.click();

		}
		//max and time
		
		public static void impWait(int sec) {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(sec ,TimeUnit.SECONDS);
		}
		//send Keys
		
		public static void sendKey(WebElement e, String data) {
			e.sendKeys(data);
		}
		// quit
		public static void quit() {
			driver.quit();
		}
		// Actions
		public static void dragAndDrop(WebElement from,WebElement to) {
			Actions a = new Actions(driver);
			a.dragAndDrop(from, to).perform();
			
		}
		//action Click
		public static void actionClick(WebElement e) {
			Actions a = new Actions(driver);
			a.click(e).perform();
			
		}
		// SelectByIndex
		public static void selectByIndex(WebElement e, int index) {
			Select s = new Select(e);
			s.selectByIndex(index);
		}
		
		//get Title
		public static String getTitle() {
			String currentUrl = driver.getTitle();
			return currentUrl;
			
		}
		//double click
		public static void doubleClick(WebElement e) {
			Actions a = new Actions(driver);
			a.doubleClick(e).perform();
			
		}
		//context Click
		public static void contextClick(WebElement e) {
			Actions a = new Actions(driver); 
			a.contextClick(e).perform();
			
		}
		//simple Alert
		public static void simpleAlert() {
			Alert alert  = driver.switchTo().alert(); 
			alert.accept();
			
		}
		//confirm Alert
		public static void confirmAlert() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		//promptAlert
		public static void promptAlert(String input) {
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(input);
			alert.accept();
		}
		//select By Value
		public static void selectByValue(WebElement e, String Value) {
			Select s = new Select(e);
			s.selectByValue(Value);
			
		}
	     //selectByVisible
		public static void selectByVisible(WebElement e, String Text) {
			Select s = new Select(e);
			s.selectByVisibleText(Text);
		}
		//isMultiple
		public static boolean isMultiple(WebElement e) {
			Select s = new Select(e);
			return s.isMultiple();
			
		}
		//getFirstSelectedOptions
		public static String getFirstSelectedOption(WebElement e) {
			Select s = new Select(e);
			WebElement Option = s.getFirstSelectedOption();
			return Option.getText();
		}
		//deSelectByIndex
		public static void deSelectByIndex(WebElement e, int index) {
			Select s =new Select(e);
			s.deselectByIndex(index);
		}
		//deSelectByValue
		public static void deSelectByValue(WebElement e, String value) {
			Select s =new Select(e);
			s.deselectByValue(value);
		}
		//deSelectAll
		public static void deSelectAll(WebElement e) {
			Select s =new Select(e);
			s.deselectAll();
		}	
		//screenshot
		public static void screenshot(String filename) throws IOException {
			TakesScreenshot tk = (TakesScreenshot)driver;
			File from = tk.getScreenshotAs(OutputType.FILE);
			File to = new File("loc");
			FileUtils.copyFile(from, to);
		}
		//setAttribute
		public static void setAttribute(String text, WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('value','"+text+"')",e);
		}
		//getAttribute
		public static String getAttribute( WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Object ggg = js.executeScript("return arguments[0].getAttribute('value')",e);
			return ggg.toString();
		}
	       //down
		  public static void down(WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",e);
		}
		//up
		  public static void up(WebElement e) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(false)",e);
		  }
		//javaClick
		  public static void javaClick(WebElement e) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()",e);
			}
	    //frameIndex
		  public static void frameIndex(int index) {
			  driver.switchTo().frame(index);
		  }
		//frameName
		  public static void frameName(String name) {
			  driver.switchTo().frame(name);
		  }
		//frameWebElement
		  public static void frameWebElement(WebElement e) {
			  driver.switchTo().frame(e);
		  }
		//defaultContent
		  public static void defaultContent() {
			  driver.switchTo().defaultContent();
		  }
		//parentFrame
		  public static void parentFrame() {
			  driver.switchTo().parentFrame();
		  }
		//toUrl
		  public static void toUrl(String url) {
			  driver.navigate().to(url);
		  }
		  //back
		  public static void back() {
			  driver.navigate().back();
		  }
		  //forward
		  public static void forward() {
			  driver.navigate().forward();
		  }
		  //refresh
		  public static void refresh() {
			  driver.navigate().refresh();
		  }
		  //isDisplayed
		  public static boolean isDisplayed(WebElement e) {
			  return e.isDisplayed();
		  }
		//isSelected
		  public static boolean isSelected(WebElement e) {
			  return e.isSelected();
		  }
		//isEnabled
		  public static boolean isEnabled(WebElement e) {
			  return e.isEnabled();
		  }
		//getHandle
		  public static String getHandles() {
			  return driver.getWindowHandle();
		  }
		//getHandles
		  public static void getHandles(int index) {
			 Set<String> st = driver.getWindowHandles();
			 List<String> li = new ArrayList<String>();
			 li.addAll(st);
			 driver.switchTo().window(li.get(index));
		  }
		  //getExcelData
		  public static String getExcelData(String filename, String sheetname, int rowno, int cellno) throws IOException   {
			  File loc = new File("C:\\Users\\DELL\\eclipse-workspace\\Excelwrite\\src\\test\\java\\mavenexcel\\New Microsoft Excel Worksheet\\"+filename+".xlsx");
			  FileInputStream st = new FileInputStream(loc);
			  Workbook w = new XSSFWorkbook(st);
			  Sheet sheet = w.getSheet(sheetname);
			  Row row = sheet.getRow(rowno);
			  Cell cell = row.getCell(cellno);
			  
			  int type = cell.getCellType();
			  //type============= 1 String
			  //type============= 0 Number, Date
			  String value = null;
			  if(type==1) {
				  value = cell.getStringCellValue();
			  }
				  else {
					  if(DateUtil.isCellDateFormatted(cell)) {
						  value = new SimpleDateFormat("dd-MM-yyyy").format(cell.getDateCellValue());
					  }
						  else {
							  value = String.valueOf((long)cell.getNumericCellValue());
						  }
					  }
						return value;
		  }
}
	  
				  
				  


