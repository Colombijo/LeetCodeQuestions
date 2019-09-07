import java.util.HashSet;
import java.util.Set;

public class RepeatedNTimes {
	
	public static void main(String[] args) {
		int[] array = {2, 1, 2, 5, 3, 2};
		System.out.println(repeatedNTimes(array));
		
	}
	
	public static int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                return A[i];
            }
            set.add(A[i]);
        }
        return A[A.length - 1];
        
    }

}
