package FlaecheAuslesen;

import static org.junit.Assert.*;

import org.junit.Test;

public class BerechnungFigurTest  {

	 private static final double PRECISION = 0.0001;
	
	 @Test
	public void test() {
		
		Rechteck r1 = new Rechteck(2,3);
		
		assertEquals(6, r1.getFlaeche(), PRECISION);
	}
	 
	 
	 @Test
	public void test2() {
			
			Dreieck d1 = new Dreieck (2,3);
			
			assertEquals(3, d1.getFlaeche(), PRECISION);
		}
	 
	 @Test
		public void test3() {
				
				Quadrat q1 = new Quadrat (2);
				
				assertEquals(4, q1.getFlaeche(), PRECISION);
			}

	 @Test
		public void test4() {
				
				Gerade g1 = new Gerade (2);
				
				assertEquals(0, g1.getFlaeche(), PRECISION);
			}
}
