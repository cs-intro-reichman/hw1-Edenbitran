// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		double totalBill = Double.parseDouble(args[3]);
		double bill4one = (totalBill / 3);
		System.out.println("Dear " + name1 + ", " + name2 + ", " + name3 + "\n  pay: " + Math.ceil(bill4one)
				+ " shekels each");
	}
}
