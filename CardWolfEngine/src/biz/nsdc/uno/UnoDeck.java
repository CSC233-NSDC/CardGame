package biz.nsdc.uno;

import java.util.ArrayList;
import java.util.Random;

import biz.nsdc.uno.UnoCard.Color;

/** 
 * Not yet finished.
 * CSC 233
 * @author Sam Kaessner
 *
 */
public class UnoDeck {
	private ArrayList<UnoCard> cards = new ArrayList<>();
	
	
	/**
	 * Holds a deck of Uno cards. Not quite finished with the implementation yet. 
	 */
	public UnoDeck() {
		for (int i = 0; i < 10; i++) {
			for (Color c : Color.values()) {
				for (int j = 0; j < (i == 0 ? 1 : 2); j++) {
					NumericalUnoCard card = new NumericalUnoCard(i, c);
					cards.add(card);
					System.out.println(card);
				} 
			}
		}
	}
	
	/**
	 * Shuffles the cards. 
	 */
	public void shuffle() {
		ArrayList<UnoCard> shuffledCards = new ArrayList<>();
		
		int i = cards.size();
		while (i > 0) {
			Random random = new Random();
			int rand = random.nextInt(i);
			shuffledCards.add(cards.get(rand));
			cards.remove(rand);
			i = cards.size();
		}
		cards = shuffledCards;
	}
	
	public UnoCard getTopCard() {
		if (hasCardsLeft()) {
			UnoCard card = cards.get(0);
			cards.remove(0);
			return card;
		}
		return null;
	}
	
	
	public boolean hasCardsLeft() {
		return (cards.size() > 0);
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < cards.size(); i++) {
			builder.append(cards.get(i).toString());
			builder.append('\n');
		}
		
		return builder.toString();
	}
}