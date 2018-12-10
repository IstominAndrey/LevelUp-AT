package WebPages;

import AbstractPage.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class XMLTutorialPage extends AbstractPage {
    public XMLTutorialPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id=\"leftmenuinnerinner\"]/a[@href='xml_http.asp']")
    private WebElement xmlHttpRequestItem;

    public XMLHttpRequestTutorialPage clickXMLHttpRequestItem() {
        new Actions(driver).click(xmlHttpRequestItem).build().perform();
        return new XMLHttpRequestTutorialPage(driver);
    }
}
