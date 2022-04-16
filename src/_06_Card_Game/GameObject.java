package _06_Card_Game;

import java.awt.Graphics;
import java.util.ArrayList;

public class GameObject {

	ArrayList<Card> deck = new ArrayList<Card>();
	ArrayList<Card> playerDeck = new ArrayList<Card>();
	ArrayList<Card> dealerDeck = new ArrayList<Card>();
//	GamePanel panel = new GamePanel();
	CardDealer cardDealer = new CardDealer();

	int state = 0;
	int cardInDeck = 0;

	GameObject() {
		for (int i = 0; i < 4; i++) {
			cardDealer.shuffle();
			deck.addAll(cardDealer.deck);
		}

	}

	public void update() {
		if (state == 0) {
			if (cardInDeck >= 4) {

			} else {
				deck.clear();
				for (int i = cardInDeck; i <= 54 * 4 - 1; i++) {
					deck.add(cardDealer.deck.get(i));
				}
				for (int i = 0; i < 4; i++) {
					cardDealer.shuffle();
					deck.addAll(cardDealer.deck);
				}
			}
		} else if (state == 1) {

		}
	}

	public void draw(Graphics g) {

	}
}
