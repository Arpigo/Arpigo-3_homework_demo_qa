package guru.qa;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void FormTest() {
        open("/text-box");

        $("[id=userName]").setValue("Egor");
        $("[id=userEmail]").setValue("egorm@mail.ru");
        $("[id=currentAddress]").setValue("Russia");
        $("[id=permanentAddress]").setValue("Velikij Novgorod");
        $("[id=submit]").click();

    }

}
