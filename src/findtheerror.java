
import javax.swing.JOptionPane;

public class findtheerror {
	public static void main(String[] args) {
		String ballerr = JOptionPane.showInputDialog("What is your name?");
		String baller = JOptionPane.showInputDialog("How are you feeling?");
		JOptionPane.showMessageDialog(null, ballerr + ", you are feeling "
				+ baller);
		String swig = JOptionPane.showInputDialog("Because you are feeling "
				+ baller
				+ ", we are going on an adventure! Where do you want to go?");
		String numero = JOptionPane.showInputDialog("Ok, let's go to " + swig
				+ ". What do you want to do first?");
		if (numero.equals("eat")) {
			JOptionPane.showMessageDialog(null, "You are fat");
		} else
			;
		{
			JOptionPane.showMessageDialog(null, "Ok let's do that.");
			JOptionPane.showMessageDialog(null,
					"Ok that was fun! Now let's go back home.");

		}

	}
}
