package card.base;

//You CAN modify the first line
public abstract class Card {
	private String name;
	private String description;

	// default constructor
	public Card() {
	}

	// constructor with input
	public Card(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return this.description;
	}

	public String toString() {
		return null;
	}

}
