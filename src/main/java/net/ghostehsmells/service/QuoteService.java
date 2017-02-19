package net.ghostehsmells.service;

import java.util.List;

import net.ghostehsmells.beans.Quote;

public interface QuoteService {
	List<Quote> getAllQuotes();
	Quote getById(int id);
	void addQuote(Quote quote);
}
