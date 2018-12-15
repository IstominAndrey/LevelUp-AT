package WebPages;

import AbstractPage.AbstractPage;
import org.openqa.selenium.WebDriver;

public class JavaScriptArrayReferencePage extends AbstractPage {

    public static final String JAVA_SCRIPT_ARRAY_REFERENCE_PAGE_URL = "https://www.w3schools.com/jsref/jsref_obj_array.asp";
    public static final String JAVA_SCRIPT_ARRAY_REFERENCE_PAGE_TITLE = "JavaScript Array Reference";

    protected JavaScriptArrayReferencePage(WebDriver driver) {
        super(driver);
    }


}
