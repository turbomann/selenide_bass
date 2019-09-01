package gui.Plugin.Nettube;

import gui.Plugin.Setup;
import org.junit.Before;
import org.junit.Test;



import static com.codeborne.selenide.Selenide.open;

public class TestNettube extends Setup {
    MainNettubePage page;

    @Before
    public void openPage() {
        page = open("/display/VID", MainNettubePage.class);
    }

    @Test
    public void clickUploadButtonAsUser() {
        page.clickToUpload("Upload");
    }

    @Test
    public void showMoreRecentlyAdded() {
        page.clickMoreButton(1);
    }

}
