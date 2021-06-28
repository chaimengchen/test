package relyOn;

import org.testng.annotations.Test;

public class App2 {
    @Test
    public void methods1(){
        System.out.println("this is methods1");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"methods1"})
    public void methods2(){
        System.out.println("this is methods2");
    }
}
