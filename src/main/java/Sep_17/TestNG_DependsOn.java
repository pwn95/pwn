package Sep_17;
import org.testng.annotations.Test;
public class TestNG_DependsOn {
    /*dependsOnMethods attribute on a test method [test1 e.g.] specifies all the test methods [test2, test3,..]
     this test method depends on. It means test1 will start execution only after all the tests it depends on
     executed successfully. If any of the tests specified via dependsOnMethods attribute failed, then test1
     will be skipped.*/
    @Test(priority = 1)
    public void begin(){
        System.out.println("begin test method");
    }
    @Test(priority = 2,dependsOnMethods = "begin")
    public void inBetween(){
        System.out.println("inBetween test method");
    }
    @Test(priority = 3,dependsOnMethods = {"begin","inBetween"})
    public void almostComplete(){
        System.out.println("almostComplete test method");
    }
    @Test(priority = 4,dependsOnMethods = {"begin","inBetween","almostComplete"})
    public void completed(){
        System.out.println("completed test method");
    }
}
