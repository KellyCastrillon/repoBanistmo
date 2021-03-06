package com.banistmo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/transacciones/cuenta_de_ahorro_comercial.feature",
        glue = {"com.banistmo.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class CuentaAhorroComercial {

}
