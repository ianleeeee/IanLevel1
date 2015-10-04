import java.util.Random;

import javax.swing.JOptionPane;

public class cloud9 {
	public static void main(String[] args) {
		float v = 0;
		for (int i = 0; i < 1000000; i++) {
			Random random = new Random();
			int rand = random.nextInt(11);
			Random random2 = new Random();
			int rand2 =  random2.nextInt(11);
			Random random3 = new Random();
			int rand3 = random3.nextInt(11);
			if(rand==rand2 && rand == rand3){
				v=v+1;
				
			}
			else{
				
			}
		}
		JOptionPane.showMessageDialog(null, "Out of 1,000,000 times, the numbers were only the same " +v+" times. That is a probability of "+ (v/1000000.0) +"%");
	}

}
