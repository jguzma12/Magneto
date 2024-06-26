package co.com.certificaciones.magneto.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.certificaciones.magneto.userinterfaces.PrincipalPage.*;

public class Autenticarse {
    public static Performable autenticacion(List<Map<String,String>> datos) {
        return Task.where("{0} inicio de sesion",
                actor -> {
                    actor.attemptsTo(
                            Enter.theValue(datos.get(0).get("usuario")).into(INPUT_USUARIO),
                            Enter.theValue(datos.get(0).get("contrasena")).into(INPUT_CONTRASENA),
                            Click.on(BTN_LOGGEARSE)
                     );
                }
        );
    }
}
