package homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringOperation2Test {

    @Test
    public void testIsStringContainsUpperCase() {
        StringOperation stringOperation = new StringOperation();
        Boolean actualResult = stringOperation.isStringContainsUpperCase("test Word");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void testIsStringContainsNumbers() {
        StringOperation stringOperation = new StringOperation();
        Boolean actualResult = stringOperation.isStringContainsNumbers("Contains 1234");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void testIsFirstLetterCapital() {
        StringOperation stringOperation = new StringOperation();
        Boolean actualResult = stringOperation.isFirstLetterCapital("Contains 1234");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void testIsLengthEven() {
        StringOperation stringOperation = new StringOperation();
        Boolean actualResult = stringOperation.isLengthEven("Contains 1234");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void testIsMoreThanThree() {
        StringOperation stringOperation = new StringOperation();
        Boolean actualResult = stringOperation.isMoreThanThree("Contains 1234");
        Assert.assertTrue(actualResult);
    }
}