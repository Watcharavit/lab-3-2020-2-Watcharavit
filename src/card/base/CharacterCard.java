package card.base;

import player.Player;

//You CAN modify the first line
public abstract class CharacterCard extends Card {
	private String name;
	private String description;
	private int lifePoint;
	private int attackPoint;
	private int defensePoint;

	// default constructor
	public CharacterCard() {
	}

	public CharacterCard(String name, String description, int lifePoint, int attackPoint, int defensePoint) {
		this.name = name;
		this.description = description;
		this.lifePoint = lifePoint;
		this.attackPoint = attackPoint;
		this.defensePoint = defensePoint;
	}

	public void switchCharacter(Player player) {
		/*
		 * Hint: Use setNewCharacterLifePoint(int) , setAttack(int) , setDefense (int) ,
		 * setAssignedCharacter (CharacterCard) from Player class
		 */
		player.setNewCharacterLifePoint(this.lifePoint);
		player.setAttack(attackPoint);
		player.setDefense(defensePoint);
		player.setAssignedCharacter(this);
	}

	public abstract int sacrifice(Player player);

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + " \t [Char][HP : " + this.lifePoint + " ATK : " + this.attackPoint + " DEF : "
				+ this.defensePoint + "]";
	}
}
