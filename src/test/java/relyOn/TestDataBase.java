package relyOn;

import org.testng.annotations.Test;

import java.util.concurrent.TimeoutException;

public class TestDataBase {
    @Test(groups = "db",dependsOnGroups = "deploy")
    public void initDB(){
        System.out.println("this is initDB()");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"initDB"},groups = "db")
    public void testConnetionDB(){
        System.out.println("this is testConectionDB");
    }
}
