package gui.Plugin.Nettube;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainNettubePage {
    public void clickToUpload(String nameButton) {
        $(By.id("nettube-upload-link")).find(By.linkText(nameButton)).click();
    }

    public void clickMoreButton(int number) {
        $$(".more-button").get(number).click();
    }

}
