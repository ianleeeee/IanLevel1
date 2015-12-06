
public class forloop {
	public static void main(String[] args) {
		///#1 
		///for (int i = 0; i < 101; i++) {
			///System.out.println(i);
		///}
		///#2
		///for (int i = 100; i > -1; i--) {
			///System.out.println(i);
		///}
		///#3
		///for (int i = 2; i < 101; i+=2) {
			///System.out.println(i);
		///}
		///#4
		///for (int i = 1; i < 100; i+=2) {
			///System.out.println(i);
		///}
		///#5
		///for (int i = 0; i < 501; i++) {
			///if (i%2==0) {
				///System.out.println(i + " even");
			///}
			///else{
				///System.out.println(i + " odd");
			///}
		///}
		///#6
		///for (int i = 1; i < 112; i++) {
			
			///System.out.println(i*7);
		///}
		///#7 
		for (int i = 0; i < 2016; i++) {
			int x = i-2015;
			int y = x+13;
			System.out.println("In " + i + ", I was " + y);
		}
	}

}
