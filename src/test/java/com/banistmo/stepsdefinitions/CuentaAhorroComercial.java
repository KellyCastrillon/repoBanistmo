package com.banistmo.stepsdefinitions;

import com.banistmo.tasks.DescargarPDF;
import com.banistmo.userinterfaces.IngresoALaPagina;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CuentaAhorroComercial {

    private IngresoALaPagina pagina;

    @Dado("^el usuario ingresa a la pagina$")
    public void elUsuarioIngresaALaPagina() {
        theActorCalled("actor").attemptsTo(
                Open.browserOn(pagina)
        );
    }
    @Cuando("^el usuario intenta descargar el PDF$")
    public void elUsuarioIntentaDescargarElPDF() {
        theActorInTheSpotlight().attemptsTo(DescargarPDF.paraValidar());
    }

    @Cuando("^deberia ver que se descarga el archivo correcto$")
    public void deberiaVerQueSeDescargaElArchivoCorrecto() {

    }

}
