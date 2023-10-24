package org.nep.steps;

import io.cucumber.java.ru.Пусть;
import org.nep.pages.AntikleshPage;
import java.util.Map;
import static com.codeborne.selenide.Selenide.page;
import static org.nep.Utils.DateUtil.SIMPLE_DOT;
import static org.nep.Utils.DateUtil.getDate;
public class AntikleshSteps {
    @Пусть("^Заполняем все данные для рассчета клеща$")
    public void AntikleshData(Map<String, String> values){
        AntikleshPage antikleshPage = page (AntikleshPage.class);
        AntikleshPage.BirthDate.setValue(values.get("ДатаРождения"));
    }

}
