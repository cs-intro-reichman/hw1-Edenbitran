// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		// Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		int h, t, u; // h=hundreds, t=tens, u=units
		u = (num % 10);
		num /= 10;
		t = num % 10;
		num /= 10;
		h = num;
		System.out.println(h + " hundreds, " + t + " tens, " + u + " units.");
	}
}
