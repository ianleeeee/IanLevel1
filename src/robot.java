import org.jointheleague.graphical.robot.Robot;

public class robot {
	
	public static void main(String[] args) {
		robot robot = new robot();
		
		
	}

	robot() {
		///Robot hello = new Robot();
		///square(hello);
		Robot billy = new Robot();
		billy.setPenWidth(20);
		billy.penUp();
		billy.setSpeed(10);
		billy.setX(100);
		billy.setY(100);
		billy.penDown();
		billy.turn(180);
		billy.move(750);
		billy.turn(180);
		billy.move(375);
		billy.turn(90);
		billy.move(500);
		billy.turn(-90);
		billy.move(375);
		billy.turn(180);
		billy.move(750);
		billy.turn(180);
		billy.move(375);
		billy.turn(90);
		billy.penUp();
		billy.move(750);
		billy.turn(90);
		billy.penDown();
		billy.move(375);
		billy.turn(90);
		billy.move(254);
		billy.turn(180);
		billy.move(508);
		billy.turn(180);
		billy.move(254);
		billy.turn(90);
		billy.move(750);
		billy.turn(90);
		billy.move(254);
		billy.turn(180);
		billy.move(508);
		
	}
	void square(Robot hi){
		hi.move(100);
		hi.turn(90);
		hi.move(100);
		hi.turn(90);
		hi.move(100);
		hi.turn(90);
		hi.move(100);
		hi.turn(90);
		
	}
}
