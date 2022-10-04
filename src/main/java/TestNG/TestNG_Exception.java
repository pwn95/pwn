package TestNG;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_Exception {
    @Test(enabled = false)
    public void e(){
    System.out.println("This is e Method");
}
    @Test(priority = 3)
    public void f(){
        System.out.println("This is f Method");
    }
    @Test(priority = 1)
    public void g(){
        System.out.println("This is g Method");
    }
    @Test(priority = 5)
    public void h(){
        throw new SkipException("Skipped");
    }
}
