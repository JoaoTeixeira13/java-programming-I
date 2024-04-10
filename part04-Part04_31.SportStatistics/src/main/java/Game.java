
public class Game {

    private String homeTeam;
    private String visitingTeam;
    private int homeTeamScore;
    private int visitingTeamScore;

    public Game(String homeTeam, String visitingTeam, int homeTeamScore, int visitingTeamScore) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamScore = homeTeamScore;
        this.visitingTeamScore = visitingTeamScore;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getVisitingTeam() {
        return this.visitingTeam;
    }

    public int getHomeTeamScore() {
        return this.homeTeamScore;
    }

    public int getVisitingTeamScore() {
        return this.visitingTeamScore;
    }

}
