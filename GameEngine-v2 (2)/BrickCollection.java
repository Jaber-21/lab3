import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class BrickCollection {
	public static ArrayList<Brick> bricks = new ArrayList<Brick>();
	public static ArrayList<Brick> bin = new ArrayList<Brick>();
	
	public BrickCollection() {
		for (int j = 0; j < 5; j++) {
		for (int i = 0; i < 7; i++) {
			Brick brick = new Brick(55+i*100, 35+j*25, 80, 10);
			bricks.add(brick);
			}
		}

	}
	public static void update(Keyboard keyboard) {
		
		
	}

	public static void draw(Graphics2D graphics) {
		for (Brick brick : bricks)
			brick.draw(graphics);
		
	}
}
