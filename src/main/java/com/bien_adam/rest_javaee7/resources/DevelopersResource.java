package com.bien_adam.rest_javaee7.resources;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

import com.bien_adam.rest_javaee7.model.Developer;

@Path("developers")
public class DevelopersResource {

	@GET
	public JsonArray developers(@Context HttpHeaders http) {
		JsonObject duchess = Json.createObjectBuilder().add("firstname", "duchess").build();
		throw new RuntimeException("all developers etc. etc.");
		//return  Json.createArrayBuilder().add(duchess).build();
	}

	@GET
	@Path("{first}-{last}")
	public Developer developer(@PathParam("first") String first,
			@PathParam("last") String last) {
		return new Developer(first, last);

	}
}
