package LevelUpAT;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;



public class SumSubCalculatorTesting {

    Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    // сложение long чисел

    @Test(dataProvider = "twoLongNumbers", dataProviderClass = DataProviderClass.class)
    public void longSumTest(long a, long b) {
        Assert.assertEquals(calculator.sum(a, b), a + b);
    }

    // сложение double чисел

    @Test(dataProvider = "twoDoubleNumbers", dataProviderClass = DataProviderClass.class)
    public void doubleSumTest(double a, double b) {
        Assert.assertEquals(calculator.sum(a, b), a + b);
    }

    // вычитание long чисел

    @Test(dataProvider = "twoLongNumbers", dataProviderClass = DataProviderClass.class)
    public void longSubTest(long a, long b) {
        Assert.assertEquals(calculator.sub(a, b), a - b);
    }

    // вычитание double чисел

    @Test(dataProvider = "twoDoubleNumbers", dataProviderClass = DataProviderClass.class)
    public void doubleSubTest(double a, double b) {
        Assert.assertEquals(calculator.sub(a, b), a - b);
    }
}
