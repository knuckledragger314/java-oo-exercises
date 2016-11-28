package javagram.filters;

import javagram.Picture;

public interface Filter {
	
	public int getRed();
	public int getBlue();
	public int getGreen();
	public Picture process(Picture picture);

}

