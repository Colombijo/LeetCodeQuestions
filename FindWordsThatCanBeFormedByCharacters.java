import java.util.ArrayList;

public class FindWordsThatCanBeFormedByCharacters {
	
	public static void main(String[] args) {
		String[] words = {"cat","bt","hat","tree"};
		String chars = "atach";
		System.out.println(countCharacters(words, chars));
		
	}
	
	public static int countCharacters(String[] words, String chars) {
		ArrayList<Character> dict = new ArrayList<>();
		for (int i = 0; i < chars.length(); i++) {
			dict.add(chars.charAt(i));
		}
		int sum = 0;
		boolean isValid = true;
		for (int i = 0; i < words.length; i++) { 
			isValid = true;
			ArrayList<Character> temp = new ArrayList<>(dict);
			for (int j = 0; j < words[i].length(); j++) {
				if (temp.contains(words[i].charAt(j))) {
					int index = temp.indexOf(words[i].charAt(j));
					temp.remove(index);
				} else {
					isValid = false;
					continue;
				}
			}
			if (isValid) {
				sum += words[i].length();
			}
		}
		return sum;
	}
	
}
