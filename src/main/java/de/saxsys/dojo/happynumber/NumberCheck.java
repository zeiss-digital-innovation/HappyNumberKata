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
		// Abbruchbedingung
		if (1 == number) {
			return true;
		}
		long[] digits = getDigits(number);
		long sum = 0;
		for (long d : digits) {
			sum += d;
		}
		return (1 == sum);
		// return isHappy(sum);
	}

	private long[] getDigits(long number) {
		String numberString = String.valueOf(number);
		long[] result = new long[numberString.length()];
		for (int i = 0; i < numberString.length(); i++) {
			result[i] = Long.parseLong(numberString.substring(i, i + 1));
		}
		return result;
	}
}
