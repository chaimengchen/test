import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.notification.RunListener;

public class RuleTest {
    @Rule
    public TestName name = new TestName();

    @Test
    public void Test_one(){
        System.out.println(name.getMethodName());
        Assert.assertEquals("Test_one",name.getMethodName());
    }
    @Test(expected = ArithmeticException.class)   //测试异常，1/0是一个被预期的异常，所以，Test_two会通过测试
    public void Test_two(){
        int i =1/0;
        System.out.println(name.getMethodName());
        Assert.assertEquals("Test_two",name.getMethodName());
    }
    @Test(timeout = 1000)
    public void timeTest(){
        while (true){}
    }

}
