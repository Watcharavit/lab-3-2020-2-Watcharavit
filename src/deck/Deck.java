package deck;

import java.util.ArrayList;
import java.util.Arrays;

import card.base.Card;

public class Deck {
	// TODO: constructor
	private String name;
	private int deckSize;
	private Card[] deckList;

	public Deck() {

	}

	public Deck(String name, Card[] deckList) {
		this.name = name;
		this.deckSize = deckList.length;
		this.deckList = deckList;
	}

	// You CAN modify the first line
	public int insertCard(Card card) throws InsertCardFailedException {
		int count = 1;
		for (int i = 0; i < this.deckSize; i++) {
			if (card==this.deckList[i]) {
				count++;
			}
		}
		if (count > 4)
			throw new InsertCardFailedException("You can only put 4 of the same cards into the deck");
		else {
			this.deckList = Arrays.copyOf(this.deckList, this.deckSize + 1);
			this.deckList[this.deckSize] = card;
			this.deckSize++;
			return getDeckSize();
		}
		// FILL CODE HERE
		// You can use Arrays.copyOf(Original Array, New Length) to create new arrays
		// with bigger size
		// Must return new deckSize

	}

	// You CAN modify the first line
	public Card removeCard(int slotNumber) throws RemoveCardFailedException {
		if (this.deckSize <= slotNumber||this.deckSize<0) {
			throw new RemoveCardFailedException("Number you insert exceed deck size");
		}
		if (this.deckList[slotNumber] == null) {
			throw new RemoveCardFailedException("There is no card in that slot");
		}
		// FILL CODE HERE
		// You can use Arrays.copyOf(Original Array, New Length) to create new arrays
		// with bigger size
		// Once card is removed, other card down the list must rearrange to the empty
		// slot
		// Must return card that was removed
		Card returnCard = this.deckList[slotNumber - 1];
		Card[] copyArray = Arrays.copyOf(this.deckList, this.deckSize - 1);
		for (int i = 0; i < slotNumber-1; i++) {			
				copyArray[i] = this.deckList[i];
		}
		for (int i = slotNumber; i < this.deckSize-1; i++) {			
			copyArray[i] = this.deckList[i+1];
	}
		this.deckList = copyArray;
		this.deckSize--;
		return returnCard;

	}

	@Override
	public String toString() {
		return new StringBuilder().append("{").append(this.getName()).append("}").append("(").append(this.getDeckSize())
				.append(" deck size)").toString();
	}

	/* GETTERS & SETTERS */
	public String getName() {
		return name;
	}

	public int getDeckSize() {
		return deckSize;
	}

	public Card[] getDeckList() {
		return deckList;
	}

	public void setDeckSize(int deckSize) {
		this.deckSize = deckSize;
	}

}
