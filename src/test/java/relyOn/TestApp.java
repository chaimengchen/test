package relyOn;


import org.testng.annotations.Test;

public class TestApp {
    @Test(dependsOnGroups = {"deploy","db"})
    public void methods1(){
        System.out.println("this is methods1");
    }
    @Test(dependsOnMethods = "methods1")
    public void methods2(){
        System.out.println("this is methods2");
    }
}
