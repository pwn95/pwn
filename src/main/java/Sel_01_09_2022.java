import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Sel_01_09_2022 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@value='radio1']")).click();
        Select select = new Select(driver.findElement(By.xpath("//select[@name='dropdown-class-example']")));
        select.selectByIndex(1);
        driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
        driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("Pawan");
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[3]/td[3]")).getText());
        List<WebElement> allEntries= driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr"));
        System.out.println(allEntries.size());
        driver.findElement(By.xpath("//a[@id='opentab']")).click();
    }
}
