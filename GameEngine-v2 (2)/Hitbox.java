import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Hitbox extends Rectangle{
	
	public Hitbox(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	
	
	public void update(Keyboard keyboard, int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public void draw(Graphics2D graphics) {
		graphics.setColor(Color.white);
		graphics.drawRect(x, y, width, height);
	}
	
	private boolean Collision(Hitbox hitbox, int x, int y) {
		boolean branch = false;
		
		
		return branch;
	}
	
	
	
}
