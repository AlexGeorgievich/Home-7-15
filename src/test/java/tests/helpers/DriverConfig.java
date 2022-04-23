package helpers;

import config.Project;
import com.codeborne.selenide.Configuration;

public class DriverConfig {

    public static void configure() {
        Configuration.browser = Project.config.browser();
        Configuration.browserVersion = Project.config.browserVersion();
        Configuration.browserSize = Project.config.browserSize();
        Configuration.baseUrl = Project.config.baseUrl();
//        Configuration.baseUrl = "https://github.com/";
        if (Project.isRemoteWebDriver()) {
            Configuration.remote = Project.config.remoteDriverUrl();
        }
    }
}
