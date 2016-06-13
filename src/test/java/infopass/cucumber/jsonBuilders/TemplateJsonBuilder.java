package infopass.cucumber.jsonBuilders;

import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonString;
import javax.json.JsonValue;

/** @author mddamato */
public class TemplateJsonBuilder {

	/* Endpoints */
	private static final String endpointEndpoint = "/endpoint/%s";// GET
																	// /endpoint/{variable}

	/* Form Data */
	private String variable;

	/* Constructor */
	public TemplateJsonBuilder() {
		variable = "noValueSet";
	}

	/* Form Generators */
	public JsonObject getApptRequestFormJson() {
		JsonObjectBuilder mainjsonbuilder = Json.createObjectBuilder();
		// add(mainjsonbuilder, "key" ,variable);
		return mainjsonbuilder.build();
	}

	/********************** Set Json Variables * **********************/

	/** @param variable
	 *            the variable to set */
	public void setVariable(String variable) {
		this.variable = variable;
	}

	/******************* Get Endpoints * *******************/

	/** @return the endpointEndpoint */
	public String getEndpointEndpoint(String variable) {
		return String.format(endpointEndpoint, variable);
	}

}
