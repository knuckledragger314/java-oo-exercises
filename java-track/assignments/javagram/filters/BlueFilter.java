package javagram.filters;

import javagram.Picture;
import java.awt.Color;

public class BlueFilter implements Filter {
//TODO1 - somewhere in here "refactor from orange to fruit per CB video
//Create an interface named Filter, so that BlueFilter implements Filter. 
//Refactor the code in Javagram to use a reference of type Filter rather than a BlueFilter reference. To do this, you'll need to modify code with main as well as the definition of the method getFilter. Your interface should live in the javagram.filters package.
	int r = 0;
	int b = 0;
	int g = 0;
	
	@Override
	public int getRed() {
		return r;
	}

	@Override
	public int getBlue() {
		return b;
	}

	@Override
	public int getGreen() {
		return g;
	}
	
	public Picture process(Picture original) { 
		
		Picture processed = new Picture(original.width(), original.height());
        
	    //get each pixel one by one
	    for (int i = 0; i < original.width(); i++) {
	      for (int j = 0; j < original.height(); j++) {
	    	  
	    	  Color c = original.get(i, j);
	          
	          //get color components from each pixel
	          r = c.getRed();
	          g = c.getGreen();
	          b = c.getBlue();
	          
	          int newBlue = (r + g + b) / 3;
	          
	          processed.set(i, j, new Color(0, 0, newBlue));	  
	      }
	    }	
		return processed;
	}
	
}