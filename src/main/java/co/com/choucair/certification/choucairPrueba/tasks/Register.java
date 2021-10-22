package co.com.choucair.certification.choucairPrueba.tasks;

import co.com.choucair.certification.choucairPrueba.model.UtestData;
import co.com.choucair.certification.choucairPrueba.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task {

    private String strFirstName;
    private String strLastName;
    private String day;
    private String month;
    private String year;
    private String strEmail;

    public static Register onThePage(UtestData utestData){
        return Tasks.instrumented(Register.class, utestData.getStrFirstName(), utestData.getStrLastName(), utestData.getDay(), utestData.getMonth(), utestData.getYear(), utestData.getStrEmailAddress());
    }
    public static Register onThePage(String strFirstName, String strLastName, String day, String month, String year, String strEmail) {
        return Tasks.instrumented(Register.class, strFirstName, strLastName, day, month, year, strEmail);
    }

    public Register(String strFirstName, String strLastName, String day, String month, String year, String strEmail) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.strEmail = strEmail;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegisterPage.REGISTER_BUTTON),
                Enter.theValue(strFirstName).into(UtestRegisterPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UtestRegisterPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UtestRegisterPage.INPUT_EMAIL),
                Enter.keyValues(day).into(UtestRegisterPage.INPUT_DAY),
                Enter.keyValues(month).into(UtestRegisterPage.INPUT_MONTH),
                Enter.keyValues(year).into(UtestRegisterPage.INPUT_YEAR),
                Click.on(UtestRegisterPage.BUTTON_NEXT));

    }
}
