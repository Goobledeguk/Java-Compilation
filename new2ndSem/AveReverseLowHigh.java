	import java.util.Arrays;

	public class AveReverseLowHigh{
	public static void main(String[]args){

	int[] nums = { 19, 29, 79, 30, 12, 15, 16, 23};

	int[] rev = Reverse(nums);
	int avr = Average(nums);
	int lws = Lowest(nums);
	int hgh = Highest(nums);
	int [] dbl = Double(nums);
	int [] sort = sorting(nums);

	System.out.println("\nReverse: "+ Arrays.toString(rev));
	System.out.println("\nAverage: "+ avr);
	System.out.println("\nLowest: "+ lws);
	System.out.println("\nHighest: "+ hgh);
	System.out.println("\nDoubled: "+ Arrays.toString(dbl));
	System.out.println("\nSorted: "+ Arrays.toString(sort));
	System.out.println("");
}



	public static int[] sorting(int[] nums){
		int  n = nums.length;
		for (int i = 0; i < n -1; i++){
			for ( int j = 0; j < n - i -1;  j++){
				if ( nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
			}
		}
	}
return nums;
}

	public static int[] Double(int[] nums){

	int[] result = new int[2*nums.length];
	for( int i = 0; i < nums.length; i++){
		result[2*i] = nums[i];
		result[2*i+1] = nums[i];
}
return result;
}
	public static int[] Reverse(int[] nums){
	for( int i = 0; i < nums.length/2; i++){
		int temp = nums[i];

		nums[i] = nums[nums.length - 1 -i];

		nums[nums.length - 1 -i] = temp;
		}
		return nums;
	}

	public static int Average(int[] nums){
	int sum = 0;
	for(int i = 0; i < nums.length; i++){
		sum += nums[i];
	}
	int ave = sum / nums.length;
	return ave;
	}

	public static int Highest(int[] nums){
		int high = nums[0];
			for( int i = 0; i < nums.length; i++){
				if ( high < nums[i]){
					high = nums[i];
		}

		}
		return high;
	}

	public static int Lowest(int[] nums){
		int low = nums[0];
		for( int i = 0; i < nums.length; i++){
			if ( low > nums[i]){
				low = nums[i];
	}

	}
return low;
}


}