import java.awt.List;
import java.util.ArrayList;

public class Combinations {
	public static void main(String[] args) {
		System.out.println(combine(6, 3));
	}
	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        backtracking(list, new ArrayList<Integer>(), k, n, 1);
        return list;
    }
    
    public static void backtracking(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> tempList, int k, int n, int start) {
        if (tempList.size() == k) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i <= n; i++) {
                tempList.add(i);
                backtracking(list, tempList, k, n, ++start);
                tempList.remove(tempList.size() - 1);
            }
        }
    } 

}
