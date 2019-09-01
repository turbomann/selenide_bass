package gui.Plugin;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.id;

public class Setup {
    @BeforeClass
    public static void configureServer(String os_login, String os_password) throws Exception {
        Configuration.baseUrl = "https://bassuat.netcracker.com";
        Configuration.startMaximized = true;
        open("/login.action?logout=true");
        $(id("os_username")).setValue(os_login);
        $(id("os_password")).setValue(os_password);
        $(id("loginButton")).click();
    }
    public static void main(String[] args) throws Exception {
        configureServer("rova0117", "GM-avtovaz1234567");

    }
}

