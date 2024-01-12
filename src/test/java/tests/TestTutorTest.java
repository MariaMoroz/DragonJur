package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.TestTutorPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class TestTutorTest extends BaseTest {

    @Test
    public void testUserCanMarkTheCard() {

        TestTutorPage testTutorPage = new HomePage(getPage(), getPlaywright())
                .initiateTest()
                .clickMarkForReviewButtonIfVisible();

        assertThat(testTutorPage.getRemoveFromMarkedButton()).isVisible();
    }
}
