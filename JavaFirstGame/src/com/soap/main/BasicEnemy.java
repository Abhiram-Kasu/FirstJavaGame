package com.soap.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;


public class BasicEnemy extends GameObject{

	public BasicEnemy(int x, int y, ID id) {
		super(x, y, id);
		
//		velX = 5;
		velY = 5;
		
	}

	
	public void tick() {
		
//		x+=velX;
		y+=velY;
		
		//I have no clue as to why I had to subtract 55 form my Game Height to amke it work unlike in the tutorial
		if(y <=0 || y >= Game.HEIGHT-55) velY*=-1;
//		if(x <=0 || x >= Game.WIDTH-32) velX*=-1;
	}

	
	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 16, 16);
		
	}
	
public Rectangle getBounds() {
		
		
		return new Rectangle(x,y,16,16);
	}

}
