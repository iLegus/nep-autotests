package org.nep.hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class CucumberHooks {

    @Before("@mobile")
    public void setUp() {
        Configuration.headless=false;
        System.out.println("Starting Browser...");
        open("https://test.el-polis.ru/agent#/");
        getWebDriver().manage().window().maximize();
        System.out.println("123");
    }
    @Before("@kasko")
    public void kaskoCalc() {
        Configuration.headless=false;
        open("https://test.el-polis.ru/agent#/");
        getWebDriver().manage().window().maximize();

    }

    @Before("@reg")
    public void setUpReg() {
        Configuration.headless=false;
        System.out.println("Starting Browser...");
        open("https://test.el-polis.ru/agent#/");
        getWebDriver().manage().window().maximize();
        System.out.println("123");
    }

    @After("@mobile")
    public void tearDown() {
        closeWebDriver();
    }
    @After("@kasko")
    public void tearDownKasko() {
        closeWebDriver();
    }
    @After("@reg")
    public void tearDownReg() {
        closeWebDriver();
    }
}
