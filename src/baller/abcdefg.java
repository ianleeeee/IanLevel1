package baller;

import javax.swing.JOptionPane;

public class abcdefg {
	public static void main(String[] args) {
		abcdefg a = new abcdefg();
	}

	abcdefg() {
		// /#1
		// /System.out.println(addTen(5));

		// /#2
		// /System.out.println(hi("hello"));

		// /#3
		// /System.out.println(color());

		// /#4
		// /System.out.println(subtracter(7,8.5f));

		// /#5
		// /System.out.println(multiply(1,2,3));

		// /#6
		// /name();

		// /#7
		// /convert("Hello",4);

		// /8
		// /System.out.println(hi(1,0));
	}

	// /number 1
	int addTen(int hi) {
		return hi + 10;
	}

	// /number 2
	String hi(String hello) {
		return hello + "!";
	}

	// /number 3
	String color() {
		String fav = JOptionPane
				.showInputDialog("What is your favorite color?");
		return fav;
	}

	// /number 4
	float subtracter(int a, float b) {
		float c = b - a;
		return c;
	}

	// /number 5
	int multiply(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}

	// /number 6
	void name() {
		for (int i = 0; i < 25; i++) {
			System.out.println("Ian");
		}
	}

	// /number 7
	void convert(String number2, int number) {
		if (number > number2.length()) {
			System.out.println(number2);
		} else {
			System.out.println("too low");
		}
	}

	// /number 8
	float hi(float a, float b) {
		if (b == 0) {
			System.out.println("Do not divide by 0");
			return 0;
		}
		float c = a / b;
		return c;
	}
}
