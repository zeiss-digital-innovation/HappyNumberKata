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
		long nextNumber = number;
		while ((1 != nextNumber)) {
			if (!unhappyNumbers.add(nextNumber)) {
				return false;
			}
			nextNumber = getSumOfSquaresOfDigitsOf(nextNumber);
		}
		return true;
	}

	private long getSumOfSquaresOfDigitsOf(long number) {

		long newNumber = 0;
		final char[] characters = String.valueOf(number).toCharArray();
		for (char character : characters) {
			final long digit = Character.digit(character, 10);
			newNumber += Math.pow(digit, 2);
		}
		return newNumber;
	}
}
