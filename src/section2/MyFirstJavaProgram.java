package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot Grumn=new Robot();
Grumn.sparkle();
Grumn.penDown();
Grumn.setPenColor(250,200,100);
Grumn.setSpeed(1000);
Grumn.move(200);
Grumn.turn(90);
Grumn.move(10);
Grumn.turn(90);
Grumn.move(200);
Grumn.turn(90);
Grumn.move(10);
Grumn.move(202);
Grumn.turn(92);
Grumn.move(12);
Grumn.turn(92);
Grumn.move(202);
Grumn.turn(92);
Grumn.move(12);
Robot NoU=new Robot();
NoU.penDown();
NoU.setPenColor(100,300,10);
NoU.setSpeed(2000000000);
for(int i =0; i<200000000; i++) {
NoU.move(5);
NoU.turn(1);}

	}
}
