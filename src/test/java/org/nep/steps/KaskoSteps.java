package org.nep.steps;

import io.cucumber.java.ru.Пусть;
import org.nep.pages.KaskoPage;

import java.util.Map;

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
        KaskoPage.EngineType.click();
        KaskoPage.EngineVolume.setValue(values.get("ОбъемДвигателя"));
        KaskoPage.Body.click();
        KaskoPage.BodyType.click();
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
        KaskoPage.MarriageStatus.click();
        KaskoPage.CalcBtn.click();


    }
}
