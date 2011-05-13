package de.saxsys.dojo.happynumber;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HappyNumberTest {

	@Test
	public void einsIstEineGluecklicheZahl() throws Exception {
		assertThat(new NumberCheck().isHappy(1), is(true));
	}

	@Test
	public void zweiIstKeineGluecklicheZahl() throws Exception {
		// 2² = 4
		// 4² = 16
		// 1² + 6² = 1 + 36 = 37
		// 3² + 7² = 9 + 49 = 58
		// 5² + 8² = 25 + 64 = 89
		// 8² + 9² = 64 + 81 = 145
		// 1² + 4² + 5² = 1 + 16 + 25 = 42
		// 4² + 2² = 16 + 4 = 20
		// 2² = 4 ...
		assertThat(new NumberCheck().isHappy(2), is(false));
	}
}
