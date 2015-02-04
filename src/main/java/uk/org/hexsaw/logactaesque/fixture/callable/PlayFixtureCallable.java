package uk.org.hexsaw.logactaesque.fixture.callable;

import java.util.concurrent.Callable;

import org.apache.commons.lang3.Validate;

import uk.org.hexsaw.logactaesque.fixture.model.Fixture;
import uk.org.hexsaw.logactaesque.fixture.model.FixtureResult;
import uk.org.hexsaw.logactaesque.fixture.service.FixtureService;

public class PlayFixtureCallable implements Callable<FixtureResult> {
	
	private Fixture fixture;
	private FixtureService fixtureService;

	public PlayFixtureCallable(FixtureService fixtureService, Fixture fixture) {
		Validate.notNull(fixture);
		Validate.notNull(fixtureService);
		this.fixture = fixture;
		this.fixtureService = fixtureService;
	}

	@Override
	public FixtureResult call() throws Exception {
		return fixtureService.play(fixture);
	}

}
