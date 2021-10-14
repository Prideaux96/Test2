import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    @Test
    public void testGetClassNumber()
    {
        MainClass test = new MainClass();
        int result = test.getClassNumber();
        Assert.assertTrue("classNumber <= 45" ,result > 45);
    }

}
