package uk.org.hexsaw.logactaesque.fixture.service;

import uk.org.hexsaw.logactaesque.fixture.model.Fixture;
import uk.org.hexsaw.logactaesque.fixture.model.FixtureResult;


public interface FixtureService {
    
    public  FixtureResult play(Fixture fixture);

}
