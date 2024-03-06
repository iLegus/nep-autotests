package org.nep.steps;

import io.cucumber.java.ru.Пусть;
import org.nep.pages.AntikleshPage;

import java.time.Duration;
import java.util.Map;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.holdBrowserOpen;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.nep.Utils.DateUtil.SIMPLE_DOT;
import static org.nep.Utils.DateUtil.getDate;

public class AntikleshSteps {
    @Пусть("^Заполняем все данные для рассчета клеща$")
    public void AntikleshData(Map<String, String> values) {
        AntikleshPage antikleshPage = page(AntikleshPage.class); //добавляем ссылку на элементы
        AntikleshPage.AkBirthDate.setValue(values.get("ДатаРождения"));
        AntikleshPage.AkBtnCalc.shouldBe(visible).click(); //расчет
        AntikleshPage.AkBtnSave.shouldBe(visible, Duration.ofSeconds(120)).click(); //ожидание и Оформить
        AntikleshPage.AkFioInsurer.setValue(values.get("ФИОСтрахователя")).pressEnter();
        AntikleshPage.AkBirthDateSave.setValue(values.get("ДатаРождения"));
        AntikleshPage.AkPasp.setValue(values.get("Паспорт"));
        AntikleshPage.AkPaspPlace.setValue(values.get("Место"));
        AntikleshPage.AkPaspDateOut.setValue(values.get("ДатаВыдачи"));
        AntikleshPage.AkPhone.setValue(values.get("Телефон"));
        AntikleshPage.AkEmail.setValue(values.get("Почта"));
        AntikleshPage.AkFioInsured.setValue(values.get("ФИОСтрахуемого")).pressEnter();
        AntikleshPage.AkCitizenship.click(); //выбор гражданства
        AntikleshPage.AkCountry.click(); //выбор страны
        AntikleshPage.AkKid.click(); // галка кид
        AntikleshPage.AkBuy.click(); // Купить
        AntikleshPage.AkPaySum.shouldBe(visible, Duration.ofSeconds(120)); //ожидание суммы
        AntikleshPage.AKPay.click(); //оплатить
        /*//оплата
        switchTo().window(1);
        //ожидание ошибки серта, если есть тыкнет
        if (AntikleshPage.AkSberSec1.isDisplayed()) {
            AntikleshPage.AkSberSec1.click();
            AntikleshPage.AkSberSec2.click();
        }
        AntikleshPage.AKCard.setValue("4111 1111 1111 1111");
        AntikleshPage.AKCardDate.setValue("1224");
        AntikleshPage.AKCardCvc.setValue("123");
        AntikleshPage.AKCardPay.click();
        AntikleshPage.AKCardPass.setValue("12345678");
        AntikleshPage.AkPayOk.shouldBe(visible, Duration.ofSeconds(20)).click();*/


        holdBrowserOpen = true;
    }

}
