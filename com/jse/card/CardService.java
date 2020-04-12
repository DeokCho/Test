package com.jse.card;

public interface CardService {
	public void add(Card card);
	public Card[] getCards();
	public void setCards(Card[] cards);
	public int getCount();
	public void setCount(int count);
}
