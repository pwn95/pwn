import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Sele23_08_2022 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//a[@rel='async']")).click();
        Select dropDown= new Select(driver.findElement(By.xpath("//*[@id='day']")));
        dropDown.selectByValue("20");
        Select birthMonth= new Select(driver.findElement(By.xpath("//*[@id='month']")));
        birthMonth.selectByVisibleText("Aug");
        Select birthYear= new Select(driver.findElement(By.xpath("//*[@id='year']")));
        birthYear.selectByVisibleText("1990");
    }
}
