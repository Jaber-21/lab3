import java.awt.Color;
import java.awt.Graphics2D;

public class Ball extends Sprite{
	private int xspeed, yspeed;
	private int life;
	public Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		xspeed = 2;
		yspeed = 5;
		life = 3;
		
	}

	@Override
	public void update(Keyboard keyboard) 
{
		if(getX() > 790 || getX() < 0) {
			xspeed = -xspeed;
}
		if(getY()<0) {
			yspeed = -yspeed;
			
		}
		
		setY(getY() + yspeed);
		setX(getX() + xspeed);
		
		
		
		if(getY()>600 && life > 0) {
			life = life -1;
			setY(300);
			cd(0, 1);
		}
			
		else if(life == 0) {
			System.exit(0);
		}
		
	}

	@Override
	public void draw(Graphics2D graphics) {
		graphics.setColor(Color.white);
		graphics.fillOval(getX(), getY(), getWidth(), getHeight());
		
		
	}
	
	public void cd(int z, int g) {
		if(z == 1)
			xspeed = xspeed* -1;
		else if(g == 1)
			yspeed = yspeed* -1;
	}
}
