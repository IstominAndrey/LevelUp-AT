package WebPages;

import AbstractPage.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SQLWhereExamplePage extends AbstractPage {

    protected SQLWhereExamplePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@onclick=\"w3schoolsSQLSubmit();snhb.startAuction(['try_it_leaderboard']);\"]")
    private WebElement runSQLButton;


    public SQLWhereExamplePage clickRunSQLButton() {
        new Actions(driver).click(runSQLButton).build().perform();
        return new SQLWhereExamplePage(driver);
    }

    public String checkSQLResult() {
        return driver.findElement(By.xpath("//div[@id=\"divResultSQL\"]//table/tbody/tr[2]/td[1]")).getText();
    }
}
