package net.ghostehsmells.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Quote {
	@Id
	String id;
	String quoteText;
	String game;
	public Quote() {
		super();
	}
	public Quote(String id, String quoteText, String game) {
		super();
		this.id = id;
		this.quoteText = quoteText;
		this.game = game;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getQuoteText() {
		return quoteText;
	}
	public void setQuoteText(String quoteText) {
		this.quoteText = quoteText;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	@Override
	public String toString() {
		return "Quote [id=" + id + ", quoteText=" + quoteText + ", game=" + game + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((game == null) ? 0 : game.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((quoteText == null) ? 0 : quoteText.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Quote other = (Quote) obj;
		if (game == null) {
			if (other.game != null)
				return false;
		} else if (!game.equals(other.game))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (quoteText == null) {
			if (other.quoteText != null)
				return false;
		} else if (!quoteText.equals(other.quoteText))
			return false;
		return true;
	}
}
