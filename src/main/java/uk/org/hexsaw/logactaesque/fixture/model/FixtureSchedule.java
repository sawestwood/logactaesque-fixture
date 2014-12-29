package uk.org.hexsaw.logactaesque.fixture.model;

import java.util.HashMap;
import java.util.Map;

public class FixtureSchedule {

    private Map<Integer, Fixtures> fixtureMap = new HashMap<>();

    public FixtureSchedule(Map<Integer, Fixtures> fixtureMap) {
        this.fixtureMap = fixtureMap;
    }

    public Fixtures getFixturesByRound(int roundNo) {
        return this.fixtureMap.get(roundNo);
    }
    
    public int getNumberOfRounds() {
        return fixtureMap.size();
    }

}
