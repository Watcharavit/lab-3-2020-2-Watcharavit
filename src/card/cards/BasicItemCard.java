package card.cards;

import player.Player;
import card.base.ItemCard;

//You CAN modify the first line
public class BasicItemCard extends ItemCard {

	public BasicItemCard() {

	}

	public BasicItemCard(String name, String description, int lpBonus, int attackBonus, int defenseBonus) {
		this.name = name;
		this.description = description;
		this.lpBonus = lpBonus;
		this.attackBonus = attackBonus;
		this.defenseBonus = defenseBonus;
	}

	@Override
	public void equipItem(Player player) {
		player.addInventory(this);
		player.setMaxLifePoint(player.getMaxLifePoint()+this.lpBonus);
		player.setCurrentLifePoint(player.getCurrentLifePoint()+this.lpBonus);
		player.setAttack(player.getAttack()+this.attackBonus);
		player.setDefense(player.getDefense()+this.defenseBonus);
	}

}