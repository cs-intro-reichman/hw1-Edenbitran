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
		double futureValue = currentValue * Math.pow(nr, n);
		//After 2 years, $100 saved at 10.0% will yield $121
		System.out.println("After "+n+" years, a $"+ currentValue + " saved at " + rate + "% will yield $" + (int) futureValue+"");
	}// Computes the future value of a saving investment.
}