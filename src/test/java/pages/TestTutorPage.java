package pages;

import com.microsoft.playwright.Dialog;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TestTutorPage extends BaseLocator {

    private final Locator markForReviewButton = button("Mark for review");

    private final Locator removeFromMarkedButton = button("Remove from marked");

    private final  Locator endButton = exactButton("End");
    private final  Locator skipButton = exactButton("Skip");
        protected TestTutorPage(Page page, Playwright playwright) {
        super(page, playwright);
    }

    public Locator getRemoveFromMarkedButton() {
        return removeFromMarkedButton;
    }
    public TestTutorPage clickMarkForReviewButtonIfVisible() {

        if (markForReviewButton.isVisible()) {
            markForReviewButton.click();
        }

        return this;
    }

    public TestTutorPage clickEndButton() {
        endButton.click();

        return this;
    }
    public TestTutorPage endTestIfVisible() {
        endTestDialog();
        return this;
    }

    public TestResultPage clickSkipButton() {
        skipButton.click();
        return new TestResultPage(getPage(), getPlaywright());
    }
}
