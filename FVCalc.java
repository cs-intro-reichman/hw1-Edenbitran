// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		int currentValue, n;
		double rate;
		currentValue = Integer.parseInt(args[0]);
		rate = Double.parseDouble(args[1]);
		if (rate > 100 || rate < 0) {
			System.out.println("Please enter a number btween 0-100");
			rate = Double.parseDouble(args[1]);
		}
		n = Integer.parseInt(args[2]);
		double nr = (100 + rate) / 100;
		//System.out.println("new rate "+nr);
		//After 25 years, $25000 saved at 6.0% will yield $107296
		double futureValue = currentValue * Math.pow(nr, n);
		System.out.println("After "+n+" years, $"+currentValue + " saved at " + rate + "% will yield $" + (int) futureValue);
	}// Computes the future value of a saving investment.
}