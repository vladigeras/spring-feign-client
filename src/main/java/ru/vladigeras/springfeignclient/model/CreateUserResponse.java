package ru.vladigeras.springfeignclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * @author vladi_geras on 12.01.2020
 */
public class CreateUserResponse {
	@JsonProperty(value = "name")
	private String name;

	@JsonProperty(value = "job")
	private String job;

	@JsonProperty(value = "id")
	private String id;

	@JsonProperty(value = "createdAt")
	private LocalDateTime createdAt;

	public String getName() {
		return name;
	}

	public CreateUserResponse setName(String name) {
		this.name = name;
		return this;
	}

	public String getJob() {
		return job;
	}

	public CreateUserResponse setJob(String job) {
		this.job = job;
		return this;
	}

	public String getId() {
		return id;
	}

	public CreateUserResponse setId(String id) {
		this.id = id;
		return this;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public CreateUserResponse setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
		return this;
	}
}
