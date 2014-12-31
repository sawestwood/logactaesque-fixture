package uk.org.hexsaw.logactaesque.fixture.model;

public class Game {
	
	private String homeTeam;
	private String awayTeam;
	private long scheduled;
	
	public Game() {    
	    this.scheduled = System.currentTimeMillis();
	}

    public Game(String homeTeam, String awayTeam) {
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}
	
	public String getHomeTeam() {
		return homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}
    
    public long getScheduled() {
        return scheduled;
    }

    @Override
    public String toString() {
        return "Game [" + homeTeam + " vs " + awayTeam + "]";
    }
	
	
	
	

}
