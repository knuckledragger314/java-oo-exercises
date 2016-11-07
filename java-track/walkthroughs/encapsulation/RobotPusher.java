package encapsulation;

public class RobotPusher extends Robot{
	boolean isPushing;
	
	public RobotPusher (String name, int xCoordinate, int yCoordinate, int speed, int orientation){
	super (name, xCoordinate, yCoordinate, speed, orientation);
	this.isPushing = true;
	}
	
	public void push (int orientation, int speed){
		if (isPushing = true){
			if (orientation == 0){
				this.yCoordinate = yCoordinate + speed;
			}
			
			if (orientation == 90){
				this.xCoordinate = xCoordinate + speed;
			}
			
			if (orientation == 180){
				this.yCoordinate = yCoordinate - speed;
			}
			if (orientation == 270){
				this.xCoordinate = xCoordinate - speed;
			}
			
	}
	}
}
