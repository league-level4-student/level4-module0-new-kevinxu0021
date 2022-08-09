package _06_Card_Game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Dealer extends GameObject {
	// GamePanel panel = new GamePanel();
	CardDealer cardDealer = new CardDealer();
	Dealer(ArrayList<Card> card) {

		// TODO Auto-generated constructor stub
	}

	ArrayList<Card> currentCards = new ArrayList<Card>();

	public void update() {
currentCards = cardDealer.deck;
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(100, 100, 75, 100);
	}
}
