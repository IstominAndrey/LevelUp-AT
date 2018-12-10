package WebPages;

import AbstractPage.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SQLTutorialPage extends AbstractPage {

    protected SQLTutorialPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id=\"leftmenuinnerinner\"]/a[@href='sql_where.asp']")
    private WebElement SQLWhereItem;

    public SQLWhereClausePage clickSQLWhereItem() {
        new Actions(driver).click(SQLWhereItem).build().perform();
        return new SQLWhereClausePage(driver);
    }
}
