package org.nep.steps;

import io.cucumber.java.ru.Пусть;
import org.nep.pages.KaskoPage;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.Map;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.holdBrowserOpen;
import static com.codeborne.selenide.Selenide.page;

public class KaskoSteps {
    @Пусть("^Заполняем все данные для рассчета КАСКО$")
    public void KaskoData(Map<String, String> values) {
        KaskoPage kaskopage = page(KaskoPage.class);
        KaskoPage.NewPolis.click();
        KaskoPage.GRZ.setValue(values.get("ГРЗ"));
        KaskoPage.Mark.setValue(values.get("Марка"));
        KaskoPage.Model.setValue(values.get("Модель"));
        KaskoPage.VehicleYear.setValue(values.get("Год"));
        KaskoPage.TsIdentifier.setValue(values.get("ВИН"));
        KaskoPage.UsageStart.setValue(values.get("ДатаНачала"));
        KaskoPage.DateBuy.setValue(values.get("ДатаПокупки"));
        KaskoPage.Power.setValue(values.get("Мощность"));
        KaskoPage.Engine.click();
        KaskoPage.Engine.sendKeys(Keys.ARROW_DOWN);
        KaskoPage.Engine.pressEnter();
        KaskoPage.EngineVolume.setValue(values.get("ОбъемДвигателя"));
        KaskoPage.Body.click();
        KaskoPage.Body.sendKeys(Keys.ARROW_DOWN);
        KaskoPage.Body.pressEnter();
        KaskoPage.Mileage.setValue(values.get("Пробег"));
        KaskoPage.Doors.setValue(values.get("Двери"));
        KaskoPage.Transmission.click();
        KaskoPage.KPP.click();
        KaskoPage.Cost.setValue(values.get("Стоимость"));
        KaskoPage.OwnerFio.setValue(values.get("ФИОСобственника")).pressEnter();
        KaskoPage.OwnerDOB.setValue(values.get("ДатаРождСобственника"));
        KaskoPage.OwnerPasport.setValue(values.get("ПаспортСобств"));
        KaskoPage.OwnerAdress.setValue(values.get("АдресСобств")).pressEnter();
        KaskoPage.OwnerIsDriver.click();
        KaskoPage.DriverLicense.setValue(values.get("ВУ"));
        KaskoPage.ExpStart.setValue(values.get("НачалоСтажа"));
        KaskoPage.Marriage.click();
        KaskoPage.Marriage.sendKeys(Keys.ARROW_DOWN);
        KaskoPage.Marriage.pressEnter();
        //KaskoPage.GAP.click();
        KaskoPage.CalcBtn.scrollIntoView(true).click();
        KaskoPage.SaveBtn.shouldBe(enabled, Duration.ofSeconds(40)).click();
        KaskoPage.NumberOfKeys.setValue(values.get("Ключи"));
        KaskoPage.OwnerNum.setValue(values.get("Собственники"));
        KaskoPage.STSNumber.setValue(values.get("СТС"));
        KaskoPage.STSDate.setValue(values.get("СТСДата"));
        KaskoPage.PTSNumber.setValue(values.get("ПТС"));
        KaskoPage.PTSDate.setValue(values.get("ПТСДата"));
        KaskoPage.Division.setValue(values.get("КодПодр"));

        KaskoPage.PasportIssueBy.setValue(values.get("КемВыданПаспорт"));
        KaskoPage.PasportIssueDate.setValue(values.get("ДатаВыдачиПаспорта"));
        KaskoPage.Phone.setValue(values.get("Телефон"));
        KaskoPage.Email.setValue(values.get("Почта"));
        KaskoPage.Next.scrollIntoView(true).click();
        KaskoPage.fileStsLic.shouldBe(visible, Duration.ofSeconds(60)).sendKeys(kaskopage.filepathStsLic);
        KaskoPage.fileStsOb.sendKeys(kaskopage.filepathStsOb);
        KaskoPage.filePtsLic.sendKeys(kaskopage.filepathPtsLic);
        KaskoPage.filePtsOb.sendKeys(kaskopage.filepathPtsOb);
        KaskoPage.filePaspPhoto.sendKeys(kaskopage.filepathPaspPhoto);
        KaskoPage.filePaspHome.sendKeys(kaskopage.filepathPaspHome);
        KaskoPage.fileVULic.sendKeys(kaskopage.filepathVULic);
        KaskoPage.fileVUOb.sendKeys(kaskopage.filepathVUOb);
        KaskoPage.AddDoc.click();
        KaskoPage.Osmotr.click();
        KaskoPage.Next.shouldBe(enabled).click();
        KaskoPage.AllOk.shouldBe(exist);


        holdBrowserOpen = true;

    }
}
