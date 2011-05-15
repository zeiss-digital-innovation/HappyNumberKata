package de.saxsys.dojo.happynumber;

import java.util.HashSet;
import java.util.Set;

public class NumberCheck {

	/**
	 * Prueft, ob eine Zahl gluecklich ist.
	 * 
	 * @param number
	 *            Zahl
	 * @return <code>true</code>, falls es sich um eine glueckliche Zahl handelt
	 */
	public boolean isHappy(long number) {

		Set<Long> unhappyNumbers = new HashSet<Long>();
		long number2Check = number;
		while (!startsWithOneAndFollowedByZeros(number2Check)) {
			if (!unhappyNumbers.add(number2Check)) {
				return false;
			}
			number2Check = getSumOfSquaresOfDigitsOf(number2Check);
		}
		return true;
	}

	private long getSumOfSquaresOfDigitsOf(long number) {

		long newNumber = 0;
		final String numberString = String.valueOf(number);
		for (int i = 0; i < numberString.length(); i++) {
			final long digit = Long.parseLong(String.valueOf( //
					numberString.charAt(i)));
			newNumber += digit * digit;
		}
		return newNumber;
	}

	private boolean startsWithOneAndFollowedByZeros(long number) {

		return String.valueOf(number).matches("10*");
	}
}
