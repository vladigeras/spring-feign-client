package ru.vladigeras.springfeignclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vladi_geras on 12.01.2020
 */
public class CreateUser {
	@JsonProperty(value = "name")
	private String name;

	@JsonProperty(value = "job")
	private String job;

	public CreateUser(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}
}
