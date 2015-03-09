package trunk.Java;

public class Core {
	private Fantasy fantasy;
	private Scheduler schedule;
	
	public Core() {
		System.out.println("inn i core");
		fantasy = new Fantasy();
		schedule = fantasy.getScheduler();
	}
	
	// post: Returns five pairs of FootballTeams that will play the
	//       next round. Example:
	//       {"Arsenal - Chelsea", "Stoke - Southampton", ...} 5 strings.
	public String[] getNextRoundSchedule() {
		FootballTeam[][] nextRoundSchedule = schedule.getNextRoundSchedule();
		
		String[] results = new String[5];
		for (int i = 0; i < 5; i++) {
			String homeTeam = nextRoundSchedule[i][0].getName();
			String awayTeam = nextRoundSchedule[i][1].getName();
			results[i] = homeTeam + " - " + awayTeam;
		}
		
		return results;
	}
	
	// post: Same as getNextRoundSchedule but returns 90 pairs. All Matches.
	//       Example: {"Arsenal - Chelsea", "Stoke - Southampton", ...} 90 strings.
	public String[] getTotalSchedule() {
		FootballTeam[][][] allRoundsSchedule = schedule.getTotalSchedule();
		
		String[] totalSchedule = new String[90];
		for (int i = 0; i < 18; i++) {
			for (int j = 0; j < 5; j++) {
				String homeTeam = allRoundsSchedule[i][j][0].getName();
				String awayTeam = allRoundsSchedule[i][j][1].getName();
				totalSchedule[(i*5)+j] = homeTeam + " - " + awayTeam;
			}
		}
		
		return totalSchedule;
	}
	
	public void simulateNextRound() {
		fantasy.simulateNextRound();
	}
	
	/*public FootballPlayer[] getAllFootballPlayers() {
		FootballTeam[] allTeams = fantasy.getTeamTotal();
		FootballPlayer[] allPlayers = new FootballPlayer[240];
		
		for (int i = 0, k = 0; i < 10; i++) {
			for (int j = 0; j < allTeams[i].getFootballPlayerAmount(); j++, k++) {
				allPlayers[k] = 
			}
		}
	}*/
	
	public MatchResults getMatchResults(int matchNumber) {
		return fantasy.getMatchResults(matchNumber);
	}
	
	public void buyPlayer(FootballPlayer player){
		int price = player.getMarketValue();
		player.setMarketValue(price+50);
	}
	
	public void sellPlayer(FootballPlayer player){
		int price = player.getMarketValue();
		player.setMarketValue(price-50);
	}
	
}
