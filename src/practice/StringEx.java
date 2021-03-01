package practice;

public class StringEx {
	
	public static void main(String args[]) {
		
		StringEx app = new StringEx();
		app.start();

	}
	
	void start() {
		String str = "ana";
		if(isPalindrome(str)) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}
		
		int countV = countVowels(str);
		System.out.println(countV);
		
		System.out.println(duplicateVowel(str));
		
	}
	
	String duplicateVowel(String str) {
		String duplicate = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				duplicate += str.charAt(i);
			}
			duplicate += str.charAt(i);
		}
		return duplicate;
	}
	
	int countVowels(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				count++;
			}
		}
		return count;
	}
	
	boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
			
		}
		return true;
		
	}
	
}
