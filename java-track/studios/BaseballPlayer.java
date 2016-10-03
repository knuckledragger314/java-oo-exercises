
public class BaseballPlayer {
	//A baseball player has a name and a jersey number. 
	//Most players hit either right or left, but some can hit either way. 
	//This object should be able to react when a player completes a game, 
	//recording how many hits and RBIs the player earned in that game. 
	//A player has a certain number of runs and RBIs he or she has recorded over all games played. 
	//A player has a certain number of games he or she has played.
//fields
	public String name;
	public String number;
	public String bats;
	public int RBIs;
	public int runs;
	public int games;

	//Constructor
	public BaseballPlayer (String name, String number, String bats){
		this.name = name;
		this.number = number;
		this.bats = bats;
		this.RBIs = RBIs;
		this.runs = runs;
		this.games = games;
				
	}
	
	public void PlayGame (int RBI, int run){
this.RBIs = this.RBIs + RBI;
this.runs = this.runs + run;
this.games = this.games + 1;
	}
	
	public int getRBIs(){
		return this.RBIs;
	}
	public int getRuns(){
		return this.runs;
	}
	public int getGames(){
		return this.games;
	}
	public static void main(String[] args) {
	BaseballPlayer piscoKid = new BaseballPlayer ("Piscotty", "55", "Right");
	piscoKid.PlayGame(2, 1);
	}
	
}

