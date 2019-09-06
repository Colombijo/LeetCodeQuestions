
public class FindPivotIndex {
	public static void main(String[] args) {
		int[] array = {1, 7, 3, 6, 5, 6};
		System.out.println(pivotIndex(array));
	}
	
	 public static int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int runningSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum - nums[i] - runningSum == runningSum) {
                return i;
            }
            runningSum += nums[i];
        }
        return -1;
    }

}
