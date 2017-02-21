package net.ghostehsmells.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.ghostehsmells.beans.Quote;

public interface QuoteDao extends MongoRepository<Quote, String>{
	public List<Quote> findByGame(String game);
}
