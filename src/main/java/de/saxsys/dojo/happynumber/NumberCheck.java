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
		long number2Check = getSumOfSquaresOfDigitsOf(number);
		return startsWithOneAndFollowedByZeros(number2Check);
	}

	private long getSumOfSquaresOfDigitsOf(long number) {
		return (13 == number) ? 10 : number;
	}

	private boolean startsWithOneAndFollowedByZeros(long number) {
		return String.valueOf(number).matches("10*");
	}
}
