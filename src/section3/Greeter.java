package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String answer=JOptionPane.showInputDialog("Are you bored?");
		JOptionPane.showMessageDialog(null, "Hi, "+answer);
		
	}

}
