package org.nep.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AntikleshPage {
    public static SelenideElement AkFioInsurer = $(By.id("Insurer__FIO"));
    public static SelenideElement AkBtnCalc = $(By.xpath("//span[text()='Рассчитать']"));
    public static SelenideElement AkBtnSave = $(By.xpath("//span[text()='Оформить']"));
    public static SelenideElement AkBirthDate = $(By.id("insured1_birth_date"));
    public static SelenideElement AkBirthDateSave = $(By.id("insured_birth_date"));
    public static SelenideElement AkPasp = $(By.id("insured_series_and_number"));
    public static SelenideElement AkPaspPlace = $(By.id("insured_place_out"));
    public static SelenideElement AkPaspDateOut = $(By.id("insured_date_out"));
    public static SelenideElement AkPhone = $(By.id("insured_phone1"));
    public static SelenideElement AkEmail = $(By.id("insured_email"));
    public static SelenideElement AkFioInsured = $(By.id("Insured1__FIO"));
    public static SelenideElement AkKid = $(By.xpath("//span[text()='Страхователь ознакомлен с ']"));
    public static SelenideElement AkBuy = $(By.xpath("//button[@class='nep-button nep-button_green-50 nep-button_icon-left nep-button_full-width nep-button_white-space-normal nep-button_lg']"));
    public static SelenideElement AkCountry = $(By.xpath("//ul[@class='ps-container nep-scrollbar nep-scrollbar_absolute nep-select__options nep-select__options_null ps ps--active-y']/li[1]"));
    public static SelenideElement AkCitizenship = $(By.id("insured1_citizenship"));
    public static SelenideElement AkPaySum = $(By.xpath("//div[@class='pay-link-modal-data__item-value']"));
    public static SelenideElement AKPay = $(By.xpath("//span[text()='Оплатить']"));
    public static SelenideElement AkSberSec1 = $(By.xpath("//button[@id='details-button']"));
    public static SelenideElement AkSberSec2 = $(By.xpath("//a[@id='proceed-link']"));
    public static SelenideElement AKCard = $(By.id("pan"));
    public static SelenideElement AKCardDate = $(By.id("expiry"));
    public static SelenideElement AKCardCvc = $(By.id("cvc"));
    public static SelenideElement AKCardPay = $(By.xpath("//span[text()='Оплатить']"));
    public static SelenideElement AKCardPass = $(By.id("password"));
    public static SelenideElement AkPayOk = $(By.xpath("//div[@class='swal2-actions']/button[1]"));


}
