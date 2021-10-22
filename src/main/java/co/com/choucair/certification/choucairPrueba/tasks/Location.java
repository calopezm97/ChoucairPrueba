package co.com.choucair.certification.choucairPrueba.tasks;

import co.com.choucair.certification.choucairPrueba.actionTime.Waiting;
import co.com.choucair.certification.choucairPrueba.userinterface.UtestLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class Location implements Task {

    private String strCity;
    private String strZip;

    public static Location onThePage(String strCity, String strZIP) {
        return Tasks.instrumented(Location.class, strCity, strZIP);
    }

    public Location(String strCity, String strZip) {
        this.strCity = strCity;
        this.strZip = strZip;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strCity).into(UtestLocationPage.INPUT_CITY));
        actor.attemptsTo(Waiting.timeIn(2));
        actor.attemptsTo(

                Enter.theValue(strCity).into(UtestLocationPage.INPUT_CITY).thenHit(Keys.DOWN).thenHit(Keys.ENTER),
                Enter.theValue(strZip).into(UtestLocationPage.INPUT_ZIP),
                Click.on(UtestLocationPage.NEXT_DEVICES));

    }
}
