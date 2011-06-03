package de.saxsys.dojo.happynumber;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HappyNumberTest {

	@Test
	public void einsIstEineGluecklicheZahl() {
		assertThat(new NumberCheck().isHappy(1), is(true));
	}

	@Test
	public void zweiIstZutiefstBetruebteZahl() {
		assertThat(new NumberCheck().isHappy(2), is(false));
	}

	@Test
	public void dreiIstZutiefstBetruebteZahl() {
		assertThat(new NumberCheck().isHappy(3), is(false));
	}

	@Test
	public void zehnIstEineGluecklicheZahl() {
		assertThat(new NumberCheck().isHappy(10), is(true));
	}

	@Test
	public void elfIstKeineGluecklicheZahl() {
		assertThat(new NumberCheck().isHappy(11), is(false));
	}
}
