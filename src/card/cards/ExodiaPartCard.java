package card.cards;

import card.base.ItemCard;
import player.Player;

//You CAN modify the first line
public class ExodiaPartCard extends ItemCard{

	public ExodiaPartCard(String name, int defense) {
		this.description = "Assemble 4 of Exodia part card to win the game";
		this.lpBonus = 0;
		this.attackBonus = 0;
		this.name = name;
		this.defenseBonus = defense;
	}

	public void equipItem(Player player) { 
		player.addInventory(this);
		player.setDefense(player.getDefense()+this.defenseBonus);
		if (player.getAssignedCharacter() instanceof ExodiaCharacterCard) {
			player.setDefense(player.getDefense()+this.defenseBonus);
		}
		
}

}