package org.nep.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.Пусть;
import org.nep.pages.EosagoPage;

import java.util.Map;

import static com.codeborne.selenide.Selenide.page;
import static org.nep.Utils.DateUtil.SIMPLE_DOT;
import static org.nep.Utils.DateUtil.getDate;

public class EosagoSteps {

    @Пусть("^Зяполняем все данные для рассчета$")
    public void allDataForCalc(Map<String, String> values) {
        EosagoPage eosagoPage = page(EosagoPage.class);
        System.out.println("Successfully opened the page...");
        eosagoPage.txtRegNumber.setValue(values.get("ГосНомер"));
        eosagoPage.txtMark.setValue(values.get("Марка"));
        eosagoPage.txtModel.setValue(values.get("Модель"));
        eosagoPage.txtVehicleYear.setValue(values.get("Год ТС"));
        eosagoPage.txtVehiclePower.setValue(values.get("Мощность"));
        eosagoPage.txtRegDoc.setValue(values.get("Номер"));
        eosagoPage.txtRegDocDate.setValue(values.get("ВыдачаТС"));
        eosagoPage.txtTsIdentifier.setValue(values.get("НомерТС"));

        eosagoPage.txtContractBeginDate.setValue(getDate(SIMPLE_DOT,4,0));

        eosagoPage.txtInsurerFIO.setValue(values.get("ФИО"));
        eosagoPage.txtInsurerDOB.setValue(values.get("датаРождения"));
        eosagoPage.txtInsurerPhone.setValue(values.get("Телефон"));
        eosagoPage.txtInsurerEmail.setValue(values.get("Почта"));
        eosagoPage.txtInsurerPassport.setValue(values.get("НомерПаспорта"));
        eosagoPage.txtInsurerPassportDate.setValue(values.get("ДатаПаспорта"));
        eosagoPage.txtInsurerPassportIssuedBy.setValue(values.get("КемВыданПаспорт"));
        eosagoPage.txtInsurerAddress.setValue(values.get("Адрес"));

        eosagoPage.txtDriverFIO.setValue(values.get("ФИОВодитель"));
        eosagoPage.txtDriverDOB.setValue(values.get("датаРожденияВодитель"));
        eosagoPage.txtDriverLicence.setValue(values.get("НомерПрав"));
        eosagoPage.txtDriverExperience.setValue(values.get("ДатаЛицензии"));
        eosagoPage.txtDriverLicenceDate.setValue(values.get("ДатаПрав"));

        eosagoPage.btnCalc.scrollIntoView(true);
        eosagoPage.btnCalc.click();
        System.out.println();




    }


}

