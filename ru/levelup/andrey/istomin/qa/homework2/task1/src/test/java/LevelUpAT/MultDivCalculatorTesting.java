package LevelUpAT;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultDivCalculatorTesting {

    Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    // умножение long чисел

    @Test(dataProvider = "twoLongNumbers", dataProviderClass = DataProviderClass.class)
    public void longMultTest(long a, long b) {
        Assert.assertEquals(calculator.mult(a, b), a * b);
    }

    // умножение double чисел

    @Test(dataProvider = "twoDoubleNumbers", dataProviderClass = DataProviderClass.class)
    public void doubleMultTest(double a, double b) {
        Assert.assertEquals(calculator.mult(a, b), a * b);
    }

    // деление long чисел

    @Test(dataProvider = "twoLongNumbers", dataProviderClass = DataProviderClass.class)
    public void longDivTest(long a, long b) {
        boolean divideByZero = false;
        try {
            Assert.assertEquals(calculator.div(a, b), a / b);
        } catch (NumberFormatException e) {
            divideByZero = true;
            Assert.assertTrue(divideByZero);
        }
    }

    // деление double чисел

    @Test(dataProvider = "twoDoubleNumbers", dataProviderClass = DataProviderClass.class)
    public void doubleDivTest(double a, double b) {
        Assert.assertEquals(calculator.div(a, b), a / b);
    }


}
