package genericClass;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        FootballPlayer mike = new FootballPlayer("Mike");
        BaseballPlayer ted = new BaseballPlayer("Ted");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");

        Team team1 = new Team("team1");
        team1.addPlayer(joe);
        team1.addPlayer(pat);
        team1.addPlayer(beckham);

        Team team2 = new Team("team2");
        team2.addPlayer(mike);
        team2.addPlayer(ted);
        team2.addPlayer(ronaldo);

        System.out.println(team1.numPlayers());
        System.out.println(team2.numPlayers());

        team2.matchResult(team1, 3, 6);
        team1.matchResult(team2, 3, 6);
        team1.matchResult(team2, 6, 6);
    }
}
