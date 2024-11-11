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
		int a, b, c, min, mid, max, rmid;
		min = Math.min(nums[0], nums[1]);
		a = Math.min(min, nums[2]);
		//System.out.println("min= " + a);

		max = Math.max(nums[0], nums[1]);
		c = Math.max(max, nums[2]);
		//System.out.println("max= " + c);

		mid = Math.max(min, a);
		System.out.println("mid" + mid);
		b = Math.min(max, c);
		mid = Math.min(mid, b);
		rmid = Math.min(b, mid);
		System.out.println(rmid);
		

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.print("min=" + a + " mid=" + mid + " max=" + c);
	}

}