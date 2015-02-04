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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + awayCode;
		result = prime * result + homeCode;
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
		Fixture other = (Fixture) obj;
		if (awayCode != other.awayCode)
			return false;
		if (homeCode != other.homeCode)
			return false;
		return true;
	}
    
    
    
    

}
