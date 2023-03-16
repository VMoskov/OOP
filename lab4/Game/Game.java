class Game {

    public static double getAveragePlayerSkill (String nick, HashMap<String, PlayerStats> virtusPro) {
        double sum = 0;
        sum += virtusPro.get(nick).getAccuracy() + virtusPro.get(nick).getUtility() + virtusPro.get(nick).getEntryFragging() + virtusPro.get(nick).getAssist();
        return sum / 4;
    }

    public static double getAverageTeamSkill(HashMap<String, PlayerStats> virtusPro) {
        double sum = 0;
        int count = 0;
        for (String nick: virtusPro.keySet()) {
            ++count;
            sum += getAveragePlayerSkill(nick, virtusPro);
        }
        return sum / count;
    }

    public static String getMatchWinner(HashMap<String, HashMap<String, PlayerStats>> match) {
        double max = 0;
        String winner = "lol";
        for (String team: match.keySet()) {
            if (max == 0) {
                max = getAverageTeamSkill(match.get(team));
                winner = team;
            } else if (getAverageTeamSkill(match.get(team)) > max) {
                max = getAverageTeamSkill(match.get(team));
                winner = team;
            }
        }
        return winner;
    }

    public static void replacePlayer(String player1, String player2, PlayerStats playerStats, HashMap<String, PlayerStats> team) {
        team.remove(player1, team.get(player1));
        team.put(player2, playerStats);
    }
}