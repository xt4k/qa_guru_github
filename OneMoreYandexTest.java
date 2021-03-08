package guru.qa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class OneMoreYandexTest {

    @DisplayName("Yandex test")
    @Test
    void selenideYandexSearchTest() {
        open("https://yandex.ru/");
        $("#text").val("Selenide").pressEnter();
        $("#search-result").shouldHave(text("Selenide"));
    }
}
