package Sep_17;
import org.testng.annotations.Test;
public class TestNG_Enabled {
    @Test
    public void letsGo(){
        System.out.println("letsGo Method");
    }
    @Test(enabled = false)
    public void ready(){
        System.out.println("Ready Method");
    }
    @Test(enabled = false)
    public void steady(){
        System.out.println("Steady Method");
    }
    @Test
    public void go(){
        System.out.println("Go Method");
    }
}
