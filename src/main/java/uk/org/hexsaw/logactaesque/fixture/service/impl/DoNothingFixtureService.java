package uk.org.hexsaw.logactaesque.fixture.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.org.hexsaw.logactaesque.fixture.model.Fixture;
import uk.org.hexsaw.logactaesque.fixture.model.FixtureResult;
import uk.org.hexsaw.logactaesque.fixture.model.GameStatus;
import uk.org.hexsaw.logactaesque.fixture.service.FixtureService;

public class DoNothingFixtureService implements FixtureService {

	private static final Logger log = LoggerFactory.getLogger(DoNothingFixtureService.class);

	public FixtureResult play(Fixture fixture) {
		return new FixtureResult(fixture, GameStatus.PLAYED, 2, 3);
	}
}
