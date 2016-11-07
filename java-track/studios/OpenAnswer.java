
public class OpenAnswer extends Question {
	public OpenAnswer (String question, String answer){
		super (question, answer);
	}
	public static void main (String args[]){
		OpenAnswer one = new OpenAnswer ("What is the best song by the rock band Titus Andronicus?", "Dimed Out");
		OpenAnswer two = new OpenAnswer ("What is the greatest band to come out of Scotland this decade?", "Frightened Rabbit");
				
	}

}
