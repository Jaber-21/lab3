import java.awt.Color;
import java.awt.Graphics2D;

public class Pad extends Sprite{
	public Color color;
	private int velocity = 10;
	public Pad(int x, int y, int width, int height, Color color) {
		super(x, y, width, height);
		this.color = color;
		
	}
	@Override
	public void update(Keyboard keyboard) {
		if (keyboard.isKeyDown(Key.Right) && getX() < 680) {
			setX(getX()+ velocity);
		}
		if (keyboard.isKeyDown(Key.Left) && getX() > 0 ) {
			setX(getX()- velocity);
		}
		
		
	}
	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(Color.cyan);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
		
		
		
	}
	
}
