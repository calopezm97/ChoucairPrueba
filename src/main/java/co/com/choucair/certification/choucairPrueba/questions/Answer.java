package co.com.choucair.certification.choucairPrueba.questions;

import co.com.choucair.certification.choucairPrueba.userinterface.UtestPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String nameCourse = Text.of(UtestPasswordPage.BUTTON_COMPLETE_SETUP).viewedBy(actor).asString();
        if (question.equals(nameCourse)) {
            return true;
        }else {
            return false;
        }
    }

}
