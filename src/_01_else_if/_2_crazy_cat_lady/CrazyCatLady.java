
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		String catNumber = JOptionPane.showInputDialog("How many cats do you have (In numbers please).");
		int catAsInt = Integer.parseInt(catNumber);
		if(catAsInt >= 3){
		JOptionPane.showMessageDialog(null, "You are a crazy cat lady");
		} else if(catAsInt < 3 > 0){
		playVideo(https://www.youtube.com/watch?v=4JB20_BJJnE);
		} else if(catAsInt = 0){
			JOptionPane.showMessageDialog(null, "You need to get a cat, but no more than 3.");
		}
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

