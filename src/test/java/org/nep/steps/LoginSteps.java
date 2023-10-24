package org.nep.steps;


import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Пусть;
//import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.ru.Тогда;
import org.nep.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.switchTo;
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
    @Пусть("^логин каскотест$")
    public void loginkaskotest(){
        LoginPage loginPage = page(LoginPage.class);
        System.out.println("Successfully opened the page...");
        loginPage.username.setValue("kaskotest@enayu.com");
        loginPage.password.setValue("kaskotest@enayu.com");
        loginPage.submitButton.click();
    }

    @Пусть("^открываем сайт неп без регистрации$")
    public void enter() {
        LoginPage loginPage = page(LoginPage.class);
        System.out.println("Successfully opened the page...");
        loginPage.username.exists();
    }


    @Пусть("переходим на регистрацию")
    public void clickTabReg() {
        LoginPage loginPage = page(LoginPage.class);
        loginPage.tabRegistration.click();

    }

    @Пусть("выбираем физ лицо")
    public void chooseButtonFizlico() {
        LoginPage loginPage = page(LoginPage.class);
        loginPage.btnFizlico.click();
    }

    @Когда("вводим ФИО")
    public void вводим_ФИО() {
        LoginPage loginPage = page(LoginPage.class);
        loginPage.txtFio.setValue("Пушкин Александер Сергеевич");
    }

    @Тогда("вводим Регион")
    public void InsertRegion(String value) {
        LoginPage loginPage = page(LoginPage.class);
        loginPage.txtRegion.setValue(value);
    }

    @Тогда("вводим Логин")
    public void InsertMail(String value) {
        LoginPage loginPage = page(LoginPage.class);
        loginPage.txtEmail.setValue(value);
    }

    @Тогда("вводим пароль")
    public void InsertPassword(String value) {
        LoginPage loginPage = page(LoginPage.class);
        loginPage.txtPhone.setValue(value);
    }

    @Тогда("соглашаемся с капчей")
    public void agreeWithCaptcha() {
        LoginPage loginPage = page(LoginPage.class);
        switchTo().frame(loginPage.frameCaptcha);
        loginPage.cbCaptcha.scrollIntoView(true);
        loginPage.cbCaptcha.click();
        System.out.println("132");
    }
}

