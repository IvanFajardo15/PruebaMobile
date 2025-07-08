package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class WelcomePage {
    public static final Target BTN_MENU = Target.the("Botón de menú").
            locatedBy("//*[@resource-id = 'com.Advantage.aShopping:id/imageViewMenu']");

    public static final Target BTN_LOGIN = Target.the("").
            locatedBy("//*[@resource-id = 'com.Advantage.aShopping:id/textViewMenuUser']");

}
