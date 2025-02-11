
public class ReverseSinglenameInsentence {

	public static void main(String[] args) {
		
		String str = "this is Aysha's java code";
		
		String afterSplit[] = str.split(" ");
		String revName="";
		
		for (int i=0;i<afterSplit.length;i++) {
			
			if (i==2) {
				char revString[] = afterSplit[i].toCharArray();
				for (int j = revString.length-1;j>=0;j--) {
				revName = revName + revString[j];
				}
				afterSplit[i]=afterSplit[i].replaceAll(afterSplit[i], revName);
			}
					
		}
		System.out.println(String.join(" ", afterSplit));
		
	}

}

