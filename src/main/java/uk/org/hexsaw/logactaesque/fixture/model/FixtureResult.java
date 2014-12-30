package uk.org.hexsaw.logactaesque.fixture.model;

public class FixtureResult {
    
    private Fixture fixture;
    
    public FixtureResult(Fixture fixture) {
        this.fixture = fixture;
    }
  
    public Fixture getFixture() {
        return fixture;
    }
    
    @Override
    public String toString() {
        return "FixtureResult [homeCode=" + this.fixture.getHomeCode() + ", awayCode=" + this.fixture.getAwayCode() + "]";
    }


}
