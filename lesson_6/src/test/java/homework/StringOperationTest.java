package homework;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringOperationTest {


    @DataProvider
    public Object[][] getStrings() {
        return new Object[][] {
                {"Test"},
                {"TTest"},
                {"sfdste"},
                {"32TE"}};
    }

    // Проверка на наборе параметров
    @Test(dataProvider = "getStrings")
    public void testIsStringContainsUpperCase(String string1) {
        StringOperation stringOperation = new StringOperation();
        Boolean actualResult = stringOperation.isStringContainsUpperCase(string1);
        Assert.assertTrue(actualResult);
    }

    // Позитивная проверка
    @Test
    public void testIsStringContainsNumbers() {
        StringOperation stringOperation = new StringOperation();
        Boolean actualResult = stringOperation.isStringContainsNumbers("Contains 1234");
        Assert.assertTrue(actualResult);
    }

    // Игнорирование теста
    @Test(enabled = false)
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