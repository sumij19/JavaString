import java.util.HashSet;

public class RemoveDuplicatecharacter {

	public static void main(String args[]) {
		
		String str = "Welcome to Java1234@#$%";
		str=str.replaceAll("\\s+","")//space
				.replaceAll("\\d+","")//digits
				.replaceAll("\\W+","");//non words
		
		
		HashSet<Character> str1=new HashSet<Character>();
		StringBuilder sb=new StringBuilder();
		
		for (char c:str.toCharArray()) {
			if(!str1.contains(c)) {
				sb.append(c);
				str1.add(c);
				
			}
		}
		
		System.out.println(sb.toString());
	}
}
