package org.ojan.catalog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
	private Long id;
	private String tittle;
	private String description;
	private Author autor;
}
