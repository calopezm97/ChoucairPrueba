package co.com.choucair.certification.choucairPrueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestPasswordPage extends PageObject {
    public static final Target INPUT_PASS = Target.the("input Password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASS = Target.the("input Confirm password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS_OF_USE = Target.the("Button that search course")
            .located(By.id("termOfUse"));
    public static final Target CHECK_SECURITY_POLICY = Target.the("Select course")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_COMPLETE_SETUP = Target.the("Button that shows us the form to login")
            .located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));
}