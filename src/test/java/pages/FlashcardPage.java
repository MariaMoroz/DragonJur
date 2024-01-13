package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FlashcardPage extends BaseLocator {

    private final Locator numberMarkedForRechecking = button("Marked for re-checking").locator("div:nth-of-type(2)");

    protected FlashcardPage(Page page, Playwright playwright) {
        super(page, playwright);
    }

    public Locator getNumberMarkedForRechecking() {
        return numberMarkedForRechecking;
    }
}
