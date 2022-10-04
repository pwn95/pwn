package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class TestNG {
    public static WebDriver driver;
    @BeforeTest
    public void launchChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http:/google.co.in/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
    }
    @Test
    public void launchFacebook(){
        driver.navigate().to("http://facebook.com/");
        System.out.println(driver.getTitle());
        System.out.println( driver.getCurrentUrl());
    }
    @Test(priority = 2)
    public void a(){
        System.out.println("This Is a Method.");
    }
    @AfterTest
    public void b() throws IOException {
        System.out.println("This Is AfterTest Method.");
    }
}
