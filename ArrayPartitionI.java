import java.util.Arrays;

public class ArrayPartitionI {
	
	public static void main(String[] args) {
		int[] array = {4, 1, 2, 3};
		System.out.println(arrayPairSum(array));
	}
	
	public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}
