package biz.nsdc.uno;

/**
 * Not finished.
 * CSC 233
 * @author Sam Kaessner
 */
public class SkipCard extends SpecialUnoCard {
	private Color color;
	
	/**
	 * Holds a skip card with the given color. 
	 * 
	 * @param color
	 */
	public SkipCard(Color color) {
		this.color = color;
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