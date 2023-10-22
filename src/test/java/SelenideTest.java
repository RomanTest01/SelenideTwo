import org.junit.jupiter.api.Test;

//import static com.codeborne.selenide.Condition.exactText;
//import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest {

    @Test

    void testForm(){
        open("http://localhost:9999/");
        $("[data-test-id='city']").setValue("Москва");
        //$(byText("Выберите ваш город")).setValue("Москва");
        $("[data-test-id='date']").setValue("25.10.2023");
        $("[data-test-id='name']").setValue("Тимофеев Тимофей");
        $("[data-test-id='phone']").setValue("+79995551313");
        $("[data-test-id='agreement']").click();
        $("button").click();


    }
}
