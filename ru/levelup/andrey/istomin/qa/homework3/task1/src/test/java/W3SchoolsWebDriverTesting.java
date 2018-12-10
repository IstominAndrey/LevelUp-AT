
import WebPages.*;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static WebPages.FirstSQLExercisePage.CORRECT_RESPONSE;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public class W3SchoolsWebDriverTesting {

    private WebDriver driver;

    @Before
    public void initDriver() {
        FirefoxDriverManager.getInstance().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\2isto\\.m2\\repository\\webdriver\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get(W3SchoolsHomePage.W3SCHOOLS_SITE_URL);
        //driver.get("https://www.w3schools.com/sql/exercise.asp");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void openW2SchoolHomePage() {
        W3SchoolsHomePage homePage = new W3SchoolsHomePage(driver);
        assertThat("reason",  driver.getTitle(),
                   containsString(W3SchoolsHomePage.W3SCHOOLS_HOMEPAGE_TITLE));
    }

    @Test
    public void sqlExerciseTest() {
       FirstSQLExercisePage firstSQLExercisePage = new W3SchoolsHomePage(driver)
                .clickDropdownMenuExamples()
                .clickDropdownMenuItemSQLExercises()
                .clickStartSQLExercisesButton()
                .inputTextIntoExerciseTextField(FirstSQLExercisePage.CORRECT_INPUT)
                .clickSubmitAnswerButton();
       assertThat("Не прошел тест SQL Exercise",
                firstSQLExercisePage.checkExerciseResponse(),
                containsString(firstSQLExercisePage.CORRECT_RESPONSE));

    }

    @Test
    public void xmlHttpRequestExampleTest() throws InterruptedException {
        XMLHttpRequestTutorialPage xmlHttpRequestTutorialPage = new W3SchoolsHomePage(driver)
                .clickLearnXMLItem()
                .clickXMLHttpRequestItem()
                .inputExampleTextField("A");
        //Thread.sleep(5000);
        assertThat("Не прошел тест XML Http Request",
                xmlHttpRequestTutorialPage.checkExampleResult(),
                containsString("Anna, Amanda"));
    }

    @Test
    public void colorPickerTest() {
        ColorPickerPage colorPickerPage = new W3SchoolsHomePage(driver)
                .clickColorPicker()
                .inputColor("00ff00")
                .clickOkColorButton();                                      // не срабатывает нажатие на кнопку
        assertThat("Не прошел тест Color Picker",
                colorPickerPage.checkPickedColor(),
                containsString("00ff00"));
    }

    @Test
    public void sqlWhereExampleTest() {
        SQLWhereExamplePage sqlWhereExamplePage = new W3SchoolsHomePage(driver)
                .clickDropdownMenuTutorials()
                .clickDropdownMenuItemLearnSQL()
                .clickSQLWhereItem()
                .clickTryItYourselfNumericFieldsButton()
                .clickRunSQLButton();
        assertThat("Не прошел тест SQL Where Example",
                sqlWhereExamplePage.checkSQLResult(),
                containsString("1"));
    }

    @Test
    public void JavaScriptReferenceTest() {
        JavaScriptArrayReferencePage javaScriptArrayReferencePage = new W3SchoolsHomePage(driver)
                .clickDropdownMenuReference()
                .clickDropdownMenuItemJavaScriptReference()
                .clickNextButton();
        assertThat("Не прошел тест JavaScript Reference",
                driver.getTitle(),
                containsString(javaScriptArrayReferencePage.JAVA_SCRIPT_ARRAY_REFERENCE_PAGE_TITLE));

    }
}




