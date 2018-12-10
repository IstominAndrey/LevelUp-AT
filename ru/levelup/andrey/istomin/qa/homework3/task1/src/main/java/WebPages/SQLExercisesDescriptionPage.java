package WebPages;

import AbstractPage.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

import static WebPages.FirstSQLExercisePage.FIRST_SQL_EXERCISE_PAGE_URL;

public class SQLExercisesDescriptionPage extends AbstractPage {


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
