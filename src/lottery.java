import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
	public static void main(String[] args) {
		System.out.println("These are your lottery numbers: ");
		for (int i = 0; i < 5; i++) {

			int randomNumber = new Random().nextInt(51);

			System.out.println(randomNumber);

		}

	}

}
