
public class Question {
	
	private String question;
	private String answer;
	
	
	public Question (String question, String answer){
		this.question = question;
		this.answer = null;
	}
	
	public String getQuestion(){
		return this.question;
	}
	public String getAnswer(){
		return this.answer;
	}
	public static void main (String args[]){
		Question one = new TrueFalse("True or False - The Earth is Flat.", "False");
		Question two = new TrueFalse("Very little in the world is black and white. Human actions are best understood through a spectrum of grays.", "True");
		Question three = new MultipleChoiceQuestion ("How old is the Earth?", "B - 4.5 billion years", "A - 100 trillion years old", "B - 4.5 billion years", "C - Less than 10,000 years", "D - One hundred years");
		Question four = new MultipleChoiceQuestion ("Who will be the next President of the United States?", "A - Hillary Clinton", "A - Donald Trump", "B - Hillary Clinton", "C - Gary Johnson", "D - Jill Stein");
		Question five = new OpenAnswer ("What is the best song by the rock band Titus Andronicus?", "Dimed Out");
		Question six = new OpenAnswer ("What is the greatest band to come out of Scotland this decade?", "Frightened Rabbit");
		
	}
}
