package co.com.choucair.certification.choucairPrueba.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestPasswordPage extends PageObject {
    public static final Target CYC_BUTTON = Target.the("Button that shows Cursos y Certificaciones")
            .located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_SEARCH_COURSE = Target.the("Button that search course")
            .located(By.id("coursesearchbox"));
    public static final Target GO_BUTTON = Target.the("Button that search course")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Select course")
            .located(By.id("//h4[@class='result-title']//a[contains(text(),'Foundation Level')]"));
}