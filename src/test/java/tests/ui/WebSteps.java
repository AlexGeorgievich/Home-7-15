package tests.ui;


import io.qameta.allure.Step;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {
    @Step("Поиск и открытие страницы GitHub")
    public void openMainPage() {
        open(baseUrl);
    }
    @Step("Поиск в GitHub репозитория {Repository}")
    public void lookingForRepository(String Repository) {
//        $(".header-search-input").click();
        $(".header-search-input").setValue(Repository).pressEnter();
    }
    @Step("Проверка наличие на https://github.com репозитория  {Repository}")
    public void checkRepository(String Repository) {
        $(".repo-list").should(text(Repository));
    }
    @Step("Открытие репозитория  {Repository}")
    public void openRepository(String Repository) {
        $(By.linkText(Repository)).click();
    }
    @Step("Контроль наличия на странице вкладки 'issues'")
    public void checkIssueTab(String Repository) {
        $("#issues-tab").should(text("issues"));
    }
}
