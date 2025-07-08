package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistroUsuario implements Task {
    private final String username;
    private final String email;
    private final String password;

    public RegistroUsuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public static RegistroUsuario conDatos(String usuario, String email, String contraseña) {
        return instrumented(RegistroUsuario.class, usuario, email, contraseña);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }
}
