
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

class OCATest {

	@Test
	void testColocarPozo() {
		Casilla tablero[];
		tablero = new Casilla[63];
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = Casilla.blanco;
			System.out.println(tablero[i]);
		}
		OCA.colocarPozo(tablero);
		int pozo = 31;
		for (int i = 0; i < tablero.length; i++) {
			if (i != pozo - 1) {
				assertNotEquals(Casilla.pozo, tablero[i]);
			} else {
				assertEquals(Casilla.pozo, tablero[pozo - 1]);
			}
		}
	}

}

