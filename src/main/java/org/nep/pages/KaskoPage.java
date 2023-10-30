package org.nep.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class KaskoPage {
    public static SelenideElement NewPolis = $(By.xpath("//span[text()='Новый полис']"));
    public static SelenideElement GRZ = $(By.id("Params__Vehicle__RegNumber_auto1"));
    public static SelenideElement Mark = $(By.id("Params__Mark"));
    public static SelenideElement Model = $(By.id("Params__Model"));
    public static SelenideElement VehicleYear = $(By.id("Params__VehicleYear"));
    public static SelenideElement TsIdentifier = $(By.id("tsIdentifierFieldValue"));
    public static SelenideElement UsageStart = $(By.id("Params__UsageStart"));
    public static SelenideElement DateBuy = $(By.id("Params__DateBuy"));
    public static SelenideElement Power = $(By.id("Params__Modification__Power"));
    public static SelenideElement Engine = $(By.id("Params__Modification__EngineType"));
    public static SelenideElement EngineVolume = $(By.id("Params__Modification__EngineVolume"));
    public static SelenideElement Body = $(By.id("Params__Modification__BodyType"));
    public static SelenideElement BodyType = $(By.xpath("//div[@class='form-field-select dropdown product-form__body-type']/ul[@class='dropdown-menu show']/li[1]"));
    public static SelenideElement Mileage = $(By.id("Params__Vehicle__Mileage"));
    public static SelenideElement Doors = $(By.id("Params__Modification__DoorsCount"));
    public static SelenideElement Transmission = $(By.xpath("//div[@class='btn-group']/a/span[contains(text(),'Передний')]"));
    public static SelenideElement KPP = $(By.xpath("//div[@class='btn-group']/a/span[contains(text(),'Автомат')]"));
    public static SelenideElement Cost = $(By.id("Params__Cost"));
    public static SelenideElement OwnerFio = $(By.id("Owner__FIO"));
    public static SelenideElement OwnerDOB = $(By.id("Params__Owner__DOB"));
    public static SelenideElement OwnerPasport = $(By.id("Owner_Series_And_Number"));
    public static SelenideElement OwnerAdress = $(By.id("Params__Owner__RegistrationAddress"));
    public static SelenideElement OwnerIsDriver = $(By.xpath("//span[text()='Собственник является водителем']"));
    public static SelenideElement DriverLicense = $(By.id("FullDriversInfo__FullDriver__1__DriverLicence__Series_and_Numder"));
    public static SelenideElement ExpStart = $(By.id("Params__FullDriversInfo__FullDriver__1__ExpertienceStart"));
    public static SelenideElement Marriage = $(By.id("Params__Drivers__Driver__1__MarriageStatus"));
    public static SelenideElement MarriageStatus = $(By.xpath("//div[@class='form-field-select dropdown']/ul[@class='dropdown-menu show']/li[text()='Состоит в браке']"));
    public static SelenideElement ProlongNumber = $(By.id("Prolongation__PreviousPolicyNumber"));
    public static SelenideElement ProlongEndDate = $(By.id("Prolongation__PreviousPolicyEndDate"));
    public static SelenideElement ProlongCompany = $(By.id("Prolongation__PreviousInsuranceCompany"));
    public static SelenideElement ProlongFranch = $(By.xpath("//span[text()='Без франшизы']"));
    public static SelenideElement ProlongFranchSum = $(By.id("Prolongation__PreviousFranchise"));
    public static SelenideElement ProlongSum = $(By.id("Prolongation__PreviousPremium"));
    public static SelenideElement ProlongCost = $(By.id("Prolongation__PreviousCost"));
    public static SelenideElement FrachSum = $(By.id("Params__Franchise"));
    public static SelenideElement GAP = $(By.xpath("//span[text()='ГАП']"));
    public static SelenideElement CalcBtn = $(By.xpath("//span[text()='Рассчитать']"));
    public static SelenideElement SaveBtn = $(By.xpath(".//img[@src='/Assets/img/insurances/SOGLASIE.svg']/ancestor::*/div[@class='precalc-result-kasko__execute']/div/button"));
    //Страница оформления
    public static SelenideElement NumberOfKeys = $(By.id("Params__NumberOfKeys"));
    public static SelenideElement OwnerNum = $(By.id("Params__OwnerNum"));
    public static SelenideElement STSNumber = $(By.id("VehicleRegistration__Series_and_Number_documents2"));
    public static SelenideElement STSDate = $(By.id("Params__VehicleRegistration__IssuedDate_documents2"));
    public static SelenideElement PTSNumber = $(By.id("PTS__Series_and_Number_documents2"));
    public static SelenideElement PTSDate = $(By.id("Params__PTS__IssuedDate_documents2"));
    public static SelenideElement Division = $(By.id("Params__Owner__PersonDocument__SubdivisionCode"));
    public static SelenideElement PasportIssueBy = $(By.id("Params__Owner__PersonDocument__IssuedBy"));
    public static SelenideElement PasportIssueDate = $(By.id("Params__Owner__PersonDocument__IssuedDate"));
    public static SelenideElement Phone = $(By.id("Params__Insurer__Phone"));
    public static SelenideElement Email = $(By.id("Params__Insurer__Email"));
    public static SelenideElement Next = $(By.xpath("//*[@id='execute-form']/div[2]/div[2]/div/div/div[2]/button/span"));




}
