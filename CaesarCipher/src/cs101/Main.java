package cs101;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		CaesarCipher cc = new CaesarCipher(3);

		char[] myMessage = { 'H', 'E', 'L', 'L', 'O', 'W', 'O', 'R', 'L', 'D' };

		System.out.println("My original message is: " + Arrays.toString(myMessage));

		char[] myCiphertext = cc.encrypt(myMessage);

		System.out.println("My cipher is: " + Arrays.toString(myCiphertext));

		char[] decryptedMessage = cc.decrypt(myCiphertext);

		System.out.println("My decrypted message is: " + Arrays.toString(decryptedMessage));

	}

}
