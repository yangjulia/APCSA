package unit15;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball
{

   //constructors
   public BlinkyBall()
   {
		super();
   }

   public BlinkyBall(int x, int y)
   {

	   super(x, y);


   }

   public BlinkyBall(int x, int y, int wid, int ht)
   {
	   super(x, y, wid, ht);


   }

   public BlinkyBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, xSpd, ySpd);


   }

   public BlinkyBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x, y, wid, ht, xSpd, ySpd);



   }

   public Color randomColor()
   {
   		int r = 0;		//use Math.random()
 		int g = 0;
 		int b = 0;
 		
 		Random ran = new Random();
 		r = (int) Math.floor(Math.random() * 256);
 		g = (int) Math.floor(Math.random() * 256);
 		b = (int) Math.floor(Math.random() * 256);
 		
 		return new Color(r,g,b);
   }

   public void moveAndDraw(Graphics window)
   {
		  draw(window, Color.white);


	      setX(getX() + super.getXSpeed());
	      setY(getY() + super.getYSpeed());
	      
	      
	      

	      draw(window, randomColor());



   }
}