package dataprovider;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class charUtilTest {
    charUtils charUtils = new charUtils();
    @DataProvider
    public Object[][] validProvider(){
        return new Object[][]{
                { 'A', 65 },{ 'a', 97 },
                { 'B', 66 },{ 'b', 98 },
                { 'C', 67 },{ 'c', 99 },
                { 'D', 68 },{ 'd', 100 },
                { 'Z', 90 },{ 'z', 122 },
                { '1', 49 },{ '9', 57 }

        };
    }

    @Test(dataProvider = "validProvider")
    public void charToAcsiiTest(final char character, final int acsii){
        int result = charUtils.charToAscii(character);
        System.out.println(character +"转换为ascii码为:"+result);
        Assert.assertEquals(result,acsii);
    }
    @Test(dataProvider = "validProvider")
    public void acssiToCharTest(final char character,final int acsii){
        char result = charUtils.asciiToChar(acsii);
        System.out.println(acsii +"转换为char为:"+result);
        Assert.assertEquals(character,result);
    }


}
