package net.ghostehsmells.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ghostehsmells.beans.Quote;
import net.ghostehsmells.dao.QuoteDao;

@Service
public class QuoteServiceImpl implements QuoteService{

	@Autowired
	QuoteDao quoteDao;
	
	@Override
	public List<Quote> getAllQuotes() {
		return quoteDao.findAll();
	}

	@Override
	public Quote getById(String id) {
		return quoteDao.findOne(id);
	}
	
	@Override
	public void addQuote(Quote quote) {
		quoteDao.save(quote);
	}

	@Override
	public List<Quote> findAllByGame(String game) {
		return quoteDao.findByGame(game);
	}
}
