package org.ojan.catalog.repository;

import org.ojan.catalog.domain.Book;

public interface BookRepository {
	public Book findById(Long id);
}
