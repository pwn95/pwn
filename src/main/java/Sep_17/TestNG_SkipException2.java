package Sep_17;
import org.testng.SkipException;
import org.testng.annotations.Test;
public class TestNG_SkipException2 {
    @Test
    public void pawan(){
        System.out.println("Pawan Method");
    }
    @Test
    public void ekansh(){
        System.out.println("Ekansh Method");
    }
    @Test
    public void abhishek(){
        throw new SkipException("Abhishek Method Skipped");
    }
}
