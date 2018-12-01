package LevelUpAT;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PositiveNegativeCalculatorTesting {

    Calculator calculator;

    // инициализация калькулятора

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    // положительное число

    @Test(dataProvider = "oneLongNumber", dataProviderClass = DataProviderClass.class)
    public void isPositiveTest(long a) {
        Assert.assertEquals(calculator.isPositive(a), a > 0);
    }

    // отрицательное число

    @Test(dataProvider = "oneLongNumber", dataProviderClass = DataProviderClass.class)
    public void isNegativeTest(long a) {
        Assert.assertEquals(calculator.isNegative(a), a < 0);
    }
}
