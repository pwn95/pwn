package Sep_17;
import org.testng.annotations.Test;
public class TestNG_alwaysRun_And_Enabled {
    /*encase alwaysRun = true and enabled = false both are present in same testcase then testcase will not
     execute because enabled = false is more powerful then alwaysRun = true */
    @Test(priority = 1,alwaysRun = true,enabled = false)
    public void begin(){
        System.out.println("begin test method");
    }
    @Test(priority = 2)
    public void inBetween(){
        System.out.println("inBetween test method");
    }
    @Test(priority = 3)
    public void almostComplete(){
        System.out.println("almostComplete test method");
    }
    @Test(priority = 4)
    public void completed(){
        System.out.println("completed test method");
    }
}
