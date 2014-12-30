package uk.org.hexsaw.logactaesque.fixture.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import uk.org.hexsaw.logactaesque.fixture.model.Fixture;
import uk.org.hexsaw.logactaesque.fixture.model.FixtureSchedule;
import uk.org.hexsaw.logactaesque.fixture.model.Fixtures;
import uk.org.hexsaw.logactaesque.fixture.service.FixtureService;
import uk.org.hexsaw.logactaesque.fixture.service.impl.HttpClientFixtureService;

@Configuration
@EnableAutoConfiguration
public class FixtureConfiguration {
    
    @Bean 
    public FixtureService fixtureService() {
        return new HttpClientFixtureService();
    }
    
    @Bean
    public Fixtures round1Fixtures() {
        Fixture fixture1 = new Fixture(1,4);
        Fixture fixture2 = new Fixture(2,3);
        return new Fixtures(Arrays.asList(new Fixture[] {fixture1, fixture2} ));       
    }

    @Bean
    public Fixtures round2Fixtures() {
        Fixture fixture1 = new Fixture(4,3);
        Fixture fixture2 = new Fixture(1,2);
        return new Fixtures(Arrays.asList(new Fixture[] {fixture1, fixture2} ));       
    }
    
    @Bean
    public FixtureSchedule fixtureSchedule() {
        Map<Integer, Fixtures> fixtureMap = new HashMap<>();
        fixtureMap.put(1, round1Fixtures());
        fixtureMap.put(2, round2Fixtures());
        return new FixtureSchedule(fixtureMap);    }
}
