package Sep_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class FbJavaScriptActionClass {
    public static void main(String[] args) throws IOException {
        File f1=new File("C:\\Users\\HP\\Idea Projects\\Selenium23-08-2022\\src\\main\\resources\\FbJavaScriptActionClass.properties");
        FileInputStream fis=new FileInputStream(f1);
        Properties pr=new Properties();
        pr.load(fis);
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http:/facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath(pr.getProperty("CreateNewAccount"))).click();
        driver.findElement(By.xpath(pr.getProperty("FirstName"))).sendKeys(pr.getProperty("name"));
        driver.findElement(By.xpath(pr.getProperty("LastName"))).sendKeys("Ekansh");
    }
}
