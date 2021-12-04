package udemy.intermidiate;

public class City {
	private Building[] buildings = new Building[4];
	
	public City() {
		Item[] bankItems= new Item[2];
		bankItems[0] = new Item("Letter opener", 1.5);
		bankItems[1] = new Item("stamp",2.5);
		buildings[0] = new Building("Bank",bankItems);
		
		Item[] mansionItems = new Item[2];
		mansionItems[0] = new Item("Pair of fancy shoes", 25.0);
		mansionItems[1] = new Item("Broken glass",0.1);
		buildings[0] = new Building("mansion",mansionItems );
		
		Item[] supermarketItems  = new Item[2];
		supermarketItems[0] = new Item("A loaf of bread", 2.5);
		supermarketItems[1] = new Item("A bag of tea", 6.5);
		buildings[0] = new Building("Supermarket",supermarketItems);
		
		
		
		
	}
	public Building[] getBuildings() {
        return buildings;
	}

}
