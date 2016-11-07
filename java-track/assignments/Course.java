
public class Course {
	private String name;
	private int credits;
	private int seatsRemain;
	private Student [] studentRoster;
	
	public Course (String name, int credits, int seatsRemain){
		this.name = name;
		this.credits = credits;
		this.seatsRemain = seatsRemain;
		this.studentRoster = new Student [seatsRemain];
	}
	
	public String getName(){
		return this.name;
	}
	public int getCredits(){
		return this.credits;
	}
	public int getRemainingSeats(){
		return this.seatsRemain;
	}
	public Student [] getStudentRoster(){
		return this.studentRoster;
	}
	
//addStudent()
//returns a boolean based on whether or not the student was successfully added to the course. 
//Check to make sure the student has not already enrolled, and update the number of seats remaining. 
//When checking that the student has not already enrolled, 
//use the student's name to compare an enrolled student to the student that you are trying to add.
	
public boolean addStudent(Student newStudent){
//if student already registered return false
//if class is full return false
	//initialize boolean variable
	//Student newStudent = new Student (firstName, lastName, credits);
	boolean added = false;
	//if class is full, return false
	if (seatsRemain < 1){
		added = false;
	}
	//check to see if student is already registered
	else{
	for (int i = 0; i < studentRoster.length; i++){
		//if student name you are trying to add
		// is not equal to one that is already in the array
		//add it to the student roster
			if ( studentRoster[i] != null && studentRoster[i].getName() == newStudent.getName()){
				added = false;
			}
			else{
			//index at length of array - seats remain (minus one) should be the newStudent...right?)
				//subtract the non-empty indexes from the full length of array
				//add student there
				studentRoster[studentRoster.length - getRemainingSeats()] = newStudent;
				//subtract seats remain
			//	getRemainingSeats();
			added = true;
		}		
	}	
}
	if (added = true){
		seatsRemain--;
	}
	return added;
}


public Student[] generateRoster(){
	//how to omit empty array spots is the task here
		return studentRoster;	
	
}

	public double averageGPA(){
		double sumGPA = 0;
//returns the average GPA of all students enrolled in the course. 
//Make sure to omit "empty" seats!
		//The code below does not omit empty seats.
		for (int j = 0; j < studentRoster.length; j++){
			sumGPA =+ studentRoster[j].getGPA();
		}
		
			double averageGPA = sumGPA/studentRoster.length;
			return averageGPA;
			
}
	public String toString() {
//should contain the course number and credits
	return "Name: "+ getName() + "credits: " + getCredits();
	}
}


