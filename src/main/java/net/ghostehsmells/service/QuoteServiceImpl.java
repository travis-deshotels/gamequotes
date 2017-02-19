package net.ghostehsmells.service;

import java.util.ArrayList;
import java.util.List;

import net.ghostehsmells.beans.Quote;

public class QuoteServiceImpl {//implements QuoteService{

	List<Quote> theQuotes;
	
	public QuoteServiceImpl() {
		super();
		theQuotes = new ArrayList<>();
		theQuotes.add(new Quote("Zoe! Get yo ass back in the damn house! I'll deal with you later.", 1));
		theQuotes.add(new Quote("HADOKEN!", 2));
	}

	//@Override
	public List<Quote> getAllQuotes() {
		return theQuotes;
	}

	//@Override
	public Quote getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public void addQuote(Quote quote) {
		// TODO Auto-generated method stub
		
	}

}
