package co.com.choucair.certification.choucairPrueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestLocationPage extends PageObject {

    public static final Target INPUT_CITY = Target.the("Input space city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Input space code zip").located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("Input space country").located(By.xpath("//div[contains(@class,'ui-select-match')]"));


    public static final Target NEXT_DEVICES = Target.the("Button that shows us the form to login")
            .located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));
}
