package uk.org.hexsaw.logactaesque.fixture.model;

public class FixtureResult {
    
    private Fixture fixture;
    
 	private int homeGoals;
    private int awayGoals;
    private GameStatus gameStatus;
    
    public FixtureResult(Fixture fixture, GameStatus gameStatus, int homeGoals, int awayGoals) {
        this.fixture = fixture;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.gameStatus = gameStatus;
    }
  
    public Fixture getFixture() {
        return fixture;
    }
    
    @Override
    public String toString() {
        return "FixtureResult [GameStatus = " + getGameStatus() + " " +  " TeamCode-" + this.fixture.getHomeCode() + " " + 
                        String.valueOf(this.homeGoals) + " vs " + 
                        String.valueOf(this.awayGoals) + " TeamCode-"  + this.fixture.getAwayCode() + "]";
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }
    
    public GameStatus getGameStatus() {
		return gameStatus;
	}
    
    


}
