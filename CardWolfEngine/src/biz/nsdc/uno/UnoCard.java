package biz.nsdc.uno;

import edu.frontrange.csc233.cardwolf.Card;

/**
 * This is an abstract superclass for uno cards. Has methods for determining if it is a 
 * 'special' card (skip, reverse, etc) or a numeric card, and what color the card is.
 * 
 * CSC 233
 * 2-6-2016
 * @author Sam Kaessner
 *
 */
public abstract class UnoCard extends Card {
	
	/**
	 * Returns whether or not the card holds a numeric value.
	 *  
	 * @return True if numeric, false if not.
	 */
	public abstract boolean isNumeric();
	
	/**
	 * If the card is numeric, {@link isNumeric()} then this will return the card's numerical
	 * value. Otherwise, the behavior is unspecified.
	 * 
	 * @return The card number if the card is a numerical card. 
	 */
	public abstract int getNumber();
	
	/**
	 * Stub method, still thinking about how I want to do this.
	 */
	public abstract void doSpecial();
	

	/**
	 * Returns whether or not the card has a color or not.
	 *  
	 * @return True if numeric, false if not.
	 */
	public abstract boolean hasColor();
	
	/**
	 * Returns the color of the card if this card has a color (specified by {@link hasColor()}).
	 * Behavior is undefined if this doesn't have a color, but will probably return null.
	 * 
	 * @return The color of the card if it has one. Undefined behavior otherwise. 
	 */
	public abstract Color getColor();
	
	/**
	 * Tells us if we can legally stack this card on top of the other card. Currently only 
	 * checks to make sure either the two cards are the same numerical value, or if they are 
	 * the same color. Returns true if either condition is true, false otherwise. 
	 * 
	 * @param card The card to check against.
	 * @return True if the cards have the same value or color, false otherwise. 
	 */
	public boolean canStack(UnoCard card) {
		//If we have a colored card and the card has the same color
		if ((hasColor() && card.hasColor() && (getColor() == card.getColor())) || 
				//Or if we are a numeric card and have the same value
				(isNumeric() && card.isNumeric() && (getNumber() == card.getNumber()))) {
			return true;
		}
		return false;
	}
	
	/**
	 * This stores the colors of the uno cards. 
	 * @author Sam Kaessner
	 *
	 */
	public enum Color {
		RED("Red"), YELLOW("Yellow"), GREEN("Green"), BLUE("Blue");
		
		//The readable name of the enum for various purposes.
		private String readableName;
		
		private Color(String name) {
			this.readableName = name;
		}
		
		public String toString() { 
			return readableName; 
		}
	}
}