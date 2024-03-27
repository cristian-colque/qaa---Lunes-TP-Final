package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.github.javafaker.Faker;

public class BasePage {

    protected static WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    static {
        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
        }
        
    }
 
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }
 
    public static void navigateTo(String url) {
        driver.get(url);
    }
 
    public static void closeBrowser() {
        driver.quit();
    }
 
    public WebElement find(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }
 
    public void clickElement(String locator) {
        find(locator).click();
    }
 
    public void write(String locator, String keysToSend) {
        find(locator).clear();
        find(locator).sendKeys(keysToSend);
    }

    public String obteneString(String locator){
       return find(locator).getText();
    }
 
    public void selectFromDropdownByValue(String locator, String value) {
        Select dropdown = new Select(find(locator));
 
        dropdown.selectByValue(value);
    }
 
    public void selectFromDropdownByIndex(String locator, Integer index) {
        Select dropdown = new Select(find(locator));
 
        dropdown.selectByIndex(index);
    }

    public boolean elementIsDisplayed(String locator){
        return find(locator).isDisplayed();
    } 

    Faker faker = new Faker();
}
