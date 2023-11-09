package org.nep.pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class MenuPage {
    public SelenideElement eosagoTab = $(By.xpath(".//span[text()='еОСАГО']"));
    public SelenideElement AKTab = $(By.xpath("//span[text()='Антиклещ']"));
    public SelenideElement NsTab = $(By.xpath("//span[text()='Несчастный случай']"));
    public SelenideElement KaskoTab = $(By.xpath("//span[text()='КАСКО new']"));
    public SelenideElement PolicyTab = $(By.xpath("//span[text()='Полисы']"));

    public SelenideElement insuranceTab = $(By.xpath(".//span[text()='Страхование']"));




}
