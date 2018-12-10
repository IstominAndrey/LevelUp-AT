package AbstractPage;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.Set;

public class AbstractPage {

    protected WebDriver driver;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected String getText(WebElement element) {
        String elementText = "";
        try {
            elementText = element.getText().trim();
        } catch (NoSuchElementException e) {
            FindBy annotation = null;
            if (element.getClass().isAnnotationPresent(FindBy.class)) {
                annotation = element.getClass().getAnnotation(FindBy.class);
            }
            System.err.println("Unable to get text from element");
        } catch (StaleElementReferenceException e) {
            getText(element);
        } finally {
            System.out.println("Execution GetText");
        }
        return elementText;
    }

    protected void switchToNewWindow (Set<String> oldWindowsSet) {
        String newWindow = (new WebDriverWait(driver, 10))
                .until(new ExpectedCondition<String>() {
                           public String apply(WebDriver driver) {
                               Set<String> newWindowsSet = driver.getWindowHandles();
                               newWindowsSet.removeAll(oldWindowsSet);
                               return newWindowsSet.size() > 0 ?
                                       newWindowsSet.iterator().next() : null;
                           }
                       }
                );
        driver.switchTo().window(newWindow);
    }

}

