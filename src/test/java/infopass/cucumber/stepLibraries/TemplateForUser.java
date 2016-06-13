package infopass.cucumber.stepLibraries;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.assertj.core.api.Assertions.assertThat;
import infopass.cucumber.pages.PageTemplate;

/** @author authorName Description of this User. */
public class TemplateForUser extends ScenarioSteps {

	private static final long serialVersionUID = 1009287685241604703L;

	/** Pages needed for this user */

	PageTemplate pageTemplate;

	/** Each Step this user can perform */
	@Step
	public void userAction1() {

		pageTemplate.open();
	}

	@Step
	public void userAction2(String stringInput) {

	}
}
