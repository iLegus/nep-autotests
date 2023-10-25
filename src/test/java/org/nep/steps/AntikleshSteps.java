package org.nep.steps;

import io.cucumber.java.ru.Пусть;
import org.nep.pages.AntikleshPage;

import java.time.Duration;
import java.util.Map;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;
import static org.nep.Utils.DateUtil.SIMPLE_DOT;
import static org.nep.Utils.DateUtil.getDate;
public class AntikleshSteps {
    @Пусть("^Заполняем все данные для рассчета клеща$")
    public void AntikleshData(Map<String, String> values){
        AntikleshPage antikleshPage = page(AntikleshPage.class);
        AntikleshPage.AkBirthDate.setValue(values.get("ДатаРождения"));
        AntikleshPage.AkBtnCalc.click();
        AntikleshPage.AkBtnSave.shouldBe(visible, Duration.ofSeconds(50)).click();
        AntikleshPage.AkFioInsurer.setValue(values.get("ФИОСтрахователя")).pressEnter();
        AntikleshPage.AkBirthDateSave.setValue(values.get("ДатаРождения"));
        AntikleshPage.AkPasp.setValue(values.get("Паспорт"));
        AntikleshPage.AkPaspPlace.setValue(values.get("Место"));
        AntikleshPage.AkPaspDateOut.setValue(values.get("ДатаВыдачи"));
        AntikleshPage.AkPhone.setValue(values.get("Телефон"));
        AntikleshPage.AkEmail.setValue(values.get("Почта"));
        AntikleshPage.AkFioInsured.setValue(values.get("ФИОСтрахуемого")).pressEnter();
        AntikleshPage.AkCitizenship.click();
        AntikleshPage.AkCountry.click();
        AntikleshPage.AkKid.click();
        AntikleshPage.AkBuy.click();
        AntikleshPage.AkPaySum.shouldBe(visible, Duration.ofSeconds(60)).isDisplayed();
    }

}
