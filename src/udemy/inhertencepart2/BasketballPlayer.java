package udemy.inhertencepart2;

import java.util.Random;

public class BasketballPlayer extends Athelet {
	private double freeThrowPercentage;
    private double pointsPerGame;
    
    public BasketballPlayer(String name, String nickname, int yearOfBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
		super(name, nickname, yearOfBorn, team, gamesPlayed);
		this.freeThrowPercentage = freeThrowPercentage;
		this.pointsPerGame = pointsPerGame;
	}
    public void freethrow() {
        Random randomNumberGenerator = new Random();
    	if((randomNumberGenerator.nextDouble()*100)>freeThrowPercentage) {
    		System.out.println(super.getName() + " failed to score free throw.");
    		
    	}
    	else {
    		System.out.println(super.getName() + " scored free throw.");
    	}
    }
    public void getbio() {
    	super.getbio();
    	System.out.println("free throw percentage:"+freeThrowPercentage);
    	System.out.println("points per game:"+pointsPerGame);
    	
    }

}
