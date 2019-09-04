
public class MaxConsecutiveOnes {
	
	public static void main(String[] args) {
		int[] array = {1, 1, 0, 1, 1, 1};
		System.out.println(findMaxConsecutiveOnes(array));
	}
	
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++;
            } else {
                current = 0;
            }
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

}
