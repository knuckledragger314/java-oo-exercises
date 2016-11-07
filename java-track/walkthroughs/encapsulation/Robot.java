package encapsulation;

public class Robot {
	//Your task for this exercise is to design and implement a Robot class.
	//A Robot has-a: Name Position (this should be two dimensional, use x and y coordinates)
	//Speed
	//Orientation: which direction is the robot facing? To keep this simple, we we limit ourselves to four directions: north, south, east, and west.
private String name;
protected int xCoordinate;
protected int yCoordinate;
private int speed;
private int orientation; //0 = N; 90 = E; 180 = S; 270 = W


//Behaviors
//Create a robot

public Robot (String name, int xCoordinate, int yCoordinate, int speed, int orientation){
	this.name = name;
	//this.location = location (xCoordinate, yCoordinate);
	this.xCoordinate = xCoordinate;
	this.yCoordinate = yCoordinate;
	this.speed = speed;
	this.orientation = orientation;
}
//It can move. 
//Where it ends up depends on its 
//current position, its orientation, and its speed.
public int getXcoordinate(){
	if (orientation == 90 || orientation == 270){
		this.xCoordinate = xCoordinate + speed;
	}
	return this.xCoordinate;
	
}

public int getYcoordinate(){
	if (orientation == 0 || orientation == 180){
		this.yCoordinate = yCoordinate + speed;
	}
	return this.yCoordinate;
}
//It can rotate. This changes the robot's orientation. 
public int getOrientation(){
	return this.orientation;
}
public String toString(){
	return "Name: " + this.name + " Position: " + this.xCoordinate + ", " + this.yCoordinate + " Speed: " + this.speed + " Orientation: " + this.orientation;
}
public static void main(String args []){
	Robot myRobot = new Robot ("Robert", 0, 0, 10, 90);
	System.out.println(myRobot);
}
}
