package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TestTutorPage extends BaseLocator {

    private final Locator markForReviewButton = button("Mark for review");

    private final Locator removeFromMarkedButton = button("Remove from marked");
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

        return new TestTutorPage(getPage(), getPlaywright());
    }

}
