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
import static org.nep.Utils.DateUtil.SIMPLE_DOT;
import static org.nep.Utils.DateUtil.getDate;

public class NsSteps {
    @Пусть("^заполняем данные для НС$")
    public void NsData(Map<String, String> values){
        NsPage nspage = page(NsPage.class);

        NsPage.NsSumm.click();
        NsPage.NsBeginDate.setValue(getDate(SIMPLE_DOT,4,0));
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
        NsPage.NsAdress.setValue(values.get("Адресс")).pressEnter();
        NsPage.NsPhone.setValue(values.get("Телефон"));
        NsPage.NsEmail.setValue(values.get("Почта"));
        NsPage.NsInsurerFio.setValue(values.get("ФИОЗастрахованного")).pressEnter();
        NsPage.NsBuy.click();
        NsPage.NsPaySum.shouldBe(visible, Duration.ofSeconds(60));
        ContractSteps.paySum = NsPage.NsPaySum.getText();




        //holdBrowserOpen = true;


    }
}
