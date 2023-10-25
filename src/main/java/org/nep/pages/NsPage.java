package org.nep.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.security.PublicKey;

import static com.codeborne.selenide.Selenide.$;
public class NsPage {
public static SelenideElement NsSumm = $(By.xpath("//span[text()='300 000']"));
public static SelenideElement NsBeginDate = $(By.id("contract_begin_date"));
public static SelenideElement NsBirthDate = $(By.id("insured1_birth_date"));
public static SelenideElement NsSport = $(By.xpath("//span[text()='Нет']"));
public static SelenideElement NsBtnCalc = $(By.xpath("//span[text()='Рассчитать']"));
public static SelenideElement NsBtnSave =  $(By.xpath("//div[div[div[div[contains(text(),'2 кастом')]]]]/div[@class='mt-1_5rem']/button"));//span[text()='Оформить']
public static SelenideElement NsInsurerFio =  $(By.id("Insured1__FIO"));
public static SelenideElement NsInsBirthDate =  $(By.id("insured_birth_date"));
public static SelenideElement NsPasp = $(By.id("insured_series_and_number"));
public static SelenideElement NsDateOut =  $(By.id("insured_date_out"));
public static SelenideElement NsDivision = $(By.id("insurer_division_code"));
public static SelenideElement NsPlaseOut =  $(By.id("insured_place_out"));
public static SelenideElement NsAdress = $(By.id("insured_address"));
public static SelenideElement NsPhone = $(By.id("insured_phone1"));
public static SelenideElement NsEmail = $(By.id("insured_email"));
public static SelenideElement NsInsuredFio = $(By.id("insured__FIO"));
public static SelenideElement NsBuy = $(By.xpath("//span[text()='Купить']"));
public static SelenideElement NsPaySum = $(By.xpath("//div[@class='pay-link-modal-data__item-value']"));

}
