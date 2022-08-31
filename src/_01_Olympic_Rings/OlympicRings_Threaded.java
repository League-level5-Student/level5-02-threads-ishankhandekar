package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	static Robot timmy = new Robot(400, 700);
	static Robot tammy = new Robot(800, 700);
	static Robot sammy = new Robot(1200, 700);
	
	public static void main(String[] args) {
		timmy.setSpeed(10);
		tammy.setSpeed(10);
		sammy.setSpeed(10);
		
		
		
		timmy.moveTo(400, 700);
		tammy.moveTo(800, 700);
		sammy.moveTo(1200, 700);
		timmy.penDown();
		tammy.penDown();
		sammy.penDown();
		timmy.hide();
		tammy.hide();
		sammy.hide();
		Thread r1 = new Thread(()->{
			for (int i = 0; i < 100; i++) {
				
				timmy.move(4);
				timmy.turn(5);
			}
		});
		r1.start();
		Thread r2 = new Thread(()->{
			for (int i = 0; i < 100; i++) {
				
				tammy.move(4);
				tammy.turn(5);
			}
		});
		r2.start();Thread r3 = new Thread(()->{
			for (int i = 0; i < 100; i++) {
				
				sammy.move(4);
				sammy.turn(5);
			}
		});
		r3.start();
	}
	
}

