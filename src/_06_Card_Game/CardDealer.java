package _06_Card_Game;

import java.util.ArrayList;
import java.util.Collections;

public class CardDealer {

	ArrayList<Card> deck = new ArrayList<Card>();

	public void populate() {
		for (int i = 0; i < Rank.values().length; i++) {
			for (int j = 0; j < Suit.values().length; j++) {
				Card card = new Card(Rank.values()[i], Suit.values()[j]);
				deck.add(card);
			}
		}
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

}
