package _06_Card_Game;

import java.awt.Graphics;

public class ObjectManager {
	Player player;
	Dealer dealer;;

	ObjectManager(Player player, Dealer dealer) {
		this.player = player;
		this.dealer = dealer;
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
