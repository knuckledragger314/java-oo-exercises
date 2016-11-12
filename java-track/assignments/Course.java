
public class Course {
	private String name;
	//private int number;
	private int credits;
	private int seatsRemain;
	private Student [] studentRoster;
	
	public Course (String name, int credits, int seatsRemain){
		this.name = name;
		//this.number = number;
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
	//if class is full, return false
	if (seatsRemain < 1){
		
		return false;
	}
	//check to see if student is already registered

	for (int i = 0; i < studentRoster.length; i++){
		//if student name you are trying to add
		// is not equal to one that is already in the array
		//add it to the student roster
			if ( studentRoster[i] != null && studentRoster[i].getName() == newStudent.getName()){
				return false;
			}
	
			//index at length of array - seats remain (minus one) should be the newStudent...right?)
				//subtract the non-empty indexes from the full length of array
				//add student there
				studentRoster[studentRoster.length - getRemainingSeats()] = newStudent;
				//subtract seats remain
			//	getRemainingSeats();
				}		
	seatsRemain--;
	return true;
}

public Student[] generateRoster(){
	//how to omit empty array spots is the task here
		return studentRoster;	
	
}

	public double averageGPA(){
		double sumGPA = 0;
		double averageGPA = 0;
		double gpa = 0;
		int counter = 0;
//returns the average GPA of all students enrolled in the course. 
//Make sure to omit "empty" seats!	
		for (int j = 0; j < studentRoster.length; j++){
			if (studentRoster[j] != null){
			//grab the GPA
				gpa = studentRoster[j].getGPA();
				sumGPA = sumGPA + gpa;
				counter++;
			}
			
			
				
				//System.out.println("SumGPA: " + sumGPA + "  gpa: " + gpa + "counter: " + counter);
		}	
//System.out.println("out of loop- SumGPA: " + sumGPA + "  gpa: " + gpa + "counter: " + counter);
		
		
			averageGPA = sumGPA/counter;
			//averageGPA = ((Math.round(averageGPA) *1000.00) / 1000.00);
			return averageGPA;
			
}
	public String toString() {
//should contain the course number and credits
	return "Name: "+ getName() + "credits: " + getCredits();
	}
}


