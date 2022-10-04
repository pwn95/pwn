package Sep_17;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNG_alwaysRun {
    /*if test skipping any test, and we want to run that test in that case we use alwaysRuns=true*/
    @Test
    public void letsGo(){
        System.out.println("letsGo Method");
        Assert.fail("Forcefully Failed.");
    }
    @Test(dependsOnMethods = "letsGo",alwaysRun = true)
    public void ready(){
        System.out.println("Ready Method");
    }
    @Test(dependsOnMethods = {"letsGo","ready"})
    public void steady(){
        System.out.println("Steady Method");
    }
    @Test(dependsOnMethods = {"letsGo","ready","steady"})
    public void run(){
        System.out.println("Run Method");
    }
}
