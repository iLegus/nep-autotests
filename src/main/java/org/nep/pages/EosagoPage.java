package org.nep.pages;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EosagoPage {
    public SelenideElement txtRegNumber = $(By.id("RegNumber_0"));
    public SelenideElement txtMark = $(By.id("Mark"));
    public SelenideElement txtModel = $(By.id("Model"));
    public SelenideElement txtVehicleYear = $(By.id("VehicleYear"));
    public SelenideElement txtVehiclePower = $(By.id("VehiclePower"));
    public SelenideElement txtRegDoc = $(By.id("RegDoc__Series_and_Numder"));
    public SelenideElement txtRegDocDate = $(By.id("RegDoc__Date"));
    public SelenideElement txtTsIdentifier = $(By.id("tsIdentifierFieldValue"));


    public SelenideElement txtContractBeginDate = $(By.id("ContractBegin"));
    public SelenideElement txtDuration = $(By.id("Duration"));

    public SelenideElement txtInsurerFIO = $(By.id("Insurer__FIO"));
    public SelenideElement txtInsurerDOB = $(By.id("Insurer__DOB"));
    public SelenideElement txtInsurerPhone = $(By.id("Insurer__Phone"));
    public SelenideElement txtInsurerEmail = $(By.id("Insurer__Email"));
   // public SelenideElement txtInsurer__Email = $(By.id("Insurer__Email"));
    public SelenideElement txtInsurerPassport = $(By.id("insurer_series_and_number"));
    public SelenideElement txtInsurerPassportDate = $(By.id("Insurer__PersonDocument__IssuedDate"));
    public SelenideElement txtInsurerPassportIssuedBy = $(By.id("Insurer__PersonDocument__IssuedBy"));
    public SelenideElement txtInsurerAddress = $(By.id("Insurer__RegistrationAddress"));

    public SelenideElement txtDriverFIO = $(By.id("FullDriversInfo__1__FIO"));
    public SelenideElement txtDriverDOB = $(By.id("FullDriversInfo__FullDriver__1__DOB"));
    public SelenideElement txtDriverLicence = $(By.id("FullDriversInfo__FullDriver__1__DriverLicence__Series_and_Numder"));
    public SelenideElement txtDriverLicenceDate = $(By.id("FullDriversInfo__FullDriver__1__DriverLicence__IssuedDate"));
    public SelenideElement txtDriverExperience = $(By.id("FullDriversInfo__FullDriver__1__ExpertienceStart"));

    public SelenideElement btnCalc = $(By.xpath(".//div[@class='precalc-actions precalc-actions_v2']/button[contains(text(),'Рассчитать')]"));

 public ElementsCollection btnsSave = $$(By.xpath(".//span[text()='Оформить']"));

    public SelenideElement btnSaveRensins2 = $(By.xpath(".//button[@class='nep-button nep-button_main nep-button_green-50 nep-button_md-on-xl-screen nep-button_lg-on-xmd-screen nep-button_full-width-nep-xmd nep-button_lg btn__select-result_Rensins_2_EOSAGO']//span[text()='Оформить']"));



}
