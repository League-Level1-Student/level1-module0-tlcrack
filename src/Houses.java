import java.awt.Color;
import java.security.SecurityPermission;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r = new Robot();
	static Random t = new Random();
public static void main(String[] args) {

	r.setX(100);
	r.setY(500);
r.penDown();
r.setSpeed(10);
r.setPenWidth(5);
r.miniaturize();
for (int i = 0; i < 9; i++) {
r.setRandomPenColor();
	int height = t.nextInt(3);
if(height==0) {
drawhouse("small");}
if(height==1) {
drawhouse("medium");}
if(height==2) {
drawhouse("large");}




}
}

static void drawhouse(String size) {
	int height = 0;
	if(size.equals("small")) {
	height = 60;
	}
	else if(size.equals("medium")) {
		height = 120;
		}
	else if(size.equals("large")) {
		height = 250;
		}
	r.move(height);
	if(size.equals("small")||size.equals("medium")) {
		drawPointyRoof();
	}
	else {
		drawFlatRoof();
	}
	r.move(height);
	r.turn(-90);
	r.move(20);
	r.turn(-90);
}
static void drawPointyRoof(){
	r.turn(45);
	r.move(30);	
	r.turn(90);
	r.move(30);
	r.turn(45);
}
static void drawFlatRoof() {
	r.turn(90);
	r.move(50);
	r.turn(90);
}
}
