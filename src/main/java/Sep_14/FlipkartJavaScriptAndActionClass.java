package Sep_14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FlipkartJavaScriptAndActionClass {
    public static void main(String[] args) throws IOException {
        File f1= new File("C:\\Users\\HP\\Idea Projects\\Selenium23-08-2022\\src\\main\\resources\\Sep_14.properties");
        FileInputStream fis=new FileInputStream(f1);
        Properties p1=new Properties();
        p1.load(fis);
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https:/flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        WebElement button1= driver.findElement(By.xpath("//img[@alt='Electronics']"));
        Actions act=new Actions(driver);
        act.moveToElement(button1).build().perform();
        WebElement button2= driver.findElement(By.xpath("//div[text()='Top Offers']"));
        act.doubleClick(button2).build().perform();

    }
}
