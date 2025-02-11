import java.util.ArrayList;

public class CountVowels {

	public static void main(String[] args) {

		String str="WelcOme";
		str=str.toLowerCase();
		int count=0;
		
		//char c[]=str.toCharArray();
		
		/*
		 * for(char c:str.toCharArray()) { System.out.println("aeiouAEIOU".indexOf(c));
		 * if("aeiouAEIOU".indexOf(c)==1) { count++; } } System.out.println(count);
		 */
		
		
		/*
		 * for (int i=0;i<str.length();i++) {
		 * if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=
		 * ='o'||str.charAt(i)=='u') count++; }
		 */
		
		ArrayList<Character> vowel=new ArrayList<Character>();
		vowel.add('a');vowel.add('e');vowel.add('i');vowel.add('o');vowel.add('u');
		
		/*
		 * for (int i=0;i<str.length();i++) { if(vowel.contains(str.charAt(i))){
		 * 
		 * count++; } }
		 */
		
		for(char c:str.toCharArray()) {
			if(vowel.contains(c)) {

				count++; 
			}
		}
		
		
		System.out.println(count);
	}

}
