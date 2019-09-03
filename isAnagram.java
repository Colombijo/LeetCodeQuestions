import java.util.ArrayList;

public class isAnagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("pillow", "wlilpo"));
	}
	
	public static boolean isAnagram(String s, String t) {
        ArrayList<Character> sList = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            sList.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            if (sList.contains(t.charAt(i))) {
                sList.remove(sList.indexOf(t.charAt(i)));
            }
        }
        if (s.length() != t.length()) {
            return false;
        }
        return sList.size() == 0;
    }
}
