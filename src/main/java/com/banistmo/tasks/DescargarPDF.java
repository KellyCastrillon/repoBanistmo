package com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.banistmo.userinterfaces.DescargarArchivo.*;

public class DescargarPDF implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCTOS_Y_SERVICIOS),
                Click.on(DEPOSITOS),
                Click.on(CUENTA_AHORRO_COMERCIAL),
                Click.on(DOCUMENTOS));
    }
    public static DescargarPDF paraValidar() {
        return Tasks.instrumented(DescargarPDF.class);
    }
}
