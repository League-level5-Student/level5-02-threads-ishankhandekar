package _02_Advanced_Robot_Race;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Robot[] r = new Robot[5];
		//3. use a for loop to initialize the robots.
			for (int i = 0; i < r.length; i++) {
				r[i] = new Robot();
				r[i].setSpeed(100);
			}
			//4. make each robot start at the bottom of the screen, side by side, facing up
			r[0].moveTo(400,550);
			r[1].moveTo(500, 550);
			r[2].moveTo(600, 550);
			r[3].moveTo(700, 550);
			r[4].moveTo(800, 550);
			Thread r1r;
			Thread r2r;
			Thread r3r; 
			Thread r4r;
			Thread r5r;
		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
			
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
			boolean r1 = false;
			int whichRobot = 0;
		while (r1 == false) {
			 r1r = new Thread(()->{
				for (int i = 0; i < 100; i++) {	
					r[0].move(new Random().nextInt(51));
				}
			});
			r1r.start();
			r2r = new Thread(()->{
				for (int i = 0; i < 100; i++) {	
					r[1].move(new Random().nextInt(51));
				}
			});
			r2r.start();
			r3r = new Thread(()->{
				for (int i = 0; i < 100; i++) {	
					r[2].move(new Random().nextInt(51));
				}
			});
			r3r.start();
			r4r = new Thread(()->{
				for (int i = 0; i < 100; i++) {	
					r[3].move(new Random().nextInt(51));
				}
			});
			r4r.start();
			r5r = new Thread(()->{
				for (int i = 0; i < 100; i++) {	
					r[4].move(new Random().nextInt(51));
				}
			});
			r5r.start();
			
			if (r[0].getY() <= 5) {
				whichRobot = 1;
				r1 = true;
			}if (r[1].getY() <= 5) {
				whichRobot = 2;
				r1 = true;
			}if (r[2].getY() <= 5) {
				whichRobot = 3;
				r1 = true;
			}if (r[3].getY() <= 5) {
				whichRobot = 4;
				r1 = true;
			}if (r[4].getY() <= 5) {
				whichRobot = 5;
				r1 = true;
			}
		}
			
		//7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "Robot " + whichRobot + " wins!");
		r[whichRobot -1].sparkle();
	}
	
}
