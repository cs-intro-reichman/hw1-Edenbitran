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
		//After 25 years, a $250000 saved at 6.0%25 will yield $1072967
		//After 2 years, a $100 saved at 10.0%25 will yield $121
		double futureValue = currentValue * Math.pow(nr, n);
		System.out.println("After "+n+" years, a $"+currentValue + " saved at " + rate + "%25 will yield $" + (int) futureValue);
	}// Computes the future value of a saving investment.
}