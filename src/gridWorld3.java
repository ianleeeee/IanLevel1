import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridWorld3 {
	public static void main(String[] args) {
		gridWorld3 twip = new gridWorld3();
	}

	gridWorld3() {
		World world = new World();
		world.show();
		///Bug bug = new Bug();
		///Location loc1 = new Location(5,5);
		///world.add((loc1),bug);
		Bug bug2 = new Bug();
		Random random = new Random();
		int ian  = random.nextInt(11);
		int jack = random.nextInt(11);
		Location flo2 = new Location(ian-1,jack);
		Location flo1 = new Location(ian+1,jack);
		Flower flow1 = new Flower();
		Flower flow2 = new Flower();
		bug2.setColor(Color.blue);
		bug2.setDirection(90);
		Location loc2 = new Location(ian,jack);
		world.add((flo2),flow1);
		world.add((flo1),flow2);
		///world.add((loc2), bug2);
		
	}
}
