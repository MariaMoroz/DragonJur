package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TestResultPage extends BaseLocator {

    private final Locator closeTheTestButton = exactButton("Close the test");

    protected TestResultPage(Page page, Playwright playwright) {
        super(page, playwright);
    }

    public TestListPage clickCloseTheTestButton() {
        closeTheTestButton.click();
        return new TestListPage(getPage(), getPlaywright());
    }

}
