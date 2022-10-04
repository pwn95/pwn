package Sep_17;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Flipkart {
    public static WebDriver driver;
    @BeforeTest
    public void initialization(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://google.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void launchApplication(){
        driver.navigate().to("https://flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
    }
    @Test
    public void loginInApplication(){

    }
}
