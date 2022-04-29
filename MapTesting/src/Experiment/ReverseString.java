package Experiment;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String tobeReversed = "AYERHS";
		char[] arr = tobeReversed.toCharArray();
		int length = arr.length;
		String reversed ="";
		for(int i=length-1;i>=0;i--) {
			reversed+=arr[i];
		}
		
	    System.out.println("Reversed string is : "+reversed);
	}
	

}
