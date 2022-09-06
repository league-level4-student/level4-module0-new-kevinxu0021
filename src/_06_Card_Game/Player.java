package _06_Card_Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Player extends GameObject implements ActionListener, KeyListener{
	Player(ArrayList<Card> card) {

		// TODO Auto-generated constructor stub
	}

	ArrayList<Card> currentCards = new ArrayList<Card>();

	public void update() {

	}
	
	public void pullCard() {
		
	}

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(100, 600, 75, 100);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == 32) {
			
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
