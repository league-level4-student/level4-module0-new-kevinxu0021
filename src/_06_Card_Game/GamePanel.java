package _06_Card_Game;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	int currentState = MENU_STATE;
	int cardInDeck = 0;
	CardDealer cardDealer = new CardDealer();
	Player player = new Player(cardDealer.deck);
	Dealer dealer = new Dealer(cardDealer.deck);
	ObjectManager objectManager = new ObjectManager(player, dealer);
	GameObject gameObject = new GameObject();
	JButton button = new JButton();

	GamePanel() {
		// timer = new Timer(1000 / 60, this);
	}

	void startGame() {
		// timer.start();
	}

	void updateMenuState() {
		if (cardInDeck >= 54 * 4 - 1) {
			cardDealer.deck.clear();
			cardDealer.populate();
			cardDealer.shuffle();

		}
		objectManager.update();
	}

	void updateGameState() {
		gameObject.update();
	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, Blackjack.width, Blackjack.height);
	}

	void drawGameState(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, Blackjack.width, Blackjack.height);
		objectManager.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("performed");
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		}
	}

	public void paintComponent(Graphics g) {
		System.out.println(currentState);
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (gameObject.state == 2) {
			if (e.getKeyCode() == e.VK_ENTER) {
				gameObject.playerDeck.add(gameObject.deck.get(gameObject.cardInDeck - 1));
				gameObject.cardInDeck -= 1;
				System.out.println(gameObject.playerDeck);
			} else if (e.getKeyCode() == e.VK_SPACE) {
				gameObject.state = 3;
			} else if (e.getKeyCode() == e.VK_D) {
				gameObject.playerDeck.add(gameObject.deck.get(gameObject.cardInDeck - 1));
				gameObject.cardInDeck -= 1;
				gameObject.state = 4;
			}
		}

		if (e.getKeyCode() == e.VK_ENTER) {
			if (currentState == MENU_STATE) {
				currentState = GAME_STATE;

			}
			repaint();
			if (currentState == MENU_STATE) {
				updateMenuState();
			} else if (currentState == GAME_STATE) {
				updateGameState();
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
