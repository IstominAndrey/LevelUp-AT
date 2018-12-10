package WebPages;

import AbstractPage.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.annotation.ElementType;

public class XMLHttpRequestTutorialPage extends AbstractPage {

    protected XMLHttpRequestTutorialPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//form[@action='javascript:void(0);']//input[@id='txt1']")
    private WebElement xmlHttpResponseSuggestions;


    public XMLHttpRequestTutorialPage inputExampleTextField(String testText) {
        new Actions(driver).sendKeys(xmlHttpResponseSuggestions, testText).build().perform();
        return new XMLHttpRequestTutorialPage(driver);
    }

    public String checkExampleResult() {
        xmlHttpResponseSuggestions = (new WebDriverWait(driver, 10))            // явное ожидание не срабатывает
                .until(ExpectedConditions.visibilityOf(xmlHttpResponseSuggestions));            // через Thread.sleep работает
        return driver.findElement(By.xpath("//form[@action='javascript:void(0);']//span[@id='txtHint']")).getText();
    }
}
