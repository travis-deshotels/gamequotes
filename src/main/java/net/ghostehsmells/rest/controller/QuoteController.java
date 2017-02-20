package net.ghostehsmells.rest.controller;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Map<Integer, Quote> getQuotes(){
		return quoteService.getAllQuotes();
	}
	
	@RequestMapping(value="/quote/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Quote getQuote(@PathVariable("id") int id){
		return quoteService.getById(id);
	}
	
	@RequestMapping(value="/quote", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public void saveQuote(@RequestBody Quote quote){
		quoteService.addQuote(quote);
	}
}
