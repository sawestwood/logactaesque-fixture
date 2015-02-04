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

	@Override
	public int hashCode() {
		final int prime = 1499;
		int result = 1;
		result = prime * result + awayGoals;
		result = prime * result + ((fixture == null) ? 0 : fixture.hashCode());
		result = prime * result + ((gameStatus == null) ? 0 : gameStatus.hashCode());
		result = prime * result + homeGoals;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FixtureResult other = (FixtureResult) obj;
		if (awayGoals != other.awayGoals)
			return false;
		if (fixture == null) {
			if (other.fixture != null)
				return false;
		} else if (!fixture.equals(other.fixture))
			return false;
		if (gameStatus != other.gameStatus)
			return false;
		if (homeGoals != other.homeGoals)
			return false;
		return true;
	}
    
    
    
    


}
