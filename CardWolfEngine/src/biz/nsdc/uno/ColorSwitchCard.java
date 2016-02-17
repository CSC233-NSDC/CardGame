package biz.nsdc.uno;

/**
 * Not yet finished.
 * CSC 233
 * @author Sam Kaessner
 */
public class ColorSwitchCard extends SpecialUnoCard {
	private Color newColor;
	
	
	public ColorSwitchCard(Color newColor) {
		this.newColor = newColor;
	}

	@Override
	public void doSpecial() {
		
	}
	
	/**
	 * This card can stack on any other card. 
	 * 
	 * @param card The card to check against.
	 * @return True.
	 */
	@Override
	public boolean canStack(UnoCard card) {
		return true;
	}

	@Override
	public boolean hasColor() {
		return true;
	}

	@Override
	public Color getColor() {
		return newColor;
	}
}