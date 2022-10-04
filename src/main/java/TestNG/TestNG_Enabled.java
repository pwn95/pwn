package TestNG;
import org.testng.annotations.Test;
public class TestNG_Enabled {
    @Test(enabled = false)
    public void a(){
        System.out.println("This is a Method");
    }
    @Test(priority = 2)
    public void b(){
        System.out.println("This is b Method");
    }
    @Test(priority = 0)
    public void d(){
        System.out.println("This is c Method");
    }
    @Test
    public void c(){
        System.out.println("This is d Method");
    }
    @Test(enabled = false)
    public void e(){
        System.out.println("This is e Method");
    }
}
