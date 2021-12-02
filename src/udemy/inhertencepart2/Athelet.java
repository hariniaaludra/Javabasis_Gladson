package udemy.inhertencepart2;

public class Athelet {
	private String name;
    private String nickname;
    private int yearOfBorn;
    private String team;
    private int gamesPlayed;
    
	public Athelet(String name, String nickname, int yearOfBorn, String team, int gamesPlayed) {
		this.name = name;
		this.nickname = nickname;
		this.yearOfBorn = yearOfBorn;
		this.team = team;
		this.gamesPlayed = gamesPlayed;
	}
	public void getbio() {
		System.out.println(name+" ("+nickname+")");
		System.out.println("Born in:" +yearOfBorn);
		System.out.println("Last team is" +team+" and played" +gamesPlayed+ "games");
		
		
	}
	public String getName() {
		
		return name;
	}
    
    

}
