import org.junit.Test;
import org.testng.Assert;

public class firstbags {
    @Test
    public void firstbags(){
        firstAtSchool school = new firstAtSchool();
        String[] bags1 = {"books","notesbook","pens"};
        Assert.assertEquals(bags1,school.mybags());
    }
}
