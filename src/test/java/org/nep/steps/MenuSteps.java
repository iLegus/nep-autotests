package org.nep.steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.Пусть;
import org.nep.pages.MenuPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class MenuSteps {
    @Пусть("^переходим меню в Еосаго$")
    public void eosagoTab()  {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.eosagoTab.shouldBe(visible);
        menuPage.eosagoTab.click();

    }
    @Пусть("^переходим меню в Антиклещ$")
    public void AKTab() {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.AKTab.click();
    }
    @Пусть("^переходим меню в НС$")
    public void NsTab() {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.NsTab.click();
    }
}

