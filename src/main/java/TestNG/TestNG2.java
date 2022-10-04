package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNG2 {
    public static WebDriver driver;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http:/facebook.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void Launch() throws InterruptedException {
        String wb=driver.getTitle();
        System.out.println(wb);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Pwn955@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("8700004917");
        Thread.sleep(2000);
    }
    @Test
    public void Click(){
        String wb=driver.getTitle();
        System.out.println(wb);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
    }
}
