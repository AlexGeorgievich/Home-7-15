package tests.ui;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class WebStepsTest extends BaseTest{
//    @Owner("QA.GURU")
    @Test
    @Tag("ui")
    @Description(" Тест с оформлением результатов с аннотацией Step")
    void webSteps() {
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.lookingForRepository(Repository);
        steps.checkRepository(Repository);
        steps.openRepository(Repository);
        steps.checkIssueTab(Repository);
    }
}
