
package javagram;
import javagram.filters.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath = null;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				imagePath = dir + File.separator + relPath;
				
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
// TODO - prompt user for filter and validate input
//present the user with a list of filters, accept that input in the form of an integer. 
//Refactor getFilter so that it takes an integer and returns an instance of the 
//appropriate filter object. 
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
		

//initlialize filter to null, while loop while it is still null		
		Filter filter = null;
	do {
		
		try{	
			
		filter = getFilter(displayFilterMenu(in));
		System.out.println("Image successfully filtered");
		
		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
	
		// save image, if desired	
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();

		
		
// TODO - if the user enters the same file name as the input file, 
//confirm that they want to overwrite the original
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		} 
		
		if (fileName.equals(relPath)){
			System.out.println("Do you want to overwrite the original file? If so, type 'yes.' If not, type 'no.'");
			String yesOrNo = in.next();
			
			if (yesOrNo.equals("yes")){ 
				String absFileName = dir + File.separator + fileName;
					processed.save(absFileName);
					System.out.println("The file was overwritten to: " + absFileName);
			 } 
			
			else {
				 System.out.println("Please type in the new name you want to save the file as.");
				 String newName = in.next();
				 String absFileName = dir + File.separator + newName;
					processed.save(absFileName);
					System.out.println("The file was saved to " + absFileName);
			 }
			 
		}
		
		else {
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}	
		
		// close input scanner
		
		in.close();
		}
		
		catch (IndexOutOfBoundsException exp) {
			System.out.println("Your selection was less than 1 or greater than 4. " + exp);	
		}
		
		}
		while (filter == null);
		}
	
	
	public static int displayFilterMenu (Scanner in){
		System.out.println("You're on the Filter Menu! Hooray!");
		System.out.println("1. Feeling sad? The Blue Filter will turn that frown upside down!");
		System.out.println("2. Curious about Netflix's Stranger Things' 'Upside Down'?"
				+ '\n' + "   Check out the Invert Filter.");
		System.out.println("3. Do you like indie rock and a simple color palette? "
				+ '\n' + "   This White Stripes Filter may be for you.");
		System.out.println("4. Feeling indecisive or a little bipolar? "
				+ "\n   Try the Half Dark Half Bright Filter.");
		
		int menuSelection = in.nextInt ();
		return menuSelection;
	}
	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
	//FRUIT CLASS in 10/20 prep work
	private static Filter getFilter (int menuSelection) throws IndexOutOfBoundsException {
		if (menuSelection < 1 || menuSelection > 4){
			IndexOutOfBoundsException e = new IndexOutOfBoundsException();
			System.out.println("That wasn't a valid filter selection.");
			throw e;
		}
		
		if (menuSelection == 1) {
			return new BlueFilter();
		}
		
		else if (menuSelection == 2){
			return new InvertFilter();
		}
		
		else if (menuSelection == 3){
			return new TheWhiteStripesFilter();
		}
		else if (menuSelection == 4){
			return new HalfDarkBright();
		}
		else {
			return null;
		}
		//error statement for any other int
		// TODO - create some more filters, and add logic to return the appropriate one
		//Filter filter = getFilter(menuSelection);
	//	return filter; //that's not right. 

		
	}
}

	