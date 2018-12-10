package WebElements;

import AbstractPage.AbstractPage;
import WebPages.SQLExercisesDescriptionPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;




public class HomePageDropodownMenu extends AbstractPage {

    public HomePageDropodownMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div/a[@id='navbtn_tutorials']")
    private WebElement tutorialsDropdown;

    @FindBy(xpath = "//div/a[@id='navbtn_examples']")
    private WebElement examplesDropdown;

    @FindBy(xpath = "//div[@id=\"googleSearch\"]//button[@class='gsc-search-button gsc-search-button-v2']")
    private WebElement searchButton;

    @FindBy(xpath = "//nav[@id=\"nav_examples\"]/div//a[@href='/sql/sql_exercises.asp']")
    private WebElement sqlExercisesItem;

    public HomePageDropodownMenu chooseDropdownMenuExamples() {
        new Actions(driver).click(examplesDropdown).build().perform();
        return this;
    }

    public SQLExercisesDescriptionPage clickDropdownMenuItemSQLExercises() {
        new Actions(driver).click(sqlExercisesItem).build().perform();
        return new SQLExercisesDescriptionPage(driver);
    }
    /*public AbstractBasePage moveToDepartmentsMenuItem() {
        new Actions(driver).moveToElement(departments).build().perform();
        return new AbstractBasePage(driver) {};
    }*/
}
