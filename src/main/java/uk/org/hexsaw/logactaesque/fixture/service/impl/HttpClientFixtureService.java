package uk.org.hexsaw.logactaesque.fixture.service.impl;

import uk.org.hexsaw.logactaesque.fixture.model.Fixture;
import uk.org.hexsaw.logactaesque.fixture.model.FixtureResult;
import uk.org.hexsaw.logactaesque.fixture.service.FixtureService;

public class HttpClientFixtureService implements FixtureService {

    public FixtureResult play(Fixture fixture) {
        return new FixtureResult(fixture);
    }

}
