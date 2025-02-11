
public class ReverseString {

	public static void main(String[] args) {
		
		String str="welcome";
		String rev="";
		
		char s[]=str.toCharArray();
		for(int i=s.length-1;i>=0;i--) {
			
			rev=rev+s[i];
			
		}
		
		System.out.println(rev);
		
		//method 2
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString());
		
	}

}
