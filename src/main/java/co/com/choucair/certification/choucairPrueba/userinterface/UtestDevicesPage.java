package co.com.choucair.certification.choucairPrueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestDevicesPage extends PageObject {

    public static final Target INPUT_BRAND = Target.the("Input space brand").located(By.id("brand"));
    public static final Target INPUT_MODEL = Target.the("Input space model").located(By.id("model"));
    public static final Target INPUT_OS = Target.the("Input space OS").located(By.id("os"));

    public static final Target LAST_STEP = Target.the("Button that shows us the form last step")
            .located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));
}
