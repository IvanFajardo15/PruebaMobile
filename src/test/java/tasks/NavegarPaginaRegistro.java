package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userInterfaces.LoginPage;
import userInterfaces.WelcomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NavegarPaginaRegistro implements Task {

    public static NavegarPaginaRegistro desdeBienvenida() {
        return instrumented(NavegarPaginaRegistro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(WelcomePage.BTN_MENU),
                Click.on(WelcomePage.BTN_LOGIN),
                Click.on(LoginPage.BTN_SIGNUP)
        );
    }

}
