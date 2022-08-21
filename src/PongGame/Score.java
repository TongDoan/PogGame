package PongGame;

import java.awt.*;


public class Score extends Rectangle{

	static int GAME_WIDTH;
	static int GAME_HEIGHT;
	int player1;
	int player2;
	int cup1;
	int cup2;
	Score(int GAME_WIDTH, int GAME_HEIGHT){
		Score.GAME_WIDTH = GAME_WIDTH;
		Score.GAME_HEIGHT = GAME_HEIGHT;
	}
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("Consolas",Font.PLAIN,30));
		
		g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
		
		g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (GAME_WIDTH/2)-85, 50);
		g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (GAME_WIDTH/2)+20, 50);
		g.drawString("Cup:"+String.valueOf(cup1%10), (GAME_WIDTH/2)-465, 50);
		g.drawString("Cup:"+String.valueOf(cup2%10), (GAME_WIDTH/2)+380, 50);
		g.drawString(getName.getName2(),(GAME_WIDTH/2)+355, 550);
		g.drawString(getName.getName1(),(GAME_WIDTH/2)-470, 550);
	}
	public int getCup1() {
		return cup1;
	}
	public void setCup1(int cup1) {
		this.cup1 = cup1;
	}
	public int getCup2() {
		return cup2;
	}
	public void setCup2(int cup2) {
		this.cup2 = cup2;
	}
	
}