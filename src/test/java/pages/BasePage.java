package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

abstract class BasePage {
    private final Playwright playwright;
    private final Page page;

    protected BasePage(Page page, Playwright playwright) {
        this.playwright = playwright;
        this.page = page;
    }

    protected Playwright getPlaywright() {
        return playwright;
    }

    protected Page getPage() {
        return page;
    }
}