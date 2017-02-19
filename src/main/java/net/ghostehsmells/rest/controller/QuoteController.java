package net.ghostehsmells.rest.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ghostehsmells.beans.Quote;
import net.ghostehsmells.service.QuoteServiceImpl;

@RestController
@RequestMapping("/api")
public class QuoteController {

	QuoteServiceImpl quoteService;
	
	public QuoteController() {
		super();
		quoteService = new QuoteServiceImpl();
	}

	@RequestMapping(value="/", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Quote> getQuotes(){
		return quoteService.getAllQuotes();
	}
	
	@RequestMapping()
	public Quote getQuote(int id){
		
		return null;
	}
}
