package card.cards;

import card.base.CharacterCard;
import card.base.ItemCard;
import player.Player;

//You CAN modify the first line
public class ExodiaCharacterCard extends CharacterCard {

	public ExodiaCharacterCard() {
		this.name = "Exodia the Forbidden One";
		this.description = "With 4 or more Exodia Part Card equiped, you win the game";
		this.lifePoint = 800;
		this.attackPoint = 0;
		this.defensePoint = 25;

	}

	// Fill Code Here

	public boolean winConditionCheck(ItemCard[] inventory) {
		int count = 0;
		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] instanceof ExodiaPartCard) {
				count++;
			}
		}
		return count == 4;
	}

	@Override
	public int sacrifice(Player player) {
		// TODO Auto-generated method stub
		player.healPlayer(player.getMaxLifePoint() / 10);
		return player.getMaxLifePoint() / 10;
	}
}