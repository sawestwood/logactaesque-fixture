package uk.org.hexsaw.logactaesque.fixture.adapter;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import uk.org.hexsaw.logactaesque.fixture.model.Fixture;
import uk.org.hexsaw.logactaesque.fixture.model.Game;
import uk.org.hexsaw.logactaesque.fixture.resolver.SimpleTeamResolver;

public class FixtureGameAdapterTest {
    
    private FixtureGameAdapter adapter = null;
    
    @Before
    public void setUp() {
        adapter = new FixtureGameAdapter();
        adapter.setTeamResolver(new SimpleTeamResolver());
    }

    @Test
    public void thatAdapterReturnsAGameUsingASimpleFixture() {
        assertThat(adapter.to(new Fixture(0,0)), notNullValue());
    }
    
    @Test
    public void thatAdapterReturnsAGameWithResolvedTeams() {
        Game game = adapter.to(new Fixture(1,2));
        assertThat(game.getHomeTeam(), equalTo("Arsenal"));
        assertThat(game.getAwayTeam(), equalTo("WBA"));
    }

}