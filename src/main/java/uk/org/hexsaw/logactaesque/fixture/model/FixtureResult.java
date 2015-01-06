package uk.org.hexsaw.logactaesque.fixture.model;

public class FixtureResult {
    
    private Fixture fixture;
    
    private int homeGoals;
    private int awayGoals;
    
    public FixtureResult(Fixture fixture, int homeGoals, int awayGoals) {
        this.fixture = fixture;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }
  
    public Fixture getFixture() {
        return fixture;
    }
    
    @Override
    public String toString() {
        return "FixtureResult [ TeamCode-" + this.fixture.getHomeCode() + " " + 
                        String.valueOf(this.homeGoals) + " vs " + 
                        String.valueOf(this.awayGoals) + " TeamCode-"  + this.fixture.getAwayCode() + "]";
    }

    
    public int getHomeGoals() {
        return homeGoals;
    }

    
    public int getAwayGoals() {
        return awayGoals;
    }
    
    


}
