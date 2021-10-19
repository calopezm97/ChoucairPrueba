package co.com.choucair.certification.choucairPrueba.tasks;

import co.com.choucair.certification.choucairPrueba.userinterface.UtestPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Password implements Task {

    private String password, confirmPassword;

    public Password(String password, String confirmPassword) {
        this.password = password;
        this.confirmPassword = confirmPassword;

    }

    public static Password the(String password, String confirmPassword) {
        return Tasks.instrumented(Password.class, password, confirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestPasswordPage.CYC_BUTTON),
                Enter.theValue(password).into(UtestPasswordPage.INPUT_SEARCH_COURSE),
                Enter.theValue(confirmPassword).into(UtestPasswordPage.INPUT_SEARCH_COURSE),
                Click.on(UtestPasswordPage.GO_BUTTON));
    }
}
