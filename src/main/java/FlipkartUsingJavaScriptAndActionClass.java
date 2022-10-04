import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FlipkartUsingJavaScriptAndActionClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        WebElement crossButton= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        JavascriptExecutor jse= (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()",crossButton);
        WebElement electronics=driver.findElement(By.xpath("//img[@alt='Electronics']"));
        WebElement grocery= driver.findElement(By.xpath("//img[@alt='Grocery']"));
        Actions act=new Actions(driver);
        act.moveToElement(electronics).build().perform();
        Thread.sleep(2000);
        act.keyUp(electronics,Keys.ALT).build().perform();
        act.keyUp(electronics,Keys.ALT).build().perform();
        act.doubleClick(grocery).build().perform();
        jse.executeScript("window.scrollBy(0,400)");
        jse.executeScript("window.scrollBy(0,-400)");
        WebElement crossbow= driver.findElement(By.xpath("//span[@class='_3jFf_Z']"));
        jse.executeScript("arguments[0].click()",crossbow);
        driver.findElement(By.xpath("//a[@class='_1_3w1N _3ZeGqx']")).click();
       driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("pwn955@gmail.com");
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567890");
    }
}
