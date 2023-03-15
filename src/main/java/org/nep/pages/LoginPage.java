package org.nep.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement username = $(By.name("username"));
    public SelenideElement password = $(By.name("password"));
    public SelenideElement submitButton = $(By.xpath(".//span[text()='Войти']"));

}
