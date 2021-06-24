import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculateTest {
    private int first;
    private int second;
    private int expected;

    public CalculateTest(int expectedResult,int firstNumber,int secondNumber){
        this.first=firstNumber;
        this.second=secondNumber;
        this.expected=expectedResult;
    }

    @Parameterized.Parameters
    public static Collection addNumber(){
        return Arrays.asList(new Integer[][]{{3,1,2},{2,1,1},{3,1,2}});
    }

    @Test
    public void getval(){
        Demo add = new Demo();
        System.out.println(first +" and "+second);
        Assert.assertEquals(expected,add.sum(first,second));
        System.out.println("22222");
    }

}
