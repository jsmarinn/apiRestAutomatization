package io.regres.services.rest.runners.consultarUsuario;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = {"src/test/resources/feature/consultarUsuario/consultar_usuario.feature"},
        glue = {"io.regres.services.rest.stepdefinitions","io.regres.services.rest.utils"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class ConsultaUsuarioRestRunner {
}