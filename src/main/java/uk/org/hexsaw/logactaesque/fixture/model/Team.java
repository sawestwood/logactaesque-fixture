package uk.org.hexsaw.logactaesque.fixture.model;


public class Team {
    
    private int code;
    private String name;
    
    public Team(int code, String name) {
        this.code = code;
        this.name = name;
    }

    
    public int getCode() {
        return code;
    }

    
    public String getName() {
        return name;
    }
    

}
