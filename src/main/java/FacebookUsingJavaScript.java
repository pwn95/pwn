import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookUsingJavaScript {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //Send data without using sendkeys.
        JavascriptExecutor jse=(JavascriptExecutor)driver;
        jse.executeScript("document.getElementById('email').value='pwn955@gmail.com'");
        //Scroll Up.
        jse.executeScript("window.scrollBy(0,400)");
        //Scroll Down.
        jse.executeScript("window.scrollBy(0,-400)");
        //driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("pwn955@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234567890");
        WebElement registrationFormButton=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        jse.executeScript("arguments[0].click()",registrationFormButton);
      //  driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Abhishek");
       // driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bhandari");
        Select select=new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
        select.selectByVisibleText("6");
        Select select1=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        select1.selectByValue("1");
        Select select2=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        select2.selectByValue("2001");
        WebElement maleRadioButton=driver.findElement(By.xpath("//input[@value='2']"));
        //click on a specific WebElement.
        jse.executeScript("arguments[0].checked=true",maleRadioButton);

    }
}
