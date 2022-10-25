package _06_Card_Game;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Blackjack {
	JFrame frame;
	GamePanel panel;
	JButton button;

	final static int width = 1280;
	final static int height = 720;

	Blackjack() {
		frame = new JFrame();
		panel = new GamePanel();
		button = new JButton();
	}

	public static void main(String[] args) {
		Blackjack blackjack = new Blackjack();
		blackjack.run();
	}

	void run() {
		frame.addKeyListener(panel);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.setResizable(false);
		frame.pack();
		panel.startGame();
		panel.add(button);
		panel.setLayout(null);
		// button.setVisible(false);
		button.setLocation(1100, 600);
	}
}
