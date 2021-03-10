package card.cards;

import card.base.CharacterCard;
import player.Player;

//You CAN modify the first line
public class MainCharacterCard extends CharacterCard {
	protected float levelUpBonus;
	protected int level;

	public MainCharacterCard() {

	}

	public MainCharacterCard(String name, String description, int lifePoint, int attackPoint, int defensePoint,
			float levelUpBonus) {
		this.name = name;
		this.description = description;
		this.lifePoint = lifePoint;
		this.attackPoint = attackPoint;
		this.defensePoint = defensePoint;
		this.levelUpBonus = levelUpBonus;
		this.level = 0;
	}

	public float levelUp(Player player) {
		this.level++;
		player.setNewCharacterLifePoint((int) (player.getMaxLifePoint()*(1+this.levelUpBonus)));
		player.setAttack((int) (player.getAttack()*(1+this.levelUpBonus)));
		player.setDefense((int) (player.getDefense()*(1+this.levelUpBonus)));
		return this.levelUpBonus;
	};

	@Override
	public String getName() {
		return super.getName() + " [level " + this.getLevel() + "]";
	}

	@Override
	public int sacrifice(Player player) {
		// TODO Auto-generated method stub
		player.healPlayer(player.getMaxLifePoint() / 8);
		return player.getMaxLifePoint() / 8;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
