package co.com.choucair.certification.choucairPrueba.tasks;

import co.com.choucair.certification.choucairPrueba.actionTime.Waiting;
import co.com.choucair.certification.choucairPrueba.userinterface.UtestLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Location implements Task {

    private String strCity;
    private String strZip;
    private String strCountry;

    public static Location onThePage(String strCity, String strZIP, String strCountry) {
        return Tasks.instrumented(Location.class, strCity, strZIP, strCountry);
    }

    public Location(String strCity, String strZip, String strCountry) {
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strCity).into(UtestLocationPage.INPUT_CITY));
        actor.attemptsTo(Waiting.timeIn(2));
        actor.attemptsTo(
                Hit.the(Keys.DOWN).keyIn(UtestLocationPage.INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(UtestLocationPage.INPUT_CITY),
                Enter.theValue(strZip).into(UtestLocationPage.INPUT_ZIP),
                Enter.keyValues(strCountry).into(UtestLocationPage.INPUT_COUNTRY),
                Click.on(UtestLocationPage.NEXT_DEVICES));

    }
}
