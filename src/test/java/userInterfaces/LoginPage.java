package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target BTN_SIGNUP = Target.the("Botón de registrarse").
            locatedBy("//*[@resource-id = 'com.Advantage.aShopping:id/textViewDontHaveAnAccount']");
}
