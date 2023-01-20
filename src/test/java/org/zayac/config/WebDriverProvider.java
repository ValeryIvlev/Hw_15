package org.zayac.config;


import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.function.Supplier;

public class WebDriverProvider {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void config() {
        Configuration.baseUrl = WebDriverProvider.config.getBaseUrl();
        Configuration.browser = WebDriverProvider.config.getBrowser();
        String remoteUrl = WebDriverProvider.config.getRemoteURL().toString();
        Configuration.browserSize = WebDriverProvider.config.getBrowserSize();
        Configuration.browserVersion = WebDriverProvider.config.getBrowserVersion();
        if (remoteUrl != null) {
            Configuration.remote = remoteUrl;
        }
    }
}