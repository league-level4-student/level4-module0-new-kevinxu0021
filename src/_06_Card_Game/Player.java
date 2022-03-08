package _06_Card_Game;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
	CardDealer cardDealer = new CardDealer();

	public void update() {
		if (cardDealer.deck.isEmpty() == false) {
			cardDealer.deck.get(0);
		}
	}

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(100, 600, 50, 100);
	}
}
