
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList<Game> games = readRecordsFromFile(file);

        System.out.println("Team:");
        String team = scan.nextLine();

        int gamesTeamPlayed = 0;
        int wins = 0;
        int losses = 0;

        for (Game game : games) {
            boolean winAtHome = team.equals(game.getHomeTeam())
                    && game.getHomeTeamScore() > game.getVisitingTeamScore();
            boolean winWhileVisiting = team.equals(game.getVisitingTeam())
                    && game.getVisitingTeamScore() > game.getHomeTeamScore();

            if (team.equals(game.getHomeTeam()) || team.equals(game.getVisitingTeam())) {

                gamesTeamPlayed++;

                if (winAtHome || winWhileVisiting) {
                    wins++;
                } else {
                    losses++;
                }
            }

        }
        System.out.println("Games: " + gamesTeamPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

    public static ArrayList<Game> readRecordsFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamScore = Integer.valueOf(parts[2]);
                int visitingTeamScore = Integer.valueOf(parts[3]);

                games.add(new Game(homeTeam, visitingTeam, homeTeamScore, visitingTeamScore));
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        return games;
    }

}
