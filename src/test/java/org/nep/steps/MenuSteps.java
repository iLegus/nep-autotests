package org.nep.steps;

import io.cucumber.java.ru.Пусть;
import org.nep.pages.MenuPage;

import static com.codeborne.selenide.Selenide.page;

public class MenuSteps {
    @Пусть("^переходим меню в Еосаго$")
    public void eosagoTab()  {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.eosagoTab.click();

    }
}
