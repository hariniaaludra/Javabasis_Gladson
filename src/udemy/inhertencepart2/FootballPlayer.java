package udemy.inhertencepart2;

public class FootballPlayer extends Athelet {
	  private int completions;
	    private int passingYards;

	public FootballPlayer(String name, String nickname, int yearOfBorn, String team, int gamesPlayed,int completions,int passingYards) {
		super(name, nickname, yearOfBorn, team, gamesPlayed);
		this.completions=completions;
		this.passingYards=passingYards;
		
		
	}
	public void getbio() {
		super.getbio();
		System.out.println("completions:" +completions);
		System.out.println("passingYards:" +passingYards);
	}

}
