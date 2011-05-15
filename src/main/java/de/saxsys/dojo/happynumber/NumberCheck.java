package de.saxsys.dojo.happynumber;

public class NumberCheck {

	/**
	 * Prueft, ob eine Zahl gluecklich ist.
	 * 
	 * @param number
	 *            Zahl
	 * @return <code>true</code>, falls es sich um eine glueckliche Zahl handelt
	 */
	public boolean isHappy(long number) {
		return startsWithOneAndFollowedByZeros(number);
	}

	private boolean startsWithOneAndFollowedByZeros(long number) {
		return String.valueOf(number).matches("1(0)*");
	}
}
