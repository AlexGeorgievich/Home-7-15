package tests.ui;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CleareTest extends BaseTest {

    @Test
    @Owner("QA.GURU")
//    @Tag("ui")
    @Tags({@Tag("smoke"), @Tag("ui")})

    @Description(" Тест доступа к сайту https://github.com/ в простой форме оформления")
    void cleareTest() {
        //Поиск и открытие сайта GitHub
        open(baseUrl);
        //Ввести в поиск название страницы Repository
        $(".header-search-input").setValue(Repository).pressEnter();

        //      Проверка, что искомый репозиторий есть на странице
        $(".repo-list").should(text(Repository));
        $(By.linkText(Repository)).click();
//        Проверить наличие поля Issues  на странице
        $("#issues-tab").should(text("issues"));
    }
}
