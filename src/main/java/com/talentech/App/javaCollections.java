package com.talentech.App;

public class javaCollections {
	
	public void reverseArray(){
		int revArray[] = {8, 4, 1, 9, 6};
		
		int arrayLen = revArray.length;
		System.out.println("Length of the Array is: "+arrayLen);
		
		for(int i=0; i<arrayLen/2; i++){
			int temp = revArray[i];
			revArray[i] = revArray[arrayLen-1-i];
			revArray[arrayLen-1-i] = temp;
		}//end of for
		System.out.println("Reversed Array:");
		for (int x=0;x<=arrayLen-1;x++){
			System.out.print(revArray[x]);
		}
		System.out.println();
	}//end of reverseArray
	
	public void reverseString(){
		String s = "TalenTech";
		int sLen = s.length();
		for (int i=sLen-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
	}

}//end of class javaCollections
