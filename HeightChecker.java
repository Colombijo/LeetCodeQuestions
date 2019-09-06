import java.util.Arrays;

public class HeightChecker {
	public static void main(String[] args) {
		int[] heights = {1, 1, 4, 2, 1, 3};
		System.out.println(heightChecker(heights));
	}
	
	public static int heightChecker(int[] heights) {
        int[] sortedHeights = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            sortedHeights[i] = heights[i];
        }
        Arrays.sort(sortedHeights);
        int count = 0;
        for (int i = 0; i < sortedHeights.length; i++) {
            if (sortedHeights[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }

}
