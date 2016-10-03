//A rectangle has a length and a width. 
//A rectangle should be able to provide its area and perimeter. 
//A rectangle can indicate whether it is smaller than another 
//rectangle in terms of area. 
//A rectnagle can indicate whether it is in fact a square.
public class Rectangle {
	
	//fields
	private int length;
	private int width;
	private int perimeter;
	private int area;
	
	
	//constructor
	public Rectangle (int length, int width){
		this.length = length;
		this.width = width;
		this.perimeter = this.length + this.width;
		this.area = this.length * this.width;
	}
	//getters
	public int getLength(){
		return length;
	}
	public int getWidth(){
		return width;
	}
	//method is it bigger than another rectangle
	public boolean isBigger (int area2){
		if (this.area > area2){
			return true;
		}
		else {
			return false;
		}
	}
		
		
	//is it square?
	public boolean isSquare(){
		if (this.length == this.width){
			return true;
		}	
		else{
			return false;
			}
		
		
	}
	public String toString(){
		return "length: "+ this.length + ", width: " + this.width + ", perimeter: " + this.perimeter + ", area: " + this.area;
	}
	
	
}
