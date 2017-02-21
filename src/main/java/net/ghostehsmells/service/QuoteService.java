package net.ghostehsmells.service;

import java.util.List;

import net.ghostehsmells.beans.Quote;

public interface QuoteService {
	List<Quote> getAllQuotes();
	Quote getById(String id);
	void addQuote(Quote quote);
	List<Quote> findAllByGame(String game); 
}
