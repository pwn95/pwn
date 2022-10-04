import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
public class Facebook {
    public static void main(String[] args) throws InterruptedException, IOException {
        File scr=new File("C:\\Users\\HP\\Idea Projects\\Selenium23-08-2022\\src\\main\\resources\\Login.properties");
        FileInputStream fis=new FileInputStream(scr);
        Properties pro=new Properties();
        pro.load(fis);
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('email').value='pwn955@gmail.com'");
        //driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("pwn955@gmail.com");
        driver.findElement(By.xpath(pro.getProperty("pass"))).sendKeys("1234567890");
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys(pro.getProperty("sendkey"));
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bhandari");
        Select select=new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
        select.selectByVisibleText("6");
        Select select1=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        select1.selectByValue("1");
        Select select2=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        select2.selectByValue("2001");
        driver.findElement(By.xpath("//input[@value='2']")).click();

    }
}
