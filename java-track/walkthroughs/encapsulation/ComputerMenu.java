package encapsulation;
import java.util.ArrayList;
import java.util.Scanner;

public class ComputerMenu {
	private ArrayList<Computer> computers;
	private Scanner s;
	
	public static void main (String[] args){
		int x = 0;
		ComputerMenu cm = new ComputerMenu();
		do {
			x = cm.startMenu();
			cm.processInput(x);
		}
		while (x !=5);
	}
	
	public ComputerMenu(){
		s = new Scanner (System.in);
		computers = new ArrayList<Computer>();
	}
	
	public int startMenu(){
		System.out.println("Welcome to the Computer Menu Screen!");
		System.out.println("1. Create a Computer.");
		System.out.println("2. Display a list of Computers that are available.");
		System.out.println("3. Change the Processor of a Computer.");
		System.out.println("4. Add Memory to a Computer.");
		System.out.println("5. Exit this Computer Menu Screen.");
		System.out.println("Please select an option:");
		int selection = s.nextInt();
		while (selection < 0 || selection > 5){
			System.out.println("Invalid selection. Please try again.");	
		}
		return selection;
	}
	
	public void processInput(int selection){
		if (selection == 1){
			createComputers();
		}
		else if (selection == 2){
			displayComputers();
		}
		
		else if (selection == 3){
			displayComputers();
			Computer d = selectComputer();
			System.out.println("Please enter a Processor speed for the computer.");
			int proc = s.nextInt();
			while (proc < 1){
				System.out.println("Invalid value. Please enter a positive integer.");
				proc = s.nextInt();
			}
			
			d.setProcessor(proc);
			System.out.println("Here's the status...");
			System.out.println(d);
		}
		
		else if (selection == 4){
			displayComputers();
			Computer d = selectComputer();
			System.out.println("How much Memory would you like to add?");
			int mem = s.nextInt();
			while (mem < 1){
				System.out.println("Invalid value. Please enter a positive integer.");
				mem = s.nextInt();
			}
			d.addMemory(mem);
			System.out.println("Here's what the computer looks like...");
			System.out.println(d);
}
		private void displayComputers(){
			for (int i = 0; i< computers.size(); i++){
				System.out.println((i+1) + ".)" + computers.get(i));
			}
		}
		
		
		else if (selection == 5){
	
}
		
	}

}
