package LevelUpAT;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    // дата провайдеры

    @DataProvider
    public Object[][] twoLongNumbers(){
        return new Object[][] {
                {-2, -3},
                {20, 35},
                {0, 15},
                {-32, 0},
                {55, -13}
        };
    }

    @DataProvider
    public Object[][] twoDoubleNumbers(){
        return new Object[][] {
                {-2.5, -68.65},
                {5.5, 0.625},
                {0.0, 15.5},
                {-36.6, 0.0},
                {52.6, -63.85}
        };
    }

    @DataProvider
    public Object[][] oneDoubleNumber(){
        return new Object[][] {
                {-0.625},
                {0.0},
                {5},
                {-36},
                {52.6}
        };
    }

    @DataProvider
    public Object[][] oneLongNumber(){
        return new Object[][] {
                {-10},
                {-1},
                {0},
                {1},
                {15}
        };
    }

}
