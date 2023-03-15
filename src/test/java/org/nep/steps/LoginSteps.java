package org.nep.steps;


import io.cucumber.java.ru.Пусть;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.nep.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static com.codeborne.selenide.Selenide.page;
//import org.nep.webdriver.WebDriverManager;

public class LoginSteps {
    @Пусть("^открываем сайт неп$")
    public void login() {
        LoginPage loginPage = page(LoginPage.class);
        System.out.println("Successfully opened the page...");
        loginPage.username.setValue("agentest2");
        loginPage.password.setValue("agentest2");
        loginPage.submitButton.click();
    }


}

