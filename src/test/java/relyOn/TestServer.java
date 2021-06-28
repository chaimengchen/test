package relyOn;

import org.testng.annotations.Test;

@Test(groups = "deploy")
public class TestServer {
    @Test
    public void deployServer(){
        System.out.println("deploying server......");
    }
    @Test(dependsOnMethods = {"deployServer"})
    public void deployBackUpServer(){
        System.out.println("deploying backup server");
    }
}
