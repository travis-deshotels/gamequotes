package net.ghostehsmells.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.ghostehsmells.beans.Quote;
import net.ghostehsmells.service.QuoteService;
import net.ghostehsmells.service.QuoteServiceImpl;

@RestController
@RequestMapping("/api")
public class QuoteController {

	@Autowired
	QuoteService quoteService;
	
	public QuoteController() {
		super();
		quoteService = new QuoteServiceImpl();
	}

	@RequestMapping(value="/quote", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Quote> getQuotes(){
		return quoteService.getAllQuotes();
	}
	
	@RequestMapping(value="/quote/id/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Quote getQuote(@PathVariable("id") String id){
		return quoteService.getById(id);
	}
	
	@RequestMapping(value="/quote/game/{game}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Quote> getQuotesByGame(@PathVariable("game") String game){
		return quoteService.findAllByGame(game);
	}
	
	@RequestMapping(value="/quote", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public void saveQuote(@RequestBody Quote quote){
		quoteService.addQuote(quote);
	}
}
