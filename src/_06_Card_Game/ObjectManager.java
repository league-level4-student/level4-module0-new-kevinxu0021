package _06_Card_Game;

import java.awt.Graphics;

public class ObjectManager {
	Player player;
	Dealer dealer = new Dealer();

	ObjectManager(Player player) {
		this.player = player;
	}

	void update() {
		player.update();
		dealer.update();
	}

	void draw(Graphics g) {
		player.draw(g);
		dealer.draw(g);
	}
}
