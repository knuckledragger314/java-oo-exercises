package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class TheWhiteStripesFilter implements Filter {
	
	int r = 0;
	int b = 0;
	int g = 0;
		
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
		          
		          if (r + g + b < 356){
		        	  processed.set(i, j, new Color(0, 0, 0));  
		          }
		          
		          else if (r + g + b > 710){
		        	  processed.set(i, j, new Color(255, 255, 255));  
		          }
		          else {
		        	  processed.set(i, j, new Color(255, 0, 0));
		          }
		          	  
		      }
		    }	
			return processed;
		}

		public int getRed() {
			return 0;
		}
		
		public int getBlue() {
			return 0;
		}

		public int getGreen() {
			return 0;
		}

	}


