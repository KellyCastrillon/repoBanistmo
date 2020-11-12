package com.banistmo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DescargarArchivo {

    public static final Target PRODUCTOS_Y_SERVICIOS = Target.the("Productos y servicios").locatedBy("//*[contains(text(), \"Productos & Servicios\")]");
    public static final Target DEPOSITOS = Target.the("Depositos").locatedBy("//*[contains(text(), \"Depósitos\")]");
    public static final Target CUENTA_AHORRO_COMERCIAL = Target.the("Cuenta de ahorro comercial").locatedBy("//a[@title=\"Cuenta de Ahorro Comercial\"]");
    public static final Target DOCUMENTOS = Target.the("Documentos").locatedBy("//*[contains(text(), \"Documentos\")]");

}
