package uk.org.hexsaw.logactaesque.fixture.adapter;

import org.springframework.beans.factory.annotation.Autowired;

import uk.org.hexsaw.logactaesque.fixture.model.Fixture;
import uk.org.hexsaw.logactaesque.fixture.model.Game;
import uk.org.hexsaw.logactaesque.fixture.model.Team;
import uk.org.hexsaw.logactaesque.fixture.resolver.TeamResolver;


public class FixtureGameAdapter implements Adapter<Fixture, Game> {
    
    @Autowired(required=true)
    private TeamResolver teamResolver; 

    @Override
    public Game to(Fixture f) {
        Team homeTeam = teamResolver.resolve(f.getHomeCode());
        Team awayTeam = teamResolver.resolve(f.getAwayCode());
        return new Game(homeTeam ==  null ? null : homeTeam.getName(), 
                        awayTeam ==  null ? null : awayTeam.getName());
    }
  
    public void setTeamResolver(TeamResolver teamResolver) {
        this.teamResolver = teamResolver;
    }
    
    

}
