package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class InvertFilter implements Filter{
	int r = 0;
	int b = 0;
	int g = 0;

	@Override
	public int getRed() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getBlue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getGreen() {
		// TODO Auto-generated method stub
		return 0;
	}

	
public Picture process(Picture original) { 
		
		Picture processed = new Picture(original.width(), original.height());
        
	    //get each pixel one by one
	    for (int i = 0; i < original.width(); i++) {
	      for (int j = 0; j < original.height(); j++) {
	    	  
	    	  Color c = original.get(i, j);
	          
	          //get color components from each pixel
	    	  // colors = (red, green, blue)
	          r = c.getRed();
	          g = c.getGreen();
	          b = c.getBlue();
	          
	          int newRed = 255 - r;
	          int newGreen = 255 - g; 
	          int newBlue = 255 - b;
	          
	          processed.set(i, j, new Color(newRed, newGreen, newBlue));	  
	      }
	    }	
		return processed;
	}
}
