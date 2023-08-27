
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.AWTException;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) throws AWTException {
		
		
        while (true) {
		String shape = JOptionPane.showInputDialog("What shape do you want? We offer Spiral, Square, and Pentagon.");
		if(shape.equals("Spiral")) {
			spiral();
		} else if(shape.equals("Square")) {
			square();
		} else if(shape.equals("Pentagon")) {
			pentagon();
		}
     }
		
		
		



	}
	static void spiral() {
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.hide();
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("What color do you want to draw with?");
		String speed = JOptionPane.showInputDialog("What speed would you like to draw at?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equals("Red")) {
			rob.setPenColor(255, 0, 0);
		} else if(color.equals("Orange")) {
			rob.setPenColor(255, 165, 0);
		} else if(color.equals("Yellow")) {
			rob.setPenColor(255, 255, 0);
		} else if(color.equals("Green")) {
			rob.setPenColor(0, 255, 0);
		} else if(color.equals("Blue")) {
			rob.setPenColor(0, 0, 255);
		} else if(color.equals("Purple")) {
			rob.setPenColor(0, 165, 255);
		}
        //6. If the user doesn't enter anything, choose a random color
		int speedAsInt = Integer.parseInt(speed);
		rob.penDown();
		rob.setSpeed(speedAsInt);
		int count = 0;
		while (count < 50) {
			rob.move(5*count);
			rob.turn(180/3);    
			count += 1;
		
		}
	}
	static void square() {
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.hide();
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("What color do you want to draw with?");
		String speed = JOptionPane.showInputDialog("What speed would you like to draw at?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equals("Red")) {
			rob.setPenColor(255, 0, 0);
		} else if(color.equals("Orange")) {
			rob.setPenColor(255, 165, 0);
		} else if(color.equals("Yellow")) {
			rob.setPenColor(255, 255, 0);
		} else if(color.equals("Green")) {
			rob.setPenColor(0, 255, 0);
		} else if(color.equals("Blue")) {
			rob.setPenColor(0, 0, 255);
		} else if(color.equals("Purple")) {
			rob.setPenColor(0, 165, 255);
		}
        //6. If the user doesn't enter anything, choose a random color
		int speedAsInt = Integer.parseInt(speed);
		rob.penDown();
		rob.setSpeed(speedAsInt);
		int count = 0;
		while ( count < 4 ) { 
	    	 rob.move(300);
	    	 rob.turn(90);
	    	 count += 1;
	      }
		
	}
	static void pentagon() {
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.hide();
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("What color do you want to draw with?");
		String speed = JOptionPane.showInputDialog("What speed would you like to draw at?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equals("Red")) {
			rob.setPenColor(255, 0, 0);
		} else if(color.equals("Orange")) {
			rob.setPenColor(255, 165, 0);
		} else if(color.equals("Yellow")) {
			rob.setPenColor(255, 255, 0);
		} else if(color.equals("Green")) {
			rob.setPenColor(0, 255, 0);
		} else if(color.equals("Blue")) {
			rob.setPenColor(0, 0, 255);
		} else if(color.equals("Purple")) {
			rob.setPenColor(0, 165, 255);
		}
        //6. If the user doesn't enter anything, choose a random color
		int speedAsInt = Integer.parseInt(speed);
		rob.penDown();
		rob.setSpeed(speedAsInt);
		int sides = 5;
		int count = 0;
		int angle = 360/sides;
		while (count < 200) {
			rob.move(count);
			rob.turn(angle + 1);
			count += 1;
		}
	}
}
