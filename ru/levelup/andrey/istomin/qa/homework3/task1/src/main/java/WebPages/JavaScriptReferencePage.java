package WebPages;

import AbstractPage.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class JavaScriptReferencePage extends AbstractPage {

    protected JavaScriptReferencePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id=\"main\"]/div[@class='w3-clear nextprev']/a[@href='jsref_obj_array.asp']")
    private WebElement nextButton;


    public JavaScriptArrayReferencePage clickNextButton() {
        new Actions(driver).click(nextButton).build().perform();
        return new JavaScriptArrayReferencePage(driver);
    }
}
