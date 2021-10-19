package co.com.choucair.certification.choucairPrueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestRegisterPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("Button that shows us the form to login")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRST_NAME = Target.the("Input space first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Input space last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Input space email").located(By.id("email"));
    public static final Target INPUT_YEAR = Target.the("Input space birth year").located(By.id("birthYear"));
    public static final Target INPUT_DAY = Target.the("Input space birth day").located(By.id("birthDay"));
    public static final Target INPUT_MONTH = Target.the("Input space birth month").located(By.id("birthMonth"));

    public static final Target BUTTON_NEXT = Target.the("Button that shows us the form to login")
            .located(By.xpath("//a[contains(@class,'btn btn-blue')]"));

}
