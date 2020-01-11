package ru.vladigeras.springfeignclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vladi_geras on 11.01.2020
 */
public class User {
	@JsonProperty(value = "id")
	private Long id;

	@JsonProperty(value = "email")
	private String email;

	@JsonProperty(value = "first_name")
	private String firstName;

	@JsonProperty(value = "last_name")
	private String lastName;

	@JsonProperty(value = "avatar")
	private String avatar;

	public Long getId() {
		return id;
	}

	public User setId(Long id) {
		this.id = id;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public User setEmail(String email) {
		this.email = email;
		return this;
	}

	public String getFirstName() {
		return firstName;
	}

	public User setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public User setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public String getAvatar() {
		return avatar;
	}

	public User setAvatar(String avatar) {
		this.avatar = avatar;
		return this;
	}
}
