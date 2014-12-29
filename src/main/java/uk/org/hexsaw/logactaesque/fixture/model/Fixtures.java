package uk.org.hexsaw.logactaesque.fixture.model;

import java.util.ArrayList;
import java.util.List;

public class Fixtures {
    
    private List<Fixture> fixtureList = new ArrayList<>();

    public Fixtures(List<Fixture> fixtureList) {
        this.fixtureList = fixtureList;
    }
   
    public List<Fixture> getFixtureList() {
        return fixtureList;
    }
    
}
