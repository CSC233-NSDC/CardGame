package biz.nsdc.uno;

/**
 * Stores the implementation of a draw-2 or draw-4 card. Not finished.
 * CSC 233
 * @author Sam Kaessner
 */
public class DrawCard extends SpecialUnoCard {
	private int cardsToDraw;
	private Color color;
	
	
	public DrawCard(Color color, int cardsToDraw) {
		this.color = color;
		this.cardsToDraw = cardsToDraw;
	}
	
	@Override
	public void doSpecial() {
		
	}

	@Override
	public boolean hasColor() {
		return true;
	}

	@Override
	public Color getColor() {
		return color;
	}

}