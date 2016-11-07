package encapsulation;

import java.util.ArrayList;

public class Laptop extends Computer {
	private boolean isClosed;
	
	public Laptop (int memory, double size, double processor, String brand){
		super (memory, size, processor, brand);	
		this.isClosed = true;
	}
	
	public void close (){
		this.isClosed = true;
	}
	
	public void open() {
		this.isClosed = false;
	}
	
	public static void main (String args[]){
		Laptop l = new Laptop (8, 13, 20000, "Lenovo");
		Tablet t = new Tablet (4, 10, 1000, "Samsung");
		Computer c = new Computer (16, 17, 30000, "Dell");

		System.out.println(l.getBrand());
		System.out.println(t.getBrand());
		System.out.println(c.getBrand());
		
		ArrayList<Computer> computers = new ArrayList<Computer>();
		computers.add(l);
		computers.add(c);
		computers.add(t);
		
	}

}
