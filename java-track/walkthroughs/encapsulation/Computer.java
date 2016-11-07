package encapsulation;

public class Computer {

	//fields:
	
	private int memory;
	protected double size;
	private double processor;
	private String brand;
	
	//Behaviors
	
	//Create a computer
	public Computer (int memory, double size, double processor, String brand){
		//memory = memory; //or, this.memory = memory (this.memory refers to the FIELD, not the parameter in public computer)
	
		if (memory < 0){
			throw new IllegalArgumentException();
		}
		
	this.memory = memory;
	this.size = size;
	this.processor = processor;
	this.brand = brand;
	}
	//Get the brand name
	public String getBrand(){
		return this.brand;
	}
	//Get the size
	public double getSize(){
		return this.size;
	}
	//Get the processor speed
	public double getProcessor(){
		return this.processor;
	}
	//Get the memory
	public int getMemory(){
		return this.memory;
	}
	//Add memory
	public void addMemory(int newMemory){
		if (this.memory + newMemory > 16){
			return;
		}
		else {
			this.memory = this.memory + newMemory;
		}
	}
			
	public void setProcessor(double newProcessor){
		this.processor = newProcessor;
		
	}
	
	public String toString(){
		return "Memory: " + this.memory + " Size: " + this.size + " Processor: " + this.processor + " Brand: " + this.brand;
	}

	
	public static void main(String args []){
		try{
			
		Computer myComputer = new Computer (-8, 2.4, 13.5, "Lenovo");
		System.out.println(myComputer.getBrand());
		}
		
		catch(IllegalArgumentException e){
			System.out.println("Cannot create computer.");
			e.printStackTrace();
		}
		
		Computer yourComputer = new Computer (4, 3.3, 13.3, "Apple");
		System.out.println(yourComputer.getBrand());
		//myComputer.addMemory(4);
		//System.out.println(myComputer.getMemory());
		yourComputer.addMemory(3);
		System.out.println(yourComputer.getMemory());
		System.out.println(yourComputer);
		
	
	}
	
	//Swap out the processor
	
}
