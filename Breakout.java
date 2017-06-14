/*
 * File: Breakout.java
 * -------------------
 * Name:
 * Section Leader:
 * 
 * This file will eventually implement the game of Breakout.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Breakout extends GraphicsProgram {

/** Width and height of application window in pixels */
	public static final int APPLICATION_WIDTH = 400;
	public static final int APPLICATION_HEIGHT = 600;

/** Dimensions of game board (usually the same) */
	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

/** Dimensions of the paddle */
	private static final int PADDLE_WIDTH = 60;
	private static final int PADDLE_HEIGHT = 10;

/** Offset of the paddle up from the bottom */
	private static final int PADDLE_Y_OFFSET = 30;

/** Number of bricks per row */
	private static final int NBRICKS_PER_ROW = 10;

/** Number of rows of bricks */
	private static final int NBRICK_ROWS = 10;

/** Separation between bricks */
	private static final int BRICK_SEP = 4;

/** Width of a brick */
	private static final int BRICK_WIDTH =
	  (WIDTH - (NBRICKS_PER_ROW - 1) * BRICK_SEP) / NBRICKS_PER_ROW;

/** Height of a brick */
	private static final int BRICK_HEIGHT = 8;

/** Radius of the ball in pixels */
	private static final int BALL_RADIUS = 10;

/** Offset of the top brick row from the top */
	private static final int BRICK_Y_OFFSET = 70;

/** Number of turns */
	private static final int NTURNS = 3;

/* Method: run() */
/** Runs the Breakout program. */
	public void run() {
		/*@SuppressWarnings("serial") class AffineTransformDemo extends JPanel {
		   // Named-constants for dimensions
		   public static final int CANVAS_WIDTH = WIDTH;
		   public static final int CANVAS_HEIGHT = HEIGHT;
		   public static final String TITLE = "Affine Transform Demo";*/
		 
		  		 
		   /** Constructor to set up the GUI components **/
		   
	//	}
	AffineTransformDemo();
	drawBricks();
	drawPaddle();
	drawOval();
	}
	private void AffineTransformDemo() {
	      setPreferredSize(new Dimension(WIDTH, HEIGHT));
	      
	   }
	//Draw paddle
	private void drawPaddle(){
	GRect paddle = new GRect((WIDTH/2)- 30, HEIGHT - PADDLE_Y_OFFSET, PADDLE_WIDTH, PADDLE_HEIGHT);
	//add(myRect(), x, y);//X,Y
	add (paddle);
	paddle.setFilled(true);
	paddle.setColor(Color.BLACK);
		}
	
	//Draw ball
	private void drawOval(){
		GOval ball = new GOval((WIDTH/2), (HEIGHT - (PADDLE_Y_OFFSET + PADDLE_HEIGHT + 2)), BALL_RADIUS , BALL_RADIUS);
		//add(myRect(), x, y);//X,Y
		add (ball);
		ball.setFilled(true);
		ball.setColor(Color.BLACK);
			}
	

//Mouse actions

//Draw coloured bricks
		private void drawBricks(){
//		int x = BRICK_SEP;
		int y = BRICK_Y_OFFSET;
//		int brickCount = 0;
		int rowCount = 0;
		
		while  ( y < (BRICK_Y_OFFSET + 10 *(BRICK_HEIGHT + BRICK_SEP))) {
			int brickCount = 0;
			int x = BRICK_SEP;
			while (brickCount < 10){
				//myRect().setColor(Color.RED);
				//myRect().setFillColor(Color.RED) ;
				GRect brick = new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT);
				//add(myRect(), x, y);//X,Y
				add (brick);
				brick.setFilled(true);
				if (rowCount < 2 )
					{brick.setColor(Color.RED);
					}
				if (rowCount == 2 ||rowCount == 3  )
				{brick.setColor(Color.ORANGE);
				}
				if (rowCount == 4 ||rowCount == 5  )
				{brick.setColor(Color.YELLOW);
				}
				if (rowCount == 6 ||rowCount == 7  )
				{brick.setColor(Color.GREEN);
				}
				if (rowCount == 8 ||rowCount == 9  )
				{brick.setColor(Color.CYAN);
				}
				x = x + BRICK_WIDTH + BRICK_SEP;
				brickCount++;
				}
			rowCount++;
			y = (BRICK_Y_OFFSET + rowCount *(BRICK_HEIGHT + BRICK_SEP));
		}
	}
//	 private RandomGenerator rgen = RandomGenerator.getInstance();
//	 double vx = rgen.nextDouble(1.0, 3.0); 
//	 if (rgen.nextBoolean(0.5)) vx = -vx;
	 
/*	private  GRect myRect(){
	GRect rect = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
	rect.setFilled(true);
	return rect;
	} */
}
