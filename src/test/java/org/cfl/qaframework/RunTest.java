package org.cfl.qaframework;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        // defining ordered by name features folder
        features = { "src/features" },
        // defining the definition steps package
        glue = "org.cfl.qaframework.automation", plugin = { "pretty"},monochrome = true)
public class RunTest {

	public class HOOK {

		public static final String LOGIN = "@login";

	}
}
