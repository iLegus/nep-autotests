package org.nep.steps;

import io.cucumber.java.ru.Пусть;
import org.nep.pages.NsPage;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.holdBrowserOpen;
import static com.codeborne.selenide.Selenide.page;

public class NsSteps {
    @Пусть("^заполняем данные для НС$")
    public void NsData(Map<String, String> values){
        NsPage nspage = page(NsPage.class);
        NsPage.NsSumm.click();
        Calendar c = new GregorianCalendar();
        c.add(Calendar.DAY_OF_YEAR, 4); // увеличиваем на 4 дня от текущей даты
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy"); //придаем нужный формат дате
        String str = format1.format(c.getTime());
        NsPage.NsBeginDate.setValue(str);
        NsPage.NsBirthDate.setValue(values.get("ДатаРождения"));
        NsPage.NsSport.click();
        NsPage.NsBtnCalc.scrollIntoView(true).click();
        NsPage.NsBtnSave.shouldBe(visible, Duration.ofSeconds(20)).click();
        NsPage.NsInsuredFio.setValue(values.get("ФИОСтрахователя")).pressEnter();
        NsPage.NsInsBirthDate.setValue(values.get("ДРСтрахователя"));
        NsPage.NsPasp.setValue(values.get("Паспорт"));
        NsPage.NsDateOut.setValue(values.get("ДатаВыдачи"));
        NsPage.NsDivision.setValue(values.get("КодПодразделения"));
        NsPage.NsPlaseOut.setValue(values.get("КемВыдан"));
        NsPage.NsAdress.setValue(values.get("Адресс"));
        NsPage.NsPhone.setValue(values.get("Телефон"));
        NsPage.NsEmail.setValue(values.get("Почта"));
        NsPage.NsInsurerFio.setValue(values.get("ФИОЗастрахованного")).pressEnter();
        NsPage.NsBuy.click();
        NsPage.NsPaySum.shouldBe(visible, Duration.ofSeconds(40)).isDisplayed();





        //holdBrowserOpen = true;


    }
}
