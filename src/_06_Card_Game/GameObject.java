package _06_Card_Game;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;

public class GameObject implements KeyListener, ActionListener {

	ArrayList<Card> deck = new ArrayList<Card>();
	ArrayList<Card> playerDeck = new ArrayList<Card>();
	ArrayList<Card> dealerDeck = new ArrayList<Card>();
	CardDealer cardDealer = new CardDealer();

	int state = 1;
	int cardInDeck = 208;

	GameObject() {
		cardDealer.populate();
		for (int i = 0; i < 4; i++) {
			cardDealer.shuffle();
			deck.addAll(cardDealer.deck);
		}

	}

	public void update() {
		// add cards when deck runs out
		if (cardInDeck == 0) {
			cardDealer.shuffle();
			deck.clear();
			deck.addAll(cardDealer.deck);
		}
		// add 2 cards to player and dealer
		if (state == 1) {
			for (int i = 0; i < 2; i++) {
				dealerDeck.add(deck.get(cardInDeck - 1));
				cardInDeck -= 1;
				playerDeck.add(deck.get(cardInDeck - 1));
				cardInDeck -= 1;
			}
			state = 2;
		}
	}

	public void draw(Graphics g) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

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
