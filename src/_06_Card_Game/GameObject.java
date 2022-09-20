package _06_Card_Game;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class GameObject implements KeyListener, ActionListener {

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
		System.out.println("update" + state);
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
			for(int i = 0; i < deck.size();i++) {
				System.out.println(deck.get(i));
			}
			state = 1;
		} else if (state == 1) {
			for (int i = 0; i < 2; i++) {
				dealerDeck.add(deck.get(0));
				dealerDeck.remove(0);
			}
			System.out.println(dealerDeck.get(1));
		} else {

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
