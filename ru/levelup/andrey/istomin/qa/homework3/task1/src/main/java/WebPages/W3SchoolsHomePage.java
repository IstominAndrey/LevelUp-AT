package WebPages;

import AbstractPage.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class W3SchoolsHomePage extends AbstractPage {

    public static final String W3SCHOOLS_SITE_URL = "https://www.w3schools.com/";
    public static final String W3SCHOOLS_HOMEPAGE_TITLE = "W3Schools Online Web Tutorials";

    public W3SchoolsHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a/img[@src='/images/colorpicker.png']")
    private WebElement colorPicker;

    @FindBy(xpath = "//div/a[@id=\"navbtn_tutorials\"]")
    private WebElement tutorialsDropdown;

    @FindBy(xpath = "//div/a[@id='navbtn_examples']")
    private WebElement examplesDropdown;

    @FindBy(xpath = "//nav[@id=\"nav_examples\"]/div//a[@href='/sql/sql_exercises.asp']")
    private WebElement sqlExercisesItem;

    @FindBy(xpath = "//nav[@id=\"mySidenav\"]/div/a[@href=\"/xml/default.asp\"]")
    private WebElement learnXMLItem;

    @FindBy(xpath = "//nav[@id=\"nav_tutorials\"]//a[@href='/sql/default.asp']")
    private WebElement learnSQLItem;

    @FindBy(xpath = "//div/a[@id='navbtn_references']")
    private WebElement referencesDropdown;

    @FindBy(xpath = "//nav[@id=\"nav_references\"]//a[@href='/jsref/default.asp']")
    private WebElement javaScriptReferenceItem;

    public W3SchoolsHomePage clickDropdownMenuExamples() {
        new Actions(driver).click(examplesDropdown).build().perform();
        return this;
    }

    public XMLTutorialPage clickLearnXMLItem() {
        new Actions(driver).click(learnXMLItem).build().perform();
        return new XMLTutorialPage(driver);
    }

    public SQLExercisesDescriptionPage clickDropdownMenuItemSQLExercises() {
        new Actions(driver).click(sqlExercisesItem).build().perform();
        return new SQLExercisesDescriptionPage(driver);
    }

    public ColorPickerPage clickColorPicker() {
        new Actions(driver).click(colorPicker).build().perform();
        return new ColorPickerPage(driver);
    }

    public W3SchoolsHomePage clickDropdownMenuTutorials() {
        new Actions(driver).click(tutorialsDropdown).build().perform();
        return this;
    }

    public SQLTutorialPage clickDropdownMenuItemLearnSQL() {
        new Actions(driver).click(learnSQLItem).build().perform();
        return new SQLTutorialPage(driver);
    }


    public W3SchoolsHomePage clickDropdownMenuReference() {
        new Actions(driver).click(referencesDropdown).build().perform();
        return this;
    }

    public JavaScriptReferencePage clickDropdownMenuItemJavaScriptReference() {
        new Actions(driver).click(javaScriptReferenceItem).build().perform();
        return new JavaScriptReferencePage(driver);
    }
}
