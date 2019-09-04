
public class DistributeCandiesToPeople {
	
	public static void main(String[] args) {
		int[] array = distributeCandies(7, 4);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
    public static int[] distributeCandies(int candies, int num_people) {
        int[] array = new int[num_people];
        int remaining = candies;
        int count = 1;
        int index = 0;
        while ((remaining - count) >= 0) {
            array[index] += count;
            remaining = remaining - count;
            count++;
            index++;
            if (index == num_people) {
                index = 0;
            }
        } 
        array[index] += remaining;
        return array;
        
    }

}
