package uk.org.hexsaw.logactaesque.fixture.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import uk.org.hexsaw.logactaesque.fixture.adapter.FixtureGameAdapter;
import uk.org.hexsaw.logactaesque.fixture.model.Fixture;
import uk.org.hexsaw.logactaesque.fixture.model.FixtureResult;
import uk.org.hexsaw.logactaesque.fixture.model.Game;
import uk.org.hexsaw.logactaesque.fixture.model.GameResult;
import uk.org.hexsaw.logactaesque.fixture.model.GameStatus;
import uk.org.hexsaw.logactaesque.fixture.service.FixtureService;

public class HttpClientFixtureService implements FixtureService {

	private static final Logger log = LoggerFactory.getLogger(HttpClientFixtureService.class);

	@Autowired
	private RestTemplate template;

	@Autowired
	private FixtureGameAdapter adapter;

	@Value("${gameplay.url}")
	private String gamePlayUrl;

	public FixtureResult play(Fixture fixture) {
		GameResult gameResult;
		Game game = adapter.to(fixture);
		try {
			gameResult = template.postForObject(this.gamePlayUrl, game, GameResult.class);
		} catch (RestClientException rex) {
			gameResult = new GameResult(GameStatus.POSTPONED);
		}
		return new FixtureResult(fixture, gameResult.getGameStatus(), gameResult.getHomeGoals(), gameResult.getAwayGoals());
	}

	public void setTemplate(RestTemplate template) {
		this.template = template;
	}

	public void setAdapter(FixtureGameAdapter adapter) {
		this.adapter = adapter;
	}

}
