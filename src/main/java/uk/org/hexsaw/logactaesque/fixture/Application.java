package uk.org.hexsaw.logactaesque.fixture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import uk.org.hexsaw.logactaesque.fixture.model.Fixture;
import uk.org.hexsaw.logactaesque.fixture.model.FixtureResult;
import uk.org.hexsaw.logactaesque.fixture.model.FixtureSchedule;
import uk.org.hexsaw.logactaesque.fixture.model.Fixtures;
import uk.org.hexsaw.logactaesque.fixture.service.FixtureService;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

    @Autowired
    private FixtureSchedule fixtureSchedule;
    
    @Autowired
    private FixtureService fixtureService;

    private static final Logger logger = LoggerFactory.getLogger(FixtureSchedule.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {
        int roundNo = 1;
        int roundCount = fixtureSchedule.getNumberOfRounds();

        while (roundNo <= roundCount) {
            Fixtures fixtures = fixtureSchedule.getFixturesByRound(roundNo);
            for (Fixture fixture : fixtures.getFixtureList()) {
                FixtureResult fixtureResult = fixtureService.play(fixture);
            }
            roundNo++;
        }

    }
}
