
public class HouseRobber {
	
	public static void main(String[] args) {
		int[] array = {2, 7, 9, 5, 1, 6, 11, 2, 5, 8, 12, 5, 3};
		System.out.println(rob(array));
		
	}
	
	public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } 
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        nums[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            nums[i] = Math.max((nums[i] + nums[i -2]), nums[i - 1]);
        }
        return nums[nums.length - 1];
    }

}
