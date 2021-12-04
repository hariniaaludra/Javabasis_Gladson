package udemy.finalkeyword;

public class Country {
	private final String NAME;
	private int population;
	private String capital;
	public Country(String nAME, int population, String capital) {
		
		this.NAME = nAME;
		this.population = population;
		this.capital = capital;
	}
	
	public final void populationchange(int change) {
		population+=change;
	}
	
	

}
