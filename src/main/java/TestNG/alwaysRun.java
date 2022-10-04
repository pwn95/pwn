package TestNG;
import org.testng.annotations.Test;
public class alwaysRun {
    /*alwaysRun=true(when TestNG skips a test case for whatever reason, and we want to execute testcase
      in that case se uses alwaysRun=true)*/
    /*enabled=false is more powerful than alwaysRun=true.if both are present in same test case than test
    will not execute.*/
    @Test(alwaysRun = true)
    public void e(){
        System.out.println("This is e TestCase");
    }
    @Test(alwaysRun = false)
    public void f(){
        System.out.println("This is f TestCase");
    }
    @Test
    public void c(){
        System.out.println("This is c TestCase");
    }
    @Test
    public void d(){
        System.out.println("This is d TestCase");
    }

}
