package udemy.inhertencepart2;

public class AtheletApp {
	public static void main(String[] args) {
		BasketballPlayer kobe = new BasketballPlayer("Kobe Bryant", "Black Mamba", 1978, "Lakers", 83.7, 25.0, 1346);
		BasketballPlayer jordan = new BasketballPlayer("Michael Jordan", "MJ", 1963, "Chicago Bulls", 83.5, 30.1, 1072);
		BasketballPlayer magic = new BasketballPlayer("Earvin Johnson", "Magic", 1959, "Lakers", 84.8, 19.5, 906);
		
		BasketballPlayer[] basketballplayer=new BasketballPlayer[3];
		basketballplayer[0]=kobe;
		basketballplayer[1]=jordan;
		basketballplayer[2]=magic;
		
		for(BasketballPlayer basketballplayers:basketballplayer) {
			System.out.println("------------------------------");
			basketballplayers.getbio();
		}
		FootballPlayer tom = new FootballPlayer("Tom Brady", "Tom Terrific", 1977, "Tampa Bay", 285, 9988, 6377);
		FootballPlayer ed  = new FootballPlayer("Ed Brady", "Ed Terrific", 1979, "New England Patriots", 265, 8988, 4377);
		
		 FootballPlayer[] footballPlayers = new FootballPlayer[2];
	        footballPlayers[0] = tom;
	        footballPlayers[1] = ed;

	        for (FootballPlayer footballPlayer : footballPlayers) {
	            System.out.println("-------------------------------------");
	            footballPlayer.getbio();
	        }
	    }
	}
	

    


