import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScript {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://facebook.com");
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("document.getElementById('email').value='pwn955@gmail.com'");
        jse.executeScript("document.getElementById('pass').value='1234567890'");
        WebElement createNewAccount= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        jse.executeScript("arguments[0].click()",createNewAccount);
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,400)");
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,-400)");
    }
}
