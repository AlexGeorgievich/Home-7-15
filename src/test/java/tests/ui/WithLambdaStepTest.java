package tests.ui;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class WithLambdaStepTest extends BaseTest {

//    String Repository = "AlexGeorgievich/Home-7";



    @Test
    @Owner("QA.GURU")
    @Tag("ui")
    @Description("Тест https://github.com с оформлением  оперторов в стиле Лямбда  ")
    void testWithLambdaStep(){

        step("Открытие сайта " + baseUrl, () -> {
            open(baseUrl);
        });

        step("В поисках на https://github.com репозитория -" + Repository, () -> {
            $(".header-search-input").setValue(Repository).pressEnter();
        });

        step("Проверка достоверности поиска  " + Repository, () -> {
            $(".repo-list").should(text(Repository));
        });

        step("Открытие на https://github.com репозитория " + Repository, () -> {
            $(By.linkText(Repository)).click();
        });

        step("Подтверждение наличия запрошенного поля ", () -> {
            $("#issues-tab").should(text("issues"));
        });
    }
}
