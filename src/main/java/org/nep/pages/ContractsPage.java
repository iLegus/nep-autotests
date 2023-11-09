package org.nep.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ContractsPage {
    public static SelenideElement ContractAntikles = $(By.xpath("//span[contains(text(),'Уваров\u00A0Петр...')]"));
    public static SelenideElement ContractKasko = $(By.xpath("//span[contains(text(),'Федоров\u00A0Мирон...')]"));
    public static SelenideElement ContractNs = $(By.xpath("//span[contains(text(),'Пушкин\u00A0Иван...')]"));
    public static SelenideElement ContractGetPrint = $(By.xpath("//a[contains(text(),'Получить печатную форму')]"));
    public static SelenideElement Exit = $(By.xpath("//button[@class='swal2-close']"));
    //оплата НС
    public static SelenideElement orderID = $(By.xpath("//body"));
}
