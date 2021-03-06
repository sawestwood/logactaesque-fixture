package uk.org.hexsaw.logactaesque.fixture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import uk.org.hexsaw.logactaesque.fixture.callable.PlayFixtureCallable;
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
    	ExecutorService executorService;
        int roundNo = 1;
        int roundCount = fixtureSchedule.getNumberOfRounds();

        while (roundNo <= roundCount) {
        	
            Fixtures fixtures = fixtureSchedule.getFixturesByRound(roundNo);
            
            executorService = Executors.newFixedThreadPool(fixtures.getFixtureList().size());
            
            for (Fixture fixture : fixtures.getFixtureList()) {           	
				Future<FixtureResult> future = executorService.submit(new PlayFixtureCallable(fixtureService, fixture));
				logger.info(future.get().toString());
//						
//						
//						() -> {
//					FixtureResult fixtureResult = fixtureService.play(fixture);
//					logger.info(fixtureResult.toString());
//				    return fixtureResult;
//				});

            }
            roundNo++;
            executorService.shutdown();
        }
    }
}
