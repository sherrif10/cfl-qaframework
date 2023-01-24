package org.openelisglobal.qaframework;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        // defining ordered by name features folder
        features = { "src/features" },
        // defining the definition steps package
        glue = "org.openelisglobal.qaframework.automation", plugin = { "pretty"},monochrome = true)
public class RunTest {
	
	public class HOOK {
		
		public static final String LOGIN = "@login";
		
		public static final String ORDER = "@order";
		
		public static final String RESULT = "@results";
		
		public static final String VALIDATE = "@validate";
		
		public static final String REPORT = "@report";
		
		public static final String PATIENT_ENTRY = "@patientEntry";

		public static final String MODIFY_ORDER = "@modifyOrder";

		public static final String REFERAL_WORK_FLOW = "@referral";
		
		public static final String EMR_LIS = "@emrLis";
	}
}
