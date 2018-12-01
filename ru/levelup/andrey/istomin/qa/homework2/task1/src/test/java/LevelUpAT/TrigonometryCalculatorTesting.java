package LevelUpAT;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrigonometryCalculatorTesting {

    Calculator calculator;

    // инициализация калькулятора

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    // синус

    @Test(dataProvider = "oneDoubleNumber", dataProviderClass = DataProviderClass.class)
    public void sinTest(double a) {
        Assert.assertEquals(calculator.sin(a), Math.sin(a));
    }

    // косинус

    @Test(dataProvider = "oneDoubleNumber", dataProviderClass = DataProviderClass.class)
    public void cosTest(double a) {
        Assert.assertEquals(calculator.cos(a), Math.cos(a));
    }

    // тангенс

    @Test(dataProvider = "oneDoubleNumber", dataProviderClass = DataProviderClass.class)
    public void tanTest(double a) {
        Assert.assertEquals(calculator.tg(a), Math.tan(a));
    }

    // котангенс

    @Test(dataProvider = "oneDoubleNumber", dataProviderClass = DataProviderClass.class)
    public void ctanTest(double a) {
        Assert.assertEquals(calculator.ctg(a), 1.0/Math.tan(a));
    }

}
