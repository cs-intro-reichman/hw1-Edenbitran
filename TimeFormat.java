// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
	//	//int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
	//	//int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		// Replace this comment with the rest of your code
		int h = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		System.out.println(h + " : " + m);
		if (h >= 00 && h <= 11 && m <= 59) {
			System.out.println(h + " : " + m + " AM");
		}
		else if (h >= 12 && h <= 23 && m <= 59){
			if (h == 12) {
				System.out.println(h + " : " + m + " PM");
				}
			for (int i = 1; i < 12; i++) {
				if (12 + i == h) {
					System.out.println(i + " : " + m + " PM");
				}
				
			}
		}
	}
}