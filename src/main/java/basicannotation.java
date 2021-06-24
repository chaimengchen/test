import org.junit.*;
import org.testng.Assert;

import java.util.ArrayList;

public class basicannotation {

    private ArrayList testList;
    Demo sum = new Demo();
    int getsum = sum.getval(5,2);
    int value = 6;
    @BeforeClass
    public  static void run_beforeclass(){
        System.out.println("@beforeclass:run_beforeclass");
    }

    @Before
    public void run_before(){
        testList = new ArrayList();
        System.out.println("@before:run_before");
    }

    @AfterClass
    public static void run_Afterclass(){
        System.out.println("@after:run_afterclass");

    }

    @After
    public void run_after(){
        testList.clear();
        System.out.println("@after:run_after");
    }

    @Ignore
    public void  test1(){
       System.out.println("@Test getvalue:"+value+"="+getsum);
       Assert.assertEquals(value,getsum);

    }
    @Test
    public void test_list(){
        Assert.assertTrue(testList.isEmpty());
        System.out.println("@test_list");
    }
    @Test
    public void isnotEmpty(){
        testList.add("one");
        Assert.assertEquals(1,testList.size());

    }
    @Test
    public void test_assert(){
        firstAtSchool school = new firstAtSchool();
        String[] bags1 = {"books","notesbook","pens"};
        String[] bags2 = {"books","notesbooks","pens","pencils"};
        Assert.assertEquals(bags1,school.mybags());
        Assert.assertEquals(bags2,school.now_mybags());

    }


}
