package tests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import tasks.NavegarPaginaRegistro;
import tasks.RegistroUsuario;

public class RegistrarUsuarioTest {
    @Managed(driver = "appium")
    WebDriver driver;

    Actor ivan = Actor.named("Iván");

    @BeforeEach
    void setUp() {
        ivan.can(BrowseTheWeb.with(driver));
    }

    @Test
    void registrarNuevoUsuario() {
        ivan.attemptsTo(
                NavegarPaginaRegistro.desdeBienvenida(),
                RegistroUsuario.conDatos("Ivan", "iafajardoc@gmail.com", "123456")
        );
    }
}

