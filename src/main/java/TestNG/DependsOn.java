package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DependsOn {
    @Test(priority=1)
    public void c(){
        System.out.println("This Is c Test Method");
    }
    @Test(priority=4)
    public void b(){
        System.out.println("This Is b Test Method");
        Assert.fail("Forcefully Failed");
    }
    @Test(priority=2,dependsOnMethods = "b")
    public void a(){
        System.out.println("This Is a Test Method");
    }
    @Test(priority=3,dependsOnMethods = {"b","a"})
    public void d(){
        System.out.println("This Is d Test Method");
    }
    @Test(priority=5)
    public void i(){
        System.out.println("This Is i Test Method");
    }
}

