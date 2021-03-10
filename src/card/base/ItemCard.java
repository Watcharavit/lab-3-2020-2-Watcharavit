package card.base;

import player.Player;

//You CAN modify the first line
public abstract class ItemCard extends Card {
	protected String name;
	protected String description;
	protected int lpBonus;
	protected int attackBonus;
	protected int defenseBonus;

	// default constructor
	public ItemCard() {
	}

	public ItemCard(String name, String description, int lpBonus, int attackBonus, int defenseBonus) {
		this.name = name;
		this.description = description;
		this.lpBonus = lpBonus;
		this.attackBonus = attackBonus;
		this.defenseBonus = defenseBonus;
	}
	public abstract void equipItem(Player player);
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + " \t [Item][HP : " + this.lpBonus + " ATK : " + this.attackBonus + " DEF : "
				+ this.defenseBonus + "]";
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getLpBonus() {
		return lpBonus;
	}

	public int getAttackBonus() {
		return attackBonus;
	}

	public int getDefenseBonus() {
		return defenseBonus;
	}
	
}
