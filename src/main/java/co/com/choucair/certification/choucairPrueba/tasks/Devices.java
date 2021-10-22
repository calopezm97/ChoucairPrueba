package co.com.choucair.certification.choucairPrueba.tasks;

import co.com.choucair.certification.choucairPrueba.userinterface.UtestDevicesPage;
import co.com.choucair.certification.choucairPrueba.userinterface.UtestLocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Devices implements Task {

    private String strMobile;
    private String strModel;
    private String strOS;

    public static Devices onThePage() {
        return Tasks.instrumented(Devices.class);
    }

    public static Devices onThePage(String strMobile, String strModel, String strOS) {
        return Tasks.instrumented(Devices.class, strMobile, strModel, strOS);
    }

    public Devices(String strMobile, String strModel, String strOS) {
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strOS = strOS;
    }

    public Devices() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestDevicesPage.LAST_STEP));

    }
}
