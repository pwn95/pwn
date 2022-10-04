package TestNG;

import org.testng.annotations.*;

public class Sep_16_TestNG {
    @BeforeTest
    public void c(){
        System.out.println("This Is c BeforeTest Method");
    }
    @BeforeMethod
    public void d(){
        System.out.println("This Is d BeforeMethod Method");
    }
    @BeforeClass
    public void e(){
        System.out.println("This Is e BeforeClass Method");
    }
    @BeforeSuite
    public void f(){
        System.out.println("This Is f BeforeSuite Method");
    }
    @Test (priority=1)
    public void b(){
        System.out.println("This Is b Test Method");
    }
    @Test
    public void a(){
        System.out.println("This Is a Test Method");
    }
    @AfterMethod
    public void g(){
        System.out.println("This Is g AfterMethod Method");
    }
    @AfterClass
    public void h(){
        System.out.println("This Is h AfterClass Method");
    }
    @AfterTest
    public void i(){
        System.out.println("This Is i AfterTest Method");
    }
    @AfterSuite
    public void j(){
        System.out.println("This Is j AfterSuite Method");
    }
}
