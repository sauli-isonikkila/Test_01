package media;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class KirjaTest {

	@Test
	void testSetJulkaisuVuosiOnNegatiivinen() {
		int julkaisuVuosi = -10;
		Kirja k1 = new Kirja();
		boolean okJulkaisuVuosi = k1.setJulkaisuVuosi(julkaisuVuosi);
		Assert.assertTrue(okJulkaisuVuosi == false);
	}
	
	@Test
	void testSetJulkaisuVuosiOnNolla() {
		int julkaisuVuosi = 0;
		Kirja k1 = new Kirja();
		boolean okJulkaisuVuosi = k1.setJulkaisuVuosi(julkaisuVuosi);
		Assert.assertTrue(okJulkaisuVuosi == true);
	}
	
	@Test
	void testSetJulkaisuVuosiOnPositiivinen() {
		int julkaisuVuosi = 2023;
		Kirja k1 = new Kirja();
		boolean okJulkaisuVuosi = k1.setJulkaisuVuosi(julkaisuVuosi);
		Assert.assertTrue(okJulkaisuVuosi == true);
	}
	
	
}
