package org.nep.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AntikleshPage {
    public static SelenideElement FioInsurer = $(By.id("Insurer__FIO"));
    public static SelenideElement BtnCalc = $(By.xpath("//span[text()='Рассчитать']"));
    public static SelenideElement BtnSave = $(By.xpath("//span[text()='Оформить']"));
    public static SelenideElement BirthDate = $(By.id("insured_birth_date"));
    public static SelenideElement Pasp = $(By.id("insured_series_and_number"));
    public static SelenideElement PaspPlace = $(By.id("insured_place_out"));
    public static SelenideElement Phone = $(By.id("insured_phone1"));
    public static SelenideElement Email = $(By.id("insured_email"));
    public static SelenideElement FioInsured = $(By.id("Insured1__FIO"));
    public static SelenideElement Kid = $(By.xpath("//span[text()='Страхователь ознакомлен с ']"));
    public static SelenideElement Buy = $(By.xpath("//button[@class='nep-button nep-button_green-50 nep-button_icon-left nep-button_full-width nep-button_white-space-normal nep-button_lg']"));
    public static SelenideElement Country = $(By.xpath("//ul[@class='ps-container nep-scrollbar nep-scrollbar_absolute nep-select__options nep-select__options_null ps ps--active-y']/li[1]"));
    public static SelenideElement Citizenship = $(By.id("insured1_citizenship"));
}
