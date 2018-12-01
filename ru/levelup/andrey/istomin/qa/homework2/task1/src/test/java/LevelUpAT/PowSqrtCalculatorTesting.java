package LevelUpAT;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PowSqrtCalculatorTesting {

    Calculator calculator;

    // инициализация калькулятора

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    // возведение в степень double чисел

    @Test(dataProvider = "twoDoubleNumbers", dataProviderClass = DataProviderClass.class)
    public void powTest(double a, double b) {
        Assert.assertEquals(calculator.pow(a, b), Math.pow(a, b));
    }


    // квадратный корень

    @Test(dataProvider = "oneDoubleNumber", dataProviderClass = DataProviderClass.class)
    public void sqrtTest(double a) {
        Assert.assertEquals(calculator.sqrt(a), Math.sqrt(a));
    }
}
