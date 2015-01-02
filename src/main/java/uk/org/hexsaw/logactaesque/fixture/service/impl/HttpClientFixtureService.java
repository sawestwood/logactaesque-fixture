package uk.org.hexsaw.logactaesque.fixture.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import uk.org.hexsaw.logactaesque.fixture.adapter.FixtureGameAdapter;
import uk.org.hexsaw.logactaesque.fixture.model.Fixture;
import uk.org.hexsaw.logactaesque.fixture.model.FixtureResult;
import uk.org.hexsaw.logactaesque.fixture.model.Game;
import uk.org.hexsaw.logactaesque.fixture.model.GameResult;
import uk.org.hexsaw.logactaesque.fixture.service.FixtureService;

public class HttpClientFixtureService implements FixtureService {

    private static final Logger log = LoggerFactory.getLogger(HttpClientFixtureService.class);

    @Autowired
    private RestTemplate template;

    @Autowired
    private FixtureGameAdapter adapter;

    public FixtureResult play(Fixture fixture) {
        Game game = adapter.to(fixture);
        GameResult gameResult = template.postForObject("https://logactaesque-game.cfapps.io/game/play", game, GameResult.class);
        log.info(gameResult.toString());
        return new FixtureResult(fixture, gameResult.getHomeGoals(), gameResult.getAwayGoals());
    }

    public void setTemplate(RestTemplate template) {
        this.template = template;
    }

    public void setAdapter(FixtureGameAdapter adapter) {
        this.adapter = adapter;
    }
    
    

}
