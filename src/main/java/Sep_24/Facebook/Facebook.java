package Sep_24.Facebook;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Facebook {
    public static WebDriver driver;
    public static void main(String[] args) throws IOException {
            File src = new File("C:\\Users\\HP\\Idea Projects\\Selenium23-08-2022\\src\\main\\resources\\Sep24.properties");
            FileInputStream fis = new FileInputStream(src);
            Properties prop = new Properties();
            prop.load(fis);
            System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://facebook.com/");
            driver.findElement(By.xpath(prop.getProperty("name"))).sendKeys(prop.getProperty("namebox"));
            WebElement clickButton= driver.findElement(By.xpath("//button[@name='login']"));
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()",clickButton);
    }
}
