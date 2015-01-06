package uk.org.hexsaw.logactaesque.fixture.model;


public class GameResult {

    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    
    private GameStatus gameStatus = GameStatus.SCHEDULED;
    
    public GameResult() {     
    }

    public GameResult(String homeTeam, int homeGoals, String awayTeam, int awayGoals) {
        this.homeTeam = homeTeam;
        this.homeGoals = homeGoals;
        this.awayTeam = awayTeam;
        this.awayGoals = awayGoals;
        this.gameStatus = GameStatus.PLAYED;
    }

    public GameResult(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}

	public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }
    
    public GameStatus getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(GameStatus gameStatus) {
		this.gameStatus = gameStatus;
	}

	public String toString() {
        return "GameResult [GameStatus = " + gameStatus + " "  + homeTeam + " " + Integer.toString(homeGoals)  + "-"  + Integer.toString(awayGoals) + " " + awayTeam + "]";
    }

}
