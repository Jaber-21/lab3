import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Brick extends Sprite{
	
	public Brick(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void update(Keyboard keyboard) {
		
		
	}

	@Override
	public void draw(Graphics2D graphics) {
		graphics.setStroke(new BasicStroke(6));
		graphics.setColor(Color.green);
		graphics.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}
}
