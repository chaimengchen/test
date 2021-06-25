import org.junit.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DBConfig {
    @BeforeSuite
    public void beforeSuite(){

        System.out.println("beforeSuite");
        System.out.println("Test this branch");
    }
    @AfterSuite
    public void afterSuite(){

        System.out.println("afterSuite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest(){

        System.out.println("afterTest");
    }
}
