package tests.ui;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ListenerTest extends BaseTest {

//    @Owner("QA.GURU")
    @Tag("ui")
    @Test
    @Description(" Проверка доступа к сайту https://github.com/ с Listener")
    void baseTestListener(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        //Поиск и открытие GitHub
        open(baseUrl);
        //Ввести в поиск название страницы на сайте https://github.com/ "AlexGeorgievich/Home-7"
        $(".header-search-input").setValue(Repository).pressEnter();

        //Проверка наличия репозитория  на странице
        $(".repo-list").should(text(Repository));
        $(By.linkText(Repository)).click();

        //Проверить наличие поля Issues
        $("#issues-tab").should(text("issues"));

    }
}
