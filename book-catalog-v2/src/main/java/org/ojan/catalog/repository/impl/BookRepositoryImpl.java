package org.ojan.catalog.repository.impl;

import java.util.Map;

import org.ojan.catalog.domain.Book;
import org.ojan.catalog.repository.BookRepository;

public class BookRepositoryImpl implements BookRepository{
	private Map<Long,Book> bookMap;
	
	
	@Override
	public Book findById(Long id) {
		Book book = bookMap.get(id);
		return null;
	}
}
