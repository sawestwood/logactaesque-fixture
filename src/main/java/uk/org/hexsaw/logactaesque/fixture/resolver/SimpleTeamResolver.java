package uk.org.hexsaw.logactaesque.fixture.resolver;

import java.util.HashMap;
import java.util.Map;

import uk.org.hexsaw.logactaesque.fixture.model.Team;

public class SimpleTeamResolver  implements TeamResolver {

    private static Team ARSENAL = new Team(1, "Arsenal");
    private static Team WBA = new Team(2, "WBA");
    private static Team MAN_UTD = new Team(3, "Man Utd");
    private static Team SOUTHAMPTON = new Team(4, "Southampton");
    
    private static Map<Integer, Team> TEAM_MAP = new HashMap<>();

    static {
        TEAM_MAP.put(ARSENAL.getCode(), ARSENAL);
        TEAM_MAP.put(WBA.getCode(), WBA);
        TEAM_MAP.put(MAN_UTD.getCode(), MAN_UTD);
        TEAM_MAP.put(SOUTHAMPTON.getCode(), SOUTHAMPTON);
    };

    @Override
    public Team resolve(int teamCode) {
        return TEAM_MAP.get(teamCode);
    }

}
