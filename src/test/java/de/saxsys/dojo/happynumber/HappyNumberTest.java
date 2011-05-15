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

	@Test
	public void dreiIstKeineGluecklicheZahl() throws Exception {
		// 3² = 9
		// 9² = 81
		// 8² + 1² = 65
		// 6² + 5² = 36 + 25 = 61
		// 6² + 1² = 36 + 1 = 37 ..
		assertThat(new NumberCheck().isHappy(3), is(false));
	}

	@Test
	public void ZehnIstEineGluecklicheZahl() throws Exception {
		// 10 : 1² = 1
		assertThat(new NumberCheck().isHappy(10), is(true));
	}

	@Test
	public void HundertIstEineGluecklicheZahl() throws Exception {
		// 100 : 1² = 1
		assertThat(new NumberCheck().isHappy(100), is(true));
	}

	@Test
	public void elfIstKeineGluecklicheZahl() throws Exception {
		// 11 : 1² + 1² = 2 ..
		assertThat(new NumberCheck().isHappy(11), is(false));
	}

	@Test
	public void dreizehnIstEineGluecklicheZahl() throws Exception {
		// 13 : 1² + 3² = 1 + 9 = 10
		// 10 : 1² = 1
		assertThat(new NumberCheck().isHappy(13), is(true));
	}

	@Test
	public void einunddreissigIstEineGluecklicheZahl() throws Exception {
		// 13 : 1² + 3² = 1 + 9 = 10
		// 10 : 1² = 1
		assertThat(new NumberCheck().isHappy(31), is(true));
	}

	@Test
	public void eineGluecklicheZahlIst7171() throws Exception {
		// 7171 : 7² + 1² + 7² + 1² = 49 + 1 + 49 + 1 = 100
		// 100 : 1² = 1
		assertThat(new NumberCheck().isHappy(7171), is(true));
	}
}
