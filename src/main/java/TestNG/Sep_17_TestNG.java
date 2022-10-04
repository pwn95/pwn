package TestNG;
import org.testng.annotations.*;
public class Sep_17_TestNG {
    @BeforeMethod
    public void c(){
        System.out.println("This Is c BeforeTest Method");
    }
    @Test (priority=1)
    public void b(){
        System.out.println("This Is b Test Method");
    }
    @Test(priority=2)
    public void a(){
        System.out.println("This Is a Test Method");
    }
    @AfterMethod
    public void i(){
        System.out.println("This Is i AfterTest Method");
    }
}
