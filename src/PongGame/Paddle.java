package PongGame;

import java.awt.*;
import java.awt.event.*;

public class Paddle extends Rectangle{
	int id;
	int yVelocity;
	int speed = 10;
	Thread gameThread;
	GamePanel p;
	KeyEvent e;
	Score c;
	GamePanel cp;
	Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
		super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
		this.id=id;
	}
	public void keyexit(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
			Menu frame = new Menu();
			frame.setTitle("Pong Game");
			frame.setVisible(true);
			FrameLogin.frame.setVisible(false);
			GamePanel.gameThread.stop();
			if(getName.getCup1() >0) {
				getDatabase.insert(getName.getName1(), getName.getCup1());
			}
			if(getName.getCup2() >0) {
				getDatabase.insert(getName.getName2(), getName.getCup2());
			}
		}
	}
	public void keystart(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			GamePanel.gameThread.start();
		}		
	}
	public void keyPressed(KeyEvent e) {
		
		switch(id) {
		case 1:
			if(e.getKeyCode()==KeyEvent.VK_W) {
				setYDirection(-speed);
			}
			if(e.getKeyCode()==KeyEvent.VK_S) {
				setYDirection(speed);
			}
			break;
		case 2:
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				setYDirection(-speed);
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				setYDirection(speed);
			}
			break;
		}
	}
	public void keyReleased(KeyEvent e) {
		switch(id) {
		case 1:
			if(e.getKeyCode()==KeyEvent.VK_W) {
				setYDirection(0);
			}
			if(e.getKeyCode()==KeyEvent.VK_S) {
				setYDirection(0);
			}
			break;
		case 2:
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				setYDirection(0);
			}
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				setYDirection(0);
			}
			break;
		}
	}
	public void setYDirection(int yDirection) {
		yVelocity = yDirection;
	}
	public void move() {
		y= y + yVelocity;
	}
	public void draw(Graphics g) {
		if(id==1)
			g.setColor(Color.blue);
		else
			g.setColor(Color.red);
		g.fillRect(x, y, width, height);
	}
	public KeyEvent getE() {
		return e;
	}
	public void setE(KeyEvent e) {
		this.e = e;
	}
}