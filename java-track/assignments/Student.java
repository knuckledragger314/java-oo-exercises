
public class Student {
	private String firstName;
	private String lastName;
	private int studentID;
	private int credits;
	private double gpa;
	private double qualityScore;
	private double courseGrade;
	private double tuition;
	private String classStanding;

	
	public Student (String firstName, String lastName, int studentID){
//Student Charlie = new Student ("Charlie", "Edelen", 4);
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.credits = 0;
		this.gpa = 0.0;
		this.qualityScore = 0.0;
		this.courseGrade = 0.0;
		this.classStanding = null;
	}
	public String getName(){
		return this.firstName + " " + this.lastName;
	}
	public int getStudentID(){
		return this.studentID;
	}
	public int getCredits(){
		return this.credits;
	}
	public double getGPA(){
		return this.gpa;
	}
	public double getQualityScore(){
		return this.qualityScore;
	}
	
	public String getClassStanding(){
		if (this.credits < 30){
			classStanding = "Freshman";	
		}
		else if (this.credits < 60){
			classStanding = "Sophomore";
		}
		else if (this.credits < 90){
			classStanding = "Junior";
		}
		else {
			classStanding = "Senior";
		}
	return classStanding;
	
	
	
	}
	double totalQS=0; 
	public double submitGrade(double courseGrade, int credits){//3, 2
//Take the number of credits for a course and multiply it by the grade for that course. 
//This is called the quality score. 
//GPA is computed as the sum of all of the quality scores for each course 
//the student has taken, divided by the total number of credits.
//You should also round the GPA so that it 
//only contains three digits after the decimal.
		//course grade and credits
		//make sure that this.credits equals all the credits has accumulated

		/*this.credits += credits;
		this.courseGrade = courseGrade;
		System.out.print("Course Grade=");
	
		this.qualityScore = this.courseGrade * credits;//4 * 1
		
		this.totalQS = this.qualityScore + this.totalQS;
		System.out.println("TotalQs "+totalQS);
		System.out.println("My id is "+this.studentID);
		System.out.println("Grade="+this.courseGrade+
				" this.credits="+String.valueOf(this.credits)+
				" this.qualityScore="+String.valueOf(this.qualityScore));
		double gpatotal = this.totalQS/this.credits;
	    Math.round(((gpatotal) * 100) / 100);
		System.out.println("gpatotal:" + gpatotal);
		return gpatotal;*/
		
		this.qualityScore += courseGrade * credits;
		this.credits += credits;
		this.gpa = this.qualityScore / this.credits;   
		this.gpa = (double)Math.round(this.gpa *1000) / 1000;
		return gpa;
	 
	}
	
	public double computeTuition(){
//returns the total amount of tuition the student has paid. 
//The average cost of tuition for 1 semester in the United States is roughly $20,000. 
//Assume there are 15 credit hours per semester;
//"leftover" credits are computed at the proportional rate.
//each credit is $1,333.33
	if (getCredits() < 15){
		tuition = this.credits * 1333.33;
	}
	if (getCredits() % 15 != 0){
		}
	tuition = ((this.credits / 15) * 20000) + ((this.credits % 15) * 1333.33);
	if (getCredits() % 15 == 0 ){
		tuition = ((this.credits / 15) * 20000);
	}
	return tuition;
	}
	
	//Create legacy
	
	public Student createLegacy(Student StudentA, Student StudentB){
		String bbFN = StudentA.getName();
		//System.out.println(this.firstName);
		String bbLN = StudentB.getName();
		//System.out.println(this.lastName);
		int bbID = (StudentA.getStudentID() + StudentB.getStudentID());
//		studentID = (StudentA.studentID + StudentB.getStudentID());
		System.out.println("Student ID test:" + bbID);
		System.out.println(StudentA.getStudentID());
		System.out.println(StudentB.getStudentID());
		System.out.println(StudentA.getStudentID() + StudentB.getStudentID());
		
		Student baby = new Student (bbFN, bbLN, bbID);
		
		
		System.out.println("second test" + baby.getStudentID());
		baby.gpa = (StudentA.getGPA() + StudentB.getGPA())/2;
		//System.out.println(this.gpa);
		if (StudentA.credits > StudentB.credits){
			baby.credits = StudentA.credits;
		}
		else{
			baby.credits = StudentB.credits;
		}

		//baby.studentID = StudentA.studentID + StudentB.studentID; 
		
		//System.out.println(this.studentID);
		
		//return createLegacy (StudentA, StudentB);
		return baby;
		
		//System.out.println(createLegacy (StudentA, StudentB));
	}
	
	public String toString (){
		return "Name: " + this.firstName + " " + this.lastName + " Student ID: " + this.studentID;
	}
		
		
	
	
	

}


