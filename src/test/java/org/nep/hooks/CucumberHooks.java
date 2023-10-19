package org.nep.hooks;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class CucumberHooks {

    @Before("@mobile")
    public void setUp() {
        Configuration.headless=false;
        System.out.println("Starting Browser...");
        open("https://test.el-polis.ru/agent#/");
        System.out.println("123");
    }

    @Before("@reg")
    public void setUpReg() {
        Configuration.headless=false;
        System.out.println("Starting Browser...");
        open("https://test.el-polis.ru/agent#/");
        System.out.println("123");
    }

    @After("@mobile")
    public void tearDown() {
        closeWebDriver();
    }

    @After("@reg")
    public void tearDownReg() {
        closeWebDriver();
    }
}
