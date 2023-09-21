package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
	String happy = JOptionPane.showMessageDialog(null, "Are you happy?");
	if(happy == "Yes") {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}else if(happy == "No") {
		String really = JOptionPane.showMessageDialog(null, "Do you want to be happy?");
	} else if(really == "No") {
		JOptionPane.showMessageDialog(null, "");
		}
		}
	}
}
