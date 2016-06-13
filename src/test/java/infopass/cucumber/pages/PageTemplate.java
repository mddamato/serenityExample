package infopass.cucumber.pages;

import java.util.List;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.assertj.core.api.Assertions.assertThat;

/** <p>
 * Description of this page class
 * </p>
 * 
 * @author author */
public class PageTemplate extends PageObject {

	@FindBy(id = "idOfTheWebElement") private WebElementFacade webElementName1;

	/** Description of element {@value} */
	private static final String webElementName2CssSelector = "cssSelector";

	public void clickWebElementName1() {

	}

	public void clickWebElementName2() {

	}

}
