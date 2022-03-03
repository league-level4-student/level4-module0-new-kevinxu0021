package _06_Card_Game;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements MouseListener, ActionListener {
	Timer timer;

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;

	GamePanel() {
		timer = new Timer(1000 / 60, this);
	}

	void startGame() {
		timer.start();
	}

	void updateMenuState() {

	}

	void updateGameState() {

	}

	void drawMenuState(Graphics g) {

	}

	void drawGameState(Graphics g) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
