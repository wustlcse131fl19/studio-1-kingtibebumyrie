package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("What is team member One's name?");
		String s1 = ap.nextString("What's team member two's name?");
		String s2 = ap.nextString("What is team member three's name?");
		String s3 = ap.nextString("What is team member four's name?");
		//
		// Say hello to the names in s0 through s3.
		//
		System.out.println("HI " + s0+", " +s1+", " + s2+", and " + s3);

	}
}
