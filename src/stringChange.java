public class stringChange {
	public static void main(String[] args) {
		String hi = "Hello";
		StringBuilder yes = new StringBuilder(hi);
		for (int i = 0; i < hi.length(); i++) {
			yes.setCharAt(i, '*');
		}
		System.out.println(yes);
	}

}
