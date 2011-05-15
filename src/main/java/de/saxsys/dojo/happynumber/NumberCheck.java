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
		long number2Check = number;
		if (!startsWithOneAndFollowedByZeros(number2Check)) {
			number2Check = getSumOfSquaresOfDigitsOf(number);
		}
		return startsWithOneAndFollowedByZeros(number2Check);
	}

	private long getSumOfSquaresOfDigitsOf(long number) {

		long result = 0;

		String numberString = String.valueOf(number);
		for (int i = 0; i < numberString.length(); i++) {
			long digit = Long.parseLong(String.valueOf(numberString.charAt(i)));
			result += (digit * digit);
		}

		// Scanner sc = new Scanner(String.valueOf(number));
		// while (sc.hasNext("[0-9]{1}")) {
		// long digit = Long.parseLong(sc.next("[0-9]{1}"));
		// result += (digit * digit);
		// }
		return result;
	}

	private boolean startsWithOneAndFollowedByZeros(long number) {
		return String.valueOf(number).matches("10*");
	}
}
