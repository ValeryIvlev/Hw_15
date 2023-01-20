package org.zayac.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.zayac.config.WebDriverConfig;
import org.zayac.config.WebDriverProvider;
import org.zayac.pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.*;


public class TestBase {
    public RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll() {
        WebDriverProvider.config();
    }

    @AfterEach
    void setUp() {
        clearBrowserCookies();
        clearBrowserLocalStorage();
        closeWebDriver();
    }
}







