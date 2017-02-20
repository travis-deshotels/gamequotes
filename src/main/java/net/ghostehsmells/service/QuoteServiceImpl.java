package net.ghostehsmells.service;

import java.util.HashMap;
import java.util.Map;

import net.ghostehsmells.beans.Quote;

public class QuoteServiceImpl {

	Map<Integer, Quote> theQuotes;
	int count;
	
	public QuoteServiceImpl() {
		super();
		theQuotes = new HashMap<>();
		theQuotes.put(1, new Quote("Zoe! Get yo ass back in the damn house! I'll deal with you later.", 1));
		theQuotes.put(2, new Quote("HADOKEN!", 2));
		theQuotes.put(3, new Quote("Rip and Tear, until it is done!", 3));
		theQuotes.put(4, new Quote("I don't make it a habit to fight the elderly", 4));
		count = 4;
	}

	//@Override
	public Map<Integer, Quote> getAllQuotes() {
		return theQuotes;
	}

	//@Override
	public Quote getById(int id) {
		return theQuotes.get(id);
	}

	//@Override
	public void addQuote(Quote quote) {
		count++;
		theQuotes.put(count, quote);
	}

}
