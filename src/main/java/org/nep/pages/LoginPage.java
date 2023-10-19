package org.nep.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement username = $(By.name("username"));
    public SelenideElement password = $(By.name("password"));
    public SelenideElement submitButton = $(By.xpath(".//span[text()='Войти']"));

    public SelenideElement tabRegistration = $(By.xpath(".//div[@class='auth-tabs__tab']"));

    public SelenideElement btnFizlico = $(By.xpath(".//span[text()='Физ. лицо']"));

    public SelenideElement btnIP = $(By.xpath(".//span[text()='ИП']"));

    public SelenideElement btnJurlico = $(By.xpath(".//span[text()='Юр. лицо']"));

    public SelenideElement btnSelfEmployed = $(By.xpath(".//span[text()='Самозанятый']"));

    public SelenideElement txtFio = $(By.id("fio"));

    public SelenideElement txtEmail = $(By.id("email"));

    public SelenideElement txtPhone = $(By.id("phone"));

    public SelenideElement txtRegion = $(By.id("city"));

   // public SelenideElement cbCaptcha = $(By.xpath(".//div[@class='recaptcha-checkbox-border']"));
   public SelenideElement cbCaptcha = $(By.xpath(".//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']"));
    public SelenideElement frameCaptcha = $(By.cssSelector("iframe"));
}
