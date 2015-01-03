package uk.org.hexsaw.logactaesque.fixture.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import uk.org.hexsaw.logactaesque.fixture.adapter.FixtureGameAdapter;
import uk.org.hexsaw.logactaesque.fixture.model.Fixture;
import uk.org.hexsaw.logactaesque.fixture.model.FixtureSchedule;
import uk.org.hexsaw.logactaesque.fixture.model.Fixtures;
import uk.org.hexsaw.logactaesque.fixture.resolver.SimpleTeamResolver;
import uk.org.hexsaw.logactaesque.fixture.resolver.TeamResolver;
import uk.org.hexsaw.logactaesque.fixture.service.FixtureService;
import uk.org.hexsaw.logactaesque.fixture.service.impl.HttpClientFixtureService;

@Configuration
@EnableAutoConfiguration
public class FixtureConfiguration {
    
    @Bean 
    public TeamResolver teamResolver() {
        return new SimpleTeamResolver();
    }
    
    @Bean
    public FixtureGameAdapter fixtureGameAdapter() {
        return new FixtureGameAdapter();
    }
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
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
    public Fixtures round3Fixtures() {
        Fixture fixture1 = new Fixture(2,4);
        Fixture fixture2 = new Fixture(3,1);
        return new Fixtures(Arrays.asList(new Fixture[] {fixture1, fixture2} ));       
    }
    
    @Bean
    public Fixtures round4Fixtures() {
        Fixture fixture1 = new Fixture(4,2);
        Fixture fixture2 = new Fixture(1,3);
        return new Fixtures(Arrays.asList(new Fixture[] {fixture1, fixture2} ));       
    }
    
    @Bean
    public Fixtures round5Fixtures() {
        Fixture fixture1 = new Fixture(3,4);
        Fixture fixture2 = new Fixture(2,1);
        return new Fixtures(Arrays.asList(new Fixture[] {fixture1, fixture2} ));       
    }
    
    @Bean
    public Fixtures round6Fixtures() {
        Fixture fixture1 = new Fixture(4,1);
        Fixture fixture2 = new Fixture(3,2);
        return new Fixtures(Arrays.asList(new Fixture[] {fixture1, fixture2} ));       
    }
    
    @Bean
    public FixtureSchedule fixtureSchedule() {
        Map<Integer, Fixtures> fixtureMap = new HashMap<>();
        fixtureMap.put(1, round1Fixtures());
        fixtureMap.put(2, round2Fixtures());
        fixtureMap.put(3, round3Fixtures());
        fixtureMap.put(4, round4Fixtures());
        fixtureMap.put(5, round5Fixtures());
        fixtureMap.put(6, round6Fixtures());
        return new FixtureSchedule(fixtureMap);    
    }
    
    @Bean
    public FixtureService fixtureService() {
        return new HttpClientFixtureService();
    }
}
