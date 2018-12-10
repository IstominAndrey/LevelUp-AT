package WebElements;

import AbstractPage.AbstractPage;
import WebPages.XMLTutorialPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePageNavigationMenu extends AbstractPage {

    public HomePageNavigationMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//nav[@id=\"mySidenav\"]/div/a[@href=\"/xml/default.asp\"]")
    private WebElement learnXMLItem;

    public XMLTutorialPage clickLearnXMLItem() {
        new Actions(driver).click(learnXMLItem).build().perform();
        return new XMLTutorialPage(driver);
    }
}
