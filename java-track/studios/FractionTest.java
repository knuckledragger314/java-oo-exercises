import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTest {

	@Test
	public void testAddFraction() {
		Fraction z = new Fraction (1, 2);
		Fraction y = new Fraction (2, 3);
		Fraction x = new Fraction (7, 6);
		z.addFraction(y);
		//x.getNum();
		//assertTrue("Your math isn't right there.", z.addFraction(y) == x.getNum(7));
		assertTrue("Your numerator isn't right there.", x.getNum() == 7);
		assertTrue("Your denominator is incorrect.", x.getDen() == 6);
		
		//maybe try assertEquals (z.addFraction(y) = x
		
	}
	
	@Test
	public void testAddFractionSameDen(){
		Fraction a = new Fraction (2, 5);
		Fraction b = new Fraction (4, 5);
		Fraction c = new Fraction (6, 5);
		a.addFraction(b);
		assertTrue("Your numerator isn't correct.", c.getNum() == 6);
		assertTrue("Your denominator isn't correct.", c.getDen() == 5);
	}

	@Test
	public void testMultFracts(){
		Fraction i = new Fraction (1, 5);
		Fraction o = new Fraction (4, 7);
		Fraction u = new Fraction (7, 20);
		i.multFracts(o);
		assertTrue("You did not calculate the numerator properly.", u.getNum() == 7 );
		assertTrue("You did not calculate the denominator properly.", u.getDen() == 20 );
	}
	
	@Test
	public void testRecipNums(){
		Fraction f = new Fraction (3, 7);
		Fraction g = new Fraction (7, 3);
		f.recipNums(g);
		assertTrue("You did not calcualte the numerator properly.", g.getNum() == 7);
		assertTrue("You did not calcualte the denominator properly.", g.getDen() == 3);
				
	}
}
