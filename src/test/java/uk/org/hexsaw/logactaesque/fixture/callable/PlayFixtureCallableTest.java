package uk.org.hexsaw.logactaesque.fixture.callable;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import uk.org.hexsaw.logactaesque.fixture.model.Fixture;
import uk.org.hexsaw.logactaesque.fixture.model.FixtureResult;
import uk.org.hexsaw.logactaesque.fixture.service.FixtureService;
import uk.org.hexsaw.logactaesque.fixture.service.impl.DoNothingFixtureService;

public class PlayFixtureCallableTest {

	private static final int HOME_CODE = 1;
	private static final int AWAY_CODE = 2;

	private Fixture fixture = new Fixture(HOME_CODE, AWAY_CODE);
	private FixtureService fixtureService = new DoNothingFixtureService();

	@Test
	public void canCreateTheCallable() {
		assertThat(new PlayFixtureCallable(fixtureService, fixture), notNullValue());
	}

	@Test(expected = NullPointerException.class)
	public void whenCreatingCallableWithNullFixtureServiceGetAnException() {
		new PlayFixtureCallable(null, null);
	}

	@Test(expected = NullPointerException.class)
	public void whenCreatingCallableWithNullFixtureGetAnException() {
		new PlayFixtureCallable(fixtureService, null);
	}

	@Test
	public void whenPlayAFixtureGetAResultForSuppliedFixture() throws Exception {
		FixtureResult result = new PlayFixtureCallable(fixtureService, fixture).call();
		assertThat(result, notNullValue());
		assertThat(result.getFixture(), equalTo(fixture));
	}

}
