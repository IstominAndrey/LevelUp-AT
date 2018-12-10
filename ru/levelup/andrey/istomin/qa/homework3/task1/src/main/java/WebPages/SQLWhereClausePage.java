package WebPages;

import AbstractPage.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class SQLWhereClausePage extends AbstractPage {


    protected SQLWhereClausePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id=\"main\"]//a[@href='trysql.asp?filename=trysql_select_where_number']")
    private WebElement tryItYourselfNumericFieldsButton;


    public SQLWhereExamplePage clickTryItYourselfNumericFieldsButton() {
        final Set<String> oldWindowsSet = driver.getWindowHandles();
        new Actions(driver).click(tryItYourselfNumericFieldsButton).build().perform();
        this.switchToNewWindow(oldWindowsSet);
        return new SQLWhereExamplePage(driver);

    }
}
