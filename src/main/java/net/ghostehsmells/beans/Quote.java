package net.ghostehsmells.beans;

public class Quote {
	String quoteText;
	int id;
	public Quote(String quoteText, int id) {
		super();
		this.quoteText = quoteText;
		this.id = id;
	}
	public Quote() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getQuoteText() {
		return quoteText;
	}
	public void setQuoteText(String quoteText) {
		this.quoteText = quoteText;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Quote [quoteText=" + quoteText + ", id=" + id + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		if (quoteText == null) {
			if (other.quoteText != null)
				return false;
		} else if (!quoteText.equals(other.quoteText))
			return false;
		return true;
	}
}
