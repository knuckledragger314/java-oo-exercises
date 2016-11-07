package encapsulation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputerTest {

	@Test
	public void testAddMemory() {
		Computer d = new Computer (4, 50, 100, "Apple");
		assertTrue("Problem getting memory in the constructor", d.getMemory() == 4);
		d.addMemory(2);
		assertTrue("Looks like you maybe didn't addMemory() correctly?", d.getMemory() == 6);
		
	}
	
	@Test
	public void testAddMemoryMaxMemory() {
		Computer d = new Computer (16, 50, 100, "Apple");
		assertTrue("Problem getting memory in the constructor", d.getMemory() == 16);
		d.addMemory(2);
		assertTrue("Problem adding memory when you hit maximum?", d.getMemory() == 16);
		
	}
	
	@Test
	public void testValidMemory(){
	try{
		Computer d = new Computer (-4, 50, 100, "Apple");
		fail("exception was not thrown but value was invalid");
	}
	catch (IllegalArgumentException e){
		 assertTrue(true);
	}
	}
	}
