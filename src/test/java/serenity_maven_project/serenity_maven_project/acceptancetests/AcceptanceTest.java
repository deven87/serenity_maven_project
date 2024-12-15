package serenity_maven_project.serenity_maven_project.acceptancetests;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/", glue = "serenity_maven_project.serenity_maven_project.steps")
public class AcceptanceTest {
}
