package org.nep.steps;

import com.codeborne.selenide.Condition;
import com.google.common.net.MediaType;
import io.cucumber.java.ru.Пусть;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.nep.pages.ContractsPage;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.Map;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ContractSteps {
    public static String paySum = "570.00";
    @Пусть("^получаем печатки клеща$")
    public void AntikleshPrint() {
        ContractsPage contractsPage = page(ContractsPage.class);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].dispatchEvent(new MouseEvent('auxclick', { bubbles: true, cancelable: false, button: 2, " +
                "clientX: arguments[0].getBoundingClientRect().x, " +
                "clientY: arguments[0].getBoundingClientRect().y" +
                "}))", ContractsPage.ContractAntikles);

        ContractsPage.ContractGetPrint.click();
        ContractsPage.Exit.shouldBe(visible, Duration.ofSeconds(300)).click();
    }

    @Пусть("^получаем печатки каско$")
    public void KaskoPrint() {
        ContractsPage contractsPage = page(ContractsPage.class);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].dispatchEvent(new MouseEvent('auxclick', { bubbles: true, cancelable: false, button: 2, " +
                "clientX: arguments[0].getBoundingClientRect().x, " +
                "clientY: arguments[0].getBoundingClientRect().y" +
                "}))", ContractsPage.ContractKasko);

        ContractsPage.ContractGetPrint.click();
        ContractsPage.Exit.shouldBe(visible, Duration.ofSeconds(300)).click();
    }

    @Пусть("^получаем печатки НС$")
    public void NsPrint() {
        ContractsPage contractsPage = page(ContractsPage.class);
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("arguments[0].dispatchEvent(new MouseEvent('auxclick', { bubbles: true, cancelable: false, button: 2, " +
                "clientX: arguments[0].getBoundingClientRect().x, " +
                "clientY: arguments[0].getBoundingClientRect().y" +
                "}))", ContractsPage.ContractNs);

        ContractsPage.ContractGetPrint.click();
        ContractsPage.Exit.shouldBe(visible, Duration.ofSeconds(300)).click();
    }

    @Пусть("^получаем ид и оплачиваем НС$")
    public void NsPay() {
        String orderid = "117839807";

        open("https://test-uw.el-polis.ru/soglasieObjectId.php?order_id=" + orderid);
        String PayDocNumber = ContractsPage.orderID.getText();

        HttpResponse<String> response = Unirest.post("https://b2b.soglasie.ru/upload-test/diasoft/acquiring")
                .basicAuth("nepolis", "QxWS8Fzu")
                .header("Content-Type", "text/xml; charset=utf-8")
                .header("SOAPAction", "SetTransactionPayed")
                .body("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:b2b=\"http://b2b.soglasie.ru/\">\n   <soapenv:Header/>\n   <soapenv:Body>\n      <b2b:setTransactionPayed>\n         <Transaction>\n            <PayDocNumber>" + PayDocNumber + "</PayDocNumber> \n            <TransactionID>1117411489</TransactionID>  \n            <PaySum>" + paySum + "</PaySum> \n         </Transaction>\n      </b2b:setTransactionPayed>\n   </soapenv:Body>\n</soapenv:Envelope>")
                .asString();




    }
}
