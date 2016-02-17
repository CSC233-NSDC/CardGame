package biz.nsdc.uno;

/**
 * Just a simple abstract class to remove some tedium from creating classes and to make 
 * the handling of non-numerical cards as uniform as possible. 
 * 
 * CSC 233
 * 2-6-2016
 * @author Sam Kaessner
 *
 */
public abstract class SpecialUnoCard extends UnoCard {
	@Override
	public boolean isNumeric() {
		return false;
	}

	@Override
	public int getNumber() {
		return -1;
	}
}