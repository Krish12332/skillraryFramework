package Generic_Librarie_chp_4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * This class contains all reusable methods of WebDriver
 * @author Yuva
 *
 */

public class webDriverUtility {

WebDriver driver;
/**
 * This method is used to launch browser
 * @param browser
 * @param time
 * @param URL
 * @return
 * 
 */
public WebDriver openApplication(String browser, String URL, long time) {
	switch(browser) {
	/**
	 * This is about the switch keyword in java(The switch keyword selects one of many code blocks to be executed. From the example,
	 * above, it works like this: The switch expression is evaluated once. The value of the expression is compared with the values of each case . 
	 * If there is a match, the associate block of code is executed.)
	 */
	case "chrome": driver= new ChromeDriver(); break;
	case "firefox": driver=new FirefoxDriver();break;
	case "edge"   : driver=new EdgeDriver(); break;
	default: System.out.println("Invalid browser data");
	}
	driver.manage().window().maximize();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	return driver;
}
/**
 * This method is used to mouse hover on an element
 * @param element
 */
public void mouseHover(WebElement element) {
	Actions a= new Actions(driver);
	a.moveToElement(element).perform();
}
/**
 * This method is used to double click on an element
 * @param element
 */
public void doubleClicOnElement(WebElement element) {
	Actions a= new Actions(driver);
	a.doubleClick(element).perform();
}
/**
 * This method is used to drag and drop an element
 * @param src
 * @param dest
 */
public void dragAndDropElement(WebElement src, WebElement dest) {
	Actions a=new Actions(driver);
	a.dragAndDrop(src, dest).perform();
}
/**
 * This method is used to select an element from the drag and drop based on the index
 * @param element
 * @param index
 */
public void dropDown(WebElement element, int index) {
	Select s= new Select(element);
	s.selectByIndex(index);
	
}
/**
 * This method is used to select an element from drop down based on text
 * @param element
 * @param value
 * @param text 
 */
public void dropDown(WebElement element, String text) {
	Select s= new Select(element);
	s.selectByVisibleText(text);

}
/**
 * This method is used to select an element from drop down based on value
 * @param element
 * @param value
 */
public void dropDown1(WebElement element, String value) {
	Select s=new Select(element);
	s.selectByValue(value);
}
/**
 * This method is used to switch to frame based on the index
 */
public void switchToFrame() {
	driver.switchTo().frame(0);
}
/**
 * This method is used to switch back from frame
 */
public void switchBackFromFrame() {
	driver.switchTo().defaultContent();
}
/**
 * This method is used to handle alert by
 */
public void handleAlert() {
	driver.switchTo().alert().accept();
}
/**
 * This method is used to  handle child browser pop up
 */
public void handleChildBrowser() {
	Set<String> windowIDs=driver.getWindowHandles();
	for(String string:windowIDs) {
		driver.switchTo().window(string);
	}
}
/**
 * This method is used to get the parent window ID
 */
public void switchToParentWindow() {
	driver.switchTo().window(driver.getWindowHandle());
	
}
/**
 * This method is used to scroll the page till web element
 * @param element
 */
public void scrollToElement(WebElement element ) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",element);
}
/**
 * This method is used to fetch the screenshot based on base^4 format
 */
public void takeScreenshot() {
 TakesScreenshot ts=(TakesScreenshot)driver;
 File src=ts.getScreenshotAs(OutputType.FILE);
 File dest=new File("./Screenshot/picture.png");
 try {
	 FileUtils.copyFile(src, dest);
 }catch(IOException e) {
	 e.printStackTrace();
 }
}
/**
 * This method is used to close current window
 * @param time
 * @param element
 */
public void explicitwait(long time, WebElement element) {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(time));
	wait.until(ExpectedConditions.visibilityOf(element));
}
/**
 * This method is used to close all the windows and exist browser
 */
public void closeCurrentwindow() {
	driver.close();
}
public void quitBrowser() {
	driver.quit();
}
}
