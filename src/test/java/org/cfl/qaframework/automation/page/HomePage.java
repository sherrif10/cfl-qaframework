package org.cfl.qaframework.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * This class represents the Home page
 */
public class HomePage extends Page {

	private static final String PATH_HOME = "/Dashboard";

	private static final String PATH_RESULT_ENTRY_CONFIG = "ResultConfiguration?ID=43&startingRecNo=1";

	private static final By FIRST_LEVEL_MENU_ORDER = By.id("menu_sample");

	private static final By SECOND_LEVEL_MENU_ADD_ORDER = By.id("menu_sample_add");

	private static final By SECOND_LEVEL_MENU_E_ORDER = By.id("menu_sample_eorder");

	private static final By SECOND_LEVEL_MENU_MODIFY_ORDER = By.id("menu_sample_edit");

	private static final By FIRST_LEVEL_MENU_RESULTS = By.id("menu_results");

	private static final By SECOND_LEVEL_MENU_RESULTS_ENTER_BY_UNIT = By.id("menu_results_logbook");

	private static final By SECOND_LEVEL_MENU_RESULTS_SEARCH = By.id("menu_results_search");

	private static final By THIRD_LEVEL_MENU_RESULTS_SEARCH_PATIENT = By.id("menu_results_patient");

	private static final By THIRD_LEVEL_MENU_RESULTS_SEARCH_ORDER = By.id("menu_results_accession");

	private static final By THIRD_LEVEL_MENU_RESULTS_SEARCH_STATUS = By.id("menu_results_status");

	private static final By RADIO_BUTTON_VALIDATE_TRUE = By.id("value1");

	private static final By BUTTON_SAVE_VALIDATION = By
	        .xpath("//*[@id='mainForm']/table/tbody/tr[5]/td/center/table/tbody/tr/td[1]/button");

	private static final By FIRST_LEVEL_MENU_VALIDATION = By.id("menu_resultvalidation");

	private static final By SECOND_LEVEL_MENU_VALIDATION_ROUTINE = By.id("menu_resultvalidation_routine");

	private static final By SECOND_LEVEL_MENU_VALIDATION_BY_ORDER = By.id("menu_accession_validation");

	private static final By FIRST_LEVEL_MENU_REPORTS = By.id("menu_reports");

	private static final By SECOND_LEVEL_MENU_REPORTS_ROUTINE = By.id("menu_reports_routine");

	private static final By THIRD_LEVEL_MENU_REPORTS_ROUTINE_STATUS_REPORT = By.id("menu_reports_status_patient");

	private static final By FIRST_LEVEL_MENU_WORK_PLAN = By.id("menu_workplan");

	private static final By SECOND_LEVEL_MENU_WORK_PLAN_TEST = By.id("menu_workplan_test");

	private static final By SECOND_LEVEL_MENU_WORK_PLAN_PANEL = By.id("menu_workplan_panel");

	private static final By SECOND_LEVEL_MENU_WORK_PLAN_UNIT = By.id("menu_workplan_bench");

	private static final By FIRST_LEVEL_MENU_PATIENT = By.id("menu_patient");

	private static final By SECOND_LEVEL_MENU_PATIENT_ADD_EDIT = By.id("menu_patient_add_or_edit");

	private static final By ADMIN_MENU_LINK = By.id("menu_administration");

	private  static  final  By SECOND_LEVEL_MENU_ADD_BATCH_ORDERS = By.id("menu_sample_batch_entry");

	private static final By LOG_OUT_BUTTON = By.xpath("//*[@id=\"logout-form\"]/div/input[1]");

	private  static  final  By FIRST_LEVEL_MENU_NON_CONFORMITY = By.id("menu_nonconformity");
	private  static  final  By SECOND_LEVEL_MENU_NON_CONFORMITY_REPORT = By.id("menu_non_conforming_report");

	public HomePage(Page page) {
		super(page);
	}

	@Override
	public String getPageUrl() {
		return PATH_HOME;
	}

	public WebElement getLogOutLink() {
		return findElement(By.id("logout-form"));
	}


}
