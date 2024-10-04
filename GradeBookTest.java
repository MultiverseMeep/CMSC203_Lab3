package jUnitTest;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class GradeBookTest extends TestCase {

	
	GradeBook test1;
	GradeBook test2;
	
	protected void setUp() throws Exception {
		
		test1 = new GradeBook(5);
		test2 = new GradeBook(5);
		
		test1.addScore(2);
		test1.addScore(6);
		
		test2.addScore(4);
		test2.addScore(9);
		test2.addScore(7);
		
		
		
	}

	protected void tearDown() throws Exception {
		
		test1 = null;
		test2 = null;
		
	}

	public void testAddScore() {

		

		//System.out.println("test1 string: " + test1.toString());
		Assertions.assertTrue(test1.toString().equals("2.0 6.0 "), "test1 should have a string of of [2.0 6.0]");
		
		
		
		//System.out.println("test2 string: " + test2.toString());
		Assertions.assertTrue(test2.toString().equals("4.0 9.0 7.0 "), "test2 should have a string of of [4.0 9.0 7.0]");
		
		
		Assertions.assertEquals(test1.getScoreSize(), 2, "test 1 should have a score size of 2");
		Assertions.assertEquals(test2.getScoreSize(), 3, "test 2 should have a score size of 3");
		
		//System.out.println(test1.getScoreSize());
		//System.out.println(test2.getScoreSize());
		
	}

	public void testSum() {

		//System.out.println("Sum 1: " + test1.sum());
		
		Assertions.assertTrue(test1.sum() == 8.0, "test1 should have a sum of 8.0");
		
		//System.out.println("Sum 2: " + test2.sum());
		
		Assertions.assertTrue(test2.sum() == 20.0, "test2 should have a sum of 20.0");
		
	}

	public void testMinimum() {
		//System.out.println("Minimum 1: " + test1.minimum());
		
		Assertions.assertTrue(test1.minimum() == 2.0, "test1 should have a minimum of 2.0");
		
		//System.out.println("Minimum 2: " + test2.minimum());
		
		Assertions.assertTrue(test2.minimum() == 4.0, "test2 should have a minimum of 4.0");
	}

	public void testFinalScore() {
		//System.out.println("Final 1: " + test1.finalScore());
		Assertions.assertTrue(test1.finalScore() == 6.0, "test1 should have a final score of 6.0");
		
		//System.out.println("Final 2: " + test2.finalScore());
		
		Assertions.assertTrue(test2.finalScore() == 16.0, "test2 should have a final score of 16.0");
	}

	
}
