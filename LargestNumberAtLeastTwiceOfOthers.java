
public class LargestNumberAtLeastTwiceOfOthers {
	
	public static void main(String[] args) {
		int[] array = {3, 6, 1, 0};
		System.out.println(dominantIndex(array));
		
	}
	
	public static int dominantIndex(int[] nums) {
        int max = 0;
        int nextMax = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                nextMax = max;
                max = nums[i];
                maxIndex = i;
            } else if (nums[i] > nextMax) {
                nextMax = nums[i];
            }
        }
        if ((nextMax * 2) <= max) {
            return maxIndex;
        } else {
            return -1;
        }
    }
}
