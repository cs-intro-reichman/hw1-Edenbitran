import java.util.Random;

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		/* lim= limit of random integers
		creating an arrey with random integers*/ 
		int lim = Integer.parseInt(args[0]);
		int[] nums = new int[3];
		for (int i = 0; i < nums.length; i++) {
			Random rnd = new Random();
			int rndN = (int) (rnd.nextInt(1, lim));
			nums[i] = rndN;
			System.out.println("nums " + nums[i]);
		}
		int a, b, c, min, mid, max;
		min = Math.min(nums[0], nums[1]);
		a = Math.min(min, nums[2]);
		//System.out.println("min= " + a);

		max = Math.max(nums[0], nums[1]);
		c = Math.max(max, nums[2]);
		//System.out.println("max= " + c);

		mid= Math.max(nums[0], nums[1]);
		b = Math.min(mid, nums[2]);
		System.out.println("mid- "+mid+"\nb- "+b);

		if (Math.max(nums[0], nums[1]) == Math.min(mid, nums[2])) {
			b = Math.min(mid, nums[2]);
		}
//maybe loop will solve the mid number
		if (mid != b) {
			if ((mid == a || mid == c) && (b != a && b != c)) {
				b = b;
			}
			if ((b == a || b == c) && (mid != a && mid != c)) {
				b = mid;
			}
		}
			

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("min=" + a + " mid=" + b+ " max=" + c);
	}

}