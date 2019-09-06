
public class MonotonicArray {
	
    public static void main(String[] args) {
    	int[] array = {1, 2, 2, 3};
	System.out.println(isMonotonic(array));
    }

    public static boolean isMonotonic(int[] A) {
	boolean decreasing = true;
	boolean increasing = true;
	for (int i = 1; i < A.length; i++) {
	    if (A[i] > A[i-1]) {
		decreasing = false;
	    } else if (A[i] < A[i-1]) {
		increasing = false;
	    }
	}
	
	return (decreasing || increasing);
    }

}
