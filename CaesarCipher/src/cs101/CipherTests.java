package cs101;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CipherTests {

	@Test
	void offset0() {
		CaesarCipher cipher = new CaesarCipher(0);

		char[] m = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z' };

		char[] c = cipher.encrypt(m);

		equals(m, c);
	}

	@Test
	void offset5() {
		CaesarCipher cipher = new CaesarCipher(5);

		char[] m = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z' };

		char[] c = cipher.encrypt(m);

		char[] c_real = { 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
				'Y', 'Z', 'A', 'B', 'C', 'D', 'E' };
		equals(c_real, c);
	}

	@Test
	void offset3mixed() {
		CaesarCipher cipher = new CaesarCipher(3);

		char[] m = { 'A', 'B', 'P', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'C', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z' };

		char[] c = cipher.encrypt(m);

		char[] c_real = { 'D', 'E', 'S', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'F', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z', 'A', 'B', 'C' };
		equals(c_real, c);
	}

	@Test
	void offset36() {
		CaesarCipher cipher = new CaesarCipher(36);

		char[] m = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
				'U', 'V', 'W', 'X', 'Y', 'Z' };

		char[] c = cipher.encrypt(m);

		char[] c_real = { 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C',
				'D', 'E', 'F', 'G', 'H', 'I', 'J' };
		equals(c_real, c);
	}

	// helper
	void equals(char[] a, char[] b) {
		assertEquals(a.length, b.length);

		for (int i = 0; i < a.length; i++) {
			assertEquals(a[i], b[i]);
		}

	}

}
