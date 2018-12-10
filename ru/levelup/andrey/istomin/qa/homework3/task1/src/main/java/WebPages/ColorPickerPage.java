package WebPages;

import AbstractPage.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ColorPickerPage extends AbstractPage {

    protected ColorPickerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id=\"entercolorDIV\"]/input")
    private WebElement enterColorTextField;

    @FindBy(xpath = "//div[@id='entercolorDIV']/button")
    private WebElement okColorButton;

    public ColorPickerPage inputColor(String colorCode) {
        new Actions(driver).sendKeys(enterColorTextField, colorCode).build().perform();
        return this;
    }

    public ColorPickerPage clickOkColorButton() {
        new Actions(driver).click(okColorButton).build().perform();            // не срабатывает нажатие на кнопку
        return this;
    }


    public String checkPickedColor() {
        return driver.findElement(By.xpath("//div[@id='main']//span[@id=\"colorhexDIV\"]")).getText();
    }
}
