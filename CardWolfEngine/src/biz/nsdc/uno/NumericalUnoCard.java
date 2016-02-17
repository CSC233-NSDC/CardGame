package biz.nsdc.uno;

/**
 * This is not quite finished, but getting close.
 * 
 * CSC 233
 * 2-6-2016
 * @author Sam Kaessner
 */
public class NumericalUnoCard extends UnoCard {
	private int number;
	private Color color;
	
	
	public NumericalUnoCard(int number, Color color) {
		this.number = number;
		this.color = color;
	}

	@Override
	public boolean isNumeric() {
		return true;
	}

	@Override
	public void doSpecial() {
		
	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public boolean hasColor() {
		return false;
	}

	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		return color.toString() + " " + number;
	}
}