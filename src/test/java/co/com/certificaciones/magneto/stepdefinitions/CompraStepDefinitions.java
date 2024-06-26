package co.com.certificaciones.magneto.stepdefinitions;

import co.com.certificaciones.magneto.tasks.Autenticarse;
import co.com.certificaciones.magneto.tasks.CompraMaleta;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;

import static co.com.certificaciones.magneto.userinterfaces.ProductosPage.TEXT_COMPRA_EXITOSA;

public class CompraStepDefinitions {
    @Dado("el usuario entra en la pagina")
    public void elUsuarioEntraEnLaPagina(List<Map<String, String>> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Autenticarse.autenticacion(datos));

    }
    @Cuando("el usuario compra la maleta")
    public void elUsuarioCompraLaMaleta(List<Map<String, String>> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(CompraMaleta.compraMaleta(datos));

    }
    @Entonces("el usuario deberia ver su compra realizada con exito")
    public void elUsuarioDeberiaVerSuCompraRealizadaConExito() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(TEXT_COMPRA_EXITOSA).isEnabled());
    }
}
