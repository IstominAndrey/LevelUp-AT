package WebPages;

import AbstractPage.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FirstSQLExercisePage extends AbstractPage {

    public static final String FIRST_SQL_EXERCISE_PAGE_URL = "https://www.w3schools.com/sql/exercise.asp";
    public static final String CORRECT_INPUT = "SELECT";
    public static final String CORRECT_RESPONSE = "Correct!";

    public FirstSQLExercisePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//pre[@id=\"assignmentcontainer\"]/input[@class='editablesection']")
    private WebElement answerTextField;

    @FindBy(xpath = "//button[@id=\"answerbutton\"]")
    private WebElement submitAnswerButton;

    @FindBy(xpath = "//div[@id='assignmentCorrect']/h2")
    private WebElement exerciseResponce;


    public FirstSQLExercisePage inputTextIntoExerciseTextField(String correctAnswer) {
        new Actions(driver).sendKeys(answerTextField, correctAnswer).build().perform();
        return this;
    }


    public FirstSQLExercisePage clickSubmitAnswerButton() {
        new Actions(driver).click(submitAnswerButton).build().perform();
        return this;
    }

    public String checkExerciseResponse() {
        return driver.findElement(By.xpath("//div[@id='assignmentCorrect']/h2")).getText();
    }
}
