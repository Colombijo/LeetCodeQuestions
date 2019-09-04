import java.util.ArrayList;

public class SortArrayByParity {
	
	public static void main(String[] args) {
		int[] A = {3, 1, 2, 4};
		int[] answer = sortArrayByParity(A);
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
	
	public static int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();       
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                even.add(A[i]);
            } else {
                odd.add(A[i]);
            }
        }
        for (int i = 0; i < even.size(); i++) {
            A[i] = even.get(i);
        }
        for (int i = even.size(); i < odd.size() + even.size(); i++) {
            A[i] = odd.get(i - even.size());
        }
        return A;
    }

}
