package trunk.Java;

public class FootballTeam {
	private int numPlayers;
	private String teamPath;
	private FootballPlayer[] players;
	private String name;
	
	
	//Constructor
	public FootballTeam( FootballPlayer[] players ){
		this.players = players;
	}
	
	
	public FootballPlayer[] getSimulationTeam( ){
		System.out.println( this.name );
		System.out.println( this.numPlayers );
		System.out.println( this.teamPath );
		System.out.println( this.name );
		return this.players;
	}
	
	public String getPath( ){
		return "test";
	}
	
}
