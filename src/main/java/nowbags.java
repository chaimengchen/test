import org.junit.Test;
import org.testng.Assert;

public class nowbags {
    @Test
    public void nowbags(){
        firstAtSchool school = new firstAtSchool();
        String[] bags1 = {"books","notesbooks","pens","pencils"};
        Assert.assertEquals(bags1,school.now_mybags());
    }
}
