import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PayTmFrames {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https:/paytm.com/");
        driver.manage().window().maximize();
        JavascriptExecutor jse=(JavascriptExecutor) driver;
      WebElement signInButton= driver.findElement(By.xpath("//span[text()='Sign In']"));
      jse.executeScript("arguments[0].click()",signInButton);
      int totalFrames=driver.findElements(By.tagName("iframe")).size();
        System.out.println(totalFrames);
        for(int i=0;i<totalFrames;i++){
           driver.switchTo().frame(i);
           if( driver.findElement(By.xpath("//span[@class='ng-scope']")).isDisplayed()){
               driver.findElement(By.xpath("//span[@class='ng-scope']")).click();
           }else {
               System.out.println("Controller Is Out Of Frame");
           }
        }
        int totalFramesOnLoginPage=driver.findElements(By.tagName("iframe")).size();
        System.out.println(totalFramesOnLoginPage);
    }
}
