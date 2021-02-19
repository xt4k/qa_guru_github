package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

    public class YandexTest {

        @Test
        void selenideYandexSearchTest() {
            // Открыть yandex
            open("https://yandex.ru/");
            // Ввести Selenide в поиск yandex
            $("#text").val("Selenide").pressEnter();
            // Проверить, что Selenide появился в результатах поиска
            $("#search-result").shouldHave(Condition.text("Selenide"));
        }
    }

