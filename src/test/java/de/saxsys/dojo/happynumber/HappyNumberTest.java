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
	public void zweiIstZutiefstBetruebteZahl() throws Exception {
		assertThat(new NumberCheck().isHappy(2), is(false));
	}

	@Test
	public void dreiIstZutiefstBetruebteZahl() throws Exception {
		assertThat(new NumberCheck().isHappy(3), is(false));
	}
	// Test für 3
	// Test für 10

}
