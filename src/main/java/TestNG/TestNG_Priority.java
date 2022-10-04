package TestNG;
import org.testng.annotations.Test;
public class TestNG_Priority {
    @Test(priority = -10)
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
    @Test(priority = -20)
    public void e(){
        System.out.println("This is e Method");
    }
}
