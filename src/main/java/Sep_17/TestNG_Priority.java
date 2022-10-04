package Sep_17;
import org.testng.annotations.Test;
public class TestNG_Priority {
    @Test(priority = -2)
    public void v(){
        System.out.println("This Is V Test Case");
    }
    @Test(priority = -20)
    public void x(){
        System.out.println("This Is X Test Case");
    }
    @Test(priority = 1)
    public void y(){
        System.out.println("This Is Y Test Case");
    }
    @Test(priority = 2)
    public void k(){
        System.out.println("This Is K Test Case");
    }
}
