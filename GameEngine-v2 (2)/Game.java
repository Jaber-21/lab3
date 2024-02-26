import java.awt.Color;
import java.awt.Graphics2D;
import java.util.*;

public class Game {
	private Ball ball;
	public static Pad pad;
	private BrickCollection bricks;
	public Game(GameBoard board) {
		ball = new Ball(300, 300, 10, 10);
		bricks = new BrickCollection();
		pad = new Pad(300, 550, 120, 15, Color.cyan);
	}

	public void update(Keyboard keyboard) {
		ball.update(keyboard);
		bricks.update(keyboard);
		pad.update(keyboard);
		ballpad();
		ballbrick();
	}

	public void draw(Graphics2D graphics) {
		ball.draw(graphics);
		bricks.draw(graphics);
		pad.draw(graphics);
	}
	
	public void ballpad()
	{
		int padUpper, padLower, padLeft, padRight;
		
		padLeft = pad.getX();
		padUpper = pad.getY();
		padRight = pad.getWidth() + padLeft;
		padLower = pad.getHeight() + padUpper;
		
		int ballLeft, ballUpper, ballRight, ballLower;
		ballLeft = ball.getX();
		ballUpper = ball.getY();
		ballLower = ball.getHeight() + ballUpper;
		ballRight = ball.getWidth() + ballLeft;
		
		
		if(padLeft <= ballRight && ballLeft <= padRight && ballLower == padUpper) {
			ball.cd(0, 1);
		}
		
	}
	
	
	public void ballbrick()
	{
		int ballLeft, ballUpper, ballRight, ballLower;
		ballLeft = ball.getX();
		ballUpper = ball.getY();
		ballLower = ball.getHeight() + ballUpper;
		ballRight = ball.getWidth() + ballLeft;
		
		for (int i=0; i< bricks.bricks.size(); i++) {
			int brickUpper, brickLower, brickLeft, brickRight;
			
			brickLeft = bricks.bricks.get(i).getX();
			brickUpper = bricks.bricks.get(i).getY();
			brickRight = bricks.bricks.get(i).getWidth() + brickLeft;
			brickLower = bricks.bricks.get(i).getHeight() + brickUpper;
			
			if(brickLeft <= ballRight && ballLeft <= brickRight && (ballUpper == brickLower || ballLower == brickUpper)) {
				ball.cd(0, 1);
				bricks.bricks.remove(i);
			}
			if(ballUpper <= brickLower && ballUpper >= brickUpper && (ballRight == brickLeft || ballLeft == brickRight))
			{
				ball.cd(1, 0);
			}
				}
			}
}
