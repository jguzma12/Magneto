package co.com.certificaciones.magneto.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.certificaciones.magneto.userinterfaces.ProductosPage.*;

public class CompraMaleta {
    public static Performable compraMaleta(List<Map<String, String>> datos) {
        return Task.where("{0} Compra de la maleta ",
                actor -> {
                    actor.attemptsTo(
                            Click.on(BTN_AGREGAR_CARRITO),
                            Click.on(BTN_CARRITO),
                            Click.on(BTN_CHECKOUT),
                            Enter.theValue(datos.get(0).get("nombre")).into(INPUT_NOMBRE),
                            Enter.theValue(datos.get(0).get("apellido")).into(INPUT_APELLIDO),
                            Enter.theValue(datos.get(0).get("zip")).into(INPUT_ZIP),
                            Click.on(BTN_CONTINUAR),
                            Click.on(BTN_FINALIZAR)

                    );
                }
        );
    }
}
