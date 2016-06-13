package infopass.cucumber.apiStepLibraries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static infopass.utils.Verify.verifyThat;
import static org.assertj.core.api.Assertions.assertThat;
import infopass.cucumber.jsonBuilders.TemplateJsonBuilder;
import infopass.utils.DataGenerator;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.Matchers.*;

/** @author mddamato */
public class TemplateApiLibrary extends ScenarioSteps {

	private TemplateJsonBuilder templateJsonBuilder = new TemplateJsonBuilder();

}