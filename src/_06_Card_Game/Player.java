package _06_Card_Game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Player extends GameObject {
	Player(ArrayList<Card> card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	CardDealer cardDealer = new CardDealer();

	public void update() {
		if (cardDealer.deck.isEmpty() == false) {
			cardDealer.deck.get(1);
		}
	}

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(100, 600, 75, 100);
	}
}
