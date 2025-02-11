import java.util.Arrays;

public class ReverseWordsInSentence {
	public static void main(String[] args) {
	      String str= "Test the product";
	      String arr[]=str.split(" ");
	      String rev="";
	      for(int i=0;i<arr.length;i++)
	      {
				/*
				 * if(i==1) { for(int j=arr[i].length()-1;j>=0;j--) {
				 * rev=rev+(arr[i].charAt(j)); } arr[i]=arr[i].replaceAll(arr[i], rev);
				 * 
				 * }
				 */
	    	  //if(i==2) 
	    	  {
	          for (int j=arr[i].length()-1;j>=0;j--) { //arr[i].length() is a String so use length()
	        	  rev=rev+(arr[i].charAt(j));
	          }
	          rev = rev + " ";
	    	  //arr[i]=arr[i].replaceAll(arr[i], rev);
	    	  }
	          
	      }System.out.println(rev);
	   } 
	}