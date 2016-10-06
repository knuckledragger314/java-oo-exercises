import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testIsBigger() {
		Rectangle r = new Rectangle (5, 10);
		assertTrue(r.getArea() == 50);
		assertTrue("The rectangle is not bigger.", r.isBigger(3) == true);

	}
	
	@Test
	public void testIsSquare() {
		Rectangle l = new Rectangle (5, 2);
				assertTrue(l.getLength() != l.getWidth());
				assertTrue("The shape is not a square.", l.isSquare() == false);

	}

}
