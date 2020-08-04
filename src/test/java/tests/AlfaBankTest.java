package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

class AlfaBankTest {
    @Test
    void AlfaBankTest() {

        open("https://alfabank.ru/");
        Configuration.holdBrowserOpen = true;

        $(".l2P2XTW_U").click();

        $(".b2rp5sOus").setValue("Москва");

        $(".g2rp5sOus").click();

        $("html").shouldHave(text("Москва"));

    }
}
