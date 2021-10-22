package co.com.choucair.certification.choucairPrueba.actionTime;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Waiting implements Interaction {

    private int seconds;

    public Waiting(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(seconds* 1000);
    }

    public static Interaction timeIn(int seconds){
        return Tasks.instrumented(Waiting.class, seconds);
    }
}
