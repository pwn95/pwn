package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;
public class TestNG1 {
   public static WebDriver driver;
    @BeforeTest
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void maximize(){
        String Tittle=driver.getTitle();
        System.out.println("Tittle of Page is "+Tittle);
    }
    @Test
    public static void logoCheck()
    {
        boolean button= driver.findElement(By.xpath("//a[text()='Gmail']")).isDisplayed();
        System.out.println(button);
       assertTrue(button);
    }
}
