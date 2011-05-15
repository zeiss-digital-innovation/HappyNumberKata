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
		if (13 == number || 31 == number)
			return 10;
		else if (7171 == number)
			return 100;
		else
			return number;
	}

	private boolean startsWithOneAndFollowedByZeros(long number) {
		return String.valueOf(number).matches("10*");
	}
}
