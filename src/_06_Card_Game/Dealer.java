package _06_Card_Game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Dealer extends GameObject {
	Dealer(ArrayList<Card> card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	public void update() {

	}

	public void draw(Graphics g) {
g.setColor(Color.BLACK);
g.fillRect(100, 100, 75, 100);
	}
}
