package co.com.certificaciones.magneto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrincipalPage {
    public static final Target INPUT_USUARIO = Target.the("Input para ingresar el usuario")
            .located(By.id("user-name"));
    public static final Target INPUT_CONTRASENA = Target.the("Input para ingresar la contraseña")
            .located(By.id("password"));
    public static final Target BTN_LOGGEARSE = Target.the("Boton para logearse")
            .located(By.id("login-button"));
}
