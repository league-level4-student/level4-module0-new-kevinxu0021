package _06_Card_Game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Player extends GameObject {
	Player(ArrayList<Card> card) {

		// TODO Auto-generated constructor stub
	}

	ArrayList<Card> currentCards = new ArrayList<Card>();

	public void update() {

	}

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(100, 600, 75, 100);
	}
}
