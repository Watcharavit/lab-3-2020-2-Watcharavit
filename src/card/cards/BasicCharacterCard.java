package card.cards;

import player.Player;
import card.base.Card;
import card.base.CharacterCard;

//You CAN modify the first line
public class BasicCharacterCard extends CharacterCard {


	// default constructor
	public BasicCharacterCard() {
	}

	public BasicCharacterCard(String name, String description, int lifePoint, int attackPoint, int defensePoint) {
		this.name = name;
		this.description = description;
		this.lifePoint = lifePoint;
		this.attackPoint = attackPoint;
		this.defensePoint = defensePoint;
	}

	@Override
	public int sacrifice(Player player) {
		player.healPlayer(player.getMaxLifePoint() / 6);
		return player.getMaxLifePoint() / 6;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}