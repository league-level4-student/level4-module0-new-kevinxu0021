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
	int cardInDeck;
	int total = 0;
	int points = 1;
	int playerTotal = 0;
	int suit = 1;
	int cardIndex = 01;

	/*
	 * states 1 = adding cards 2 = playing state 3 = stay 4 = double down
	 */

	GameObject() {
		cardDealer.populate();
		for (int i = 0; i < 4; i++) {
			cardDealer.shuffle();
			deck.addAll(cardDealer.deck);
		}
		cardInDeck = deck.size();
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

		for (int i = 0; i < playerDeck.size(); i++) {
			playerTotal += playerDeck.get(i).getRank().getValue();
		}

		if (state == 2) {
			if (playerTotal == 21) {
				System.out.println("Blackjack");
			} else if (playerTotal > 21) {
				System.out.println("Bust");
			}
		}
		if (state == 3 || state == 4) {

			for (int i = 0; i < dealerDeck.size(); i++) {
				total += dealerDeck.get(i).getRank().getValue();
				System.out.println(dealerDeck.get(i).getRank().getValue() + "" + dealerDeck.get(i));
			}
			dealer();
		}
	}

	public void dealer() {

		if (total < 17) {
			dealerDeck.add(deck.get(cardInDeck - 1));
			cardInDeck -= 1;
			total += dealerDeck.get(dealerDeck.size() - 1).getRank().getValue();
			update();
		} else if (total > 21) {
			points *= 2;
		}
	}

	public void draw(Graphics g) {

		if (playerDeck.get(1).getSuit().equals("Spades")) {
			suit = 4;
		} else if (playerDeck.get(1).getSuit().equals("Clubs")) {
			suit = 1;
		} else if (playerDeck.get(1).getSuit().equals("Hearts")) {
			suit = 3;
		} else {
			suit = 2;
		}
		switch (playerDeck.get(1).getRank()) {
		case Ten:

		}
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
