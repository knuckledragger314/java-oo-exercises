package Interfaces;

import java.util.ArrayList;

public class Rectangle implements Measurable {
	
	private float height;
	private float width;
	
	public Rectangle (float h, float w){
	
	this.height = h;
	this.width = w;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return this.height * this.width;
	}

	@Override
	public float getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * this.height + 2 * this.width;
	}
	
	public static void main (String [] args){
		Rectangle b = new Rectangle (7, 8);
		Circle c = new Circle (4);
		
		ArrayList<Measurable> shapes = new ArrayList <Measurable>();
		shapes.add(b);
		shapes.add(c);
	for (int i = 0; i< shapes.size(); i++){
		
		Measurable shape = shapes.get(i);
		System.out.println(shape.getArea());
	}
	}

}
