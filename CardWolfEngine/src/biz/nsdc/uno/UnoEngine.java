package biz.nsdc.uno;

import java.util.ArrayList;

import com.google.common.collect.ImmutableList;

import edu.frontrange.csc233.cardwolf.Card;
import edu.frontrange.csc233.cardwolf.CardWolfEngine;

/**
 * Not yet finished
 * CSC 233
 * 2-6-2016
 * @author Sam Kaessner
 *
 */
public class UnoEngine implements CardWolfEngine {
	private UnoDeck deck;
	
	public UnoEngine() {
		deck = new UnoDeck();
		deck.shuffle();
	}

	@Override
	public ImmutableList<? extends Card> dealHand() {
		ArrayList<UnoCard> cards = new ArrayList<>();
		
		for (int i = 0; i < 7; i++) {
			if (deck.hasCardsLeft()) {
				cards.add(deck.getTopCard());
			}
		}
		
		return new ImmutableList.Builder<UnoCard>().addAll(cards.iterator()).build();
	}
	
	public static void main(String args[]) {
		UnoEngine engine = new UnoEngine();
		System.out.println(engine.deck);
		
		System.out.println(engine.dealHand());
	}
}