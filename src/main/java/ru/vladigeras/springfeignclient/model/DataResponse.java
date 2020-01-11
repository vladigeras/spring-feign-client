package ru.vladigeras.springfeignclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vladi_geras on 11.01.2020
 */
public class DataResponse<T> {
	@JsonProperty(value = "data")
	private T data;

	public T getData() {
		return data;
	}

	public DataResponse<T> setData(T data) {
		this.data = data;
		return this;
	}
}
