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
        AntikleshPage antikleshPage = page (AntikleshPage.class);
        AntikleshPage.BirthDate.setValue(values.get("ДатаРождения"));
        AntikleshPage.BtnCalc.click();
        AntikleshPage.BtnSave.shouldBe(visible, Duration.ofSeconds(50)).click();
        AntikleshPage.FioInsurer.setValue(values.get("ФИОСтрахователя")).pressEnter();
        AntikleshPage.BirthDate.setValue(values.get("ДатаРождения"));
        AntikleshPage.Pasp.setValue(values.get("Паспорт"));
        AntikleshPage.PaspPlace.setValue(values.get("Место"));
        AntikleshPage.Phone.setValue(values.get("Телефон"));
        AntikleshPage.Email.setValue(values.get("Почта"));
        AntikleshPage.FioInsured.setValue(values.get("ФИОСтрахуемого")).pressEnter();
        AntikleshPage.Citizenship.click();
        AntikleshPage.Country.click();

        AntikleshPage.Kid.click();
    }

}
