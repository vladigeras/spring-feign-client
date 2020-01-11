package ru.vladigeras.springfeignclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author vladi_geras on 11.01.2020
 */
public class PageResponse<T> extends DataResponse<T> {
	@JsonProperty(value = "page")
	private int page;

	@JsonProperty(value = "per_page")
	private int perPage;

	@JsonProperty(value = "total")
	private int totalElements;

	@JsonProperty(value = "total_pages")
	private int totalPages;

	public int getPage() {
		return page;
	}

	public PageResponse<T> setPage(int page) {
		this.page = page;
		return this;
	}

	public int getPerPage() {
		return perPage;
	}

	public PageResponse<T> setPerPage(int perPage) {
		this.perPage = perPage;
		return this;
	}

	public int getTotalElements() {
		return totalElements;
	}

	public PageResponse<T> setTotalElements(int totalElements) {
		this.totalElements = totalElements;
		return this;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public PageResponse<T> setTotalPages(int totalPages) {
		this.totalPages = totalPages;
		return this;
	}
}
