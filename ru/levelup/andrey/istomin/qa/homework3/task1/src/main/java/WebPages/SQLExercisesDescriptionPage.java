package WebPages;

import AbstractPage.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class SQLExercisesDescriptionPage extends AbstractPage {

    public static final String SQL_EXERCISES_DESCRIPTION_PAGE_URL = "https://www.w3schools.com/sql/sql_exercises.asp";

    public SQLExercisesDescriptionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id=\"main\"]//a[@href='exercise.asp']\n")
    private WebElement startSQLExercisesButton;


    public FirstSQLExercisePage clickStartSQLExercisesButton() {
        final Set<String> oldWindowsSet = driver.getWindowHandles();
        new Actions(driver).click(startSQLExercisesButton).build().perform();
        this.switchToNewWindow(oldWindowsSet);
        return new FirstSQLExercisePage(driver);
    }
}
