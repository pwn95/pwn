import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GmailPropertiesFile {
    public static void main(String[] args) throws IOException {
        File fl=new File("C:\\Users\\HP\\Idea Projects\\Selenium23-08-2022\\src\\main\\resources\\GmailProperties.properties");
        FileInputStream fis=new FileInputStream(fl);
        Properties pr=new Properties();
        pr.load(fis);
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https:/google.co.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(pr.getProperty("HomeButton"))).click();
        driver.findElement(By.xpath(pr.getProperty("CreateAnAccount"))).click();
        driver.findElement(By.xpath(pr.getProperty("firstName"))).sendKeys("Pawan");
        driver.findElement(By.xpath(pr.getProperty("lastName"))).sendKeys("Kushwaha");
        driver.findElement(By.xpath(pr.getProperty("username"))).sendKeys("Pawan955");
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        WebElement SignInInstead= driver.findElement(By.xpath(pr.getProperty("SignInInstead")));
        jse.executeScript("arguments[0].click()",SignInInstead);
    }
}
