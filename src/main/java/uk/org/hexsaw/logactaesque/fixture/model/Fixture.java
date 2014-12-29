package uk.org.hexsaw.logactaesque.fixture.model;

public class Fixture {

    private int homeCode;

    private int awayCode;

    public Fixture(int homeCode, int awayCode) {
        this.homeCode = homeCode;
        this.awayCode = awayCode;
    }

    public int getHomeCode() {
        return homeCode;
    }

    public int getAwayCode() {
        return awayCode;
    }

    @Override
    public String toString() {
        return "Fixture [homeCode=" + homeCode + ", awayCode=" + awayCode + "]";
    }
    
    

}
