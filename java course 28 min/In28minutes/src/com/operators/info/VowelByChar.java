package com.operators.info;

public class VowelByChar {
 private char vowel;

public VowelByChar(char vowel) {
	super();
	this.vowel = vowel;
}
   public boolean isVowel() {
	   if(vowel =='a' || vowel =='e' ||vowel == 'i' || vowel =='o' ||vowel == 'u')
	return true;
	return false;
	   
   }
   
   public boolean isNumber() {
	   if(vowel > 57 && vowel < 97)
		   return true;
	return false;
	   
   }
   public boolean isAlphabet() {
	   
	   if(vowel>65 && vowel <90)
		   return true;
	   return false;
   }
   
   public static void printLowerCaseAlphabets() {
	   for(char ch = 'a';ch<'z';ch++) {
			 System.out.println(ch);
		 }
   }
   
 public static void printUpperCaseAlphabets() {
  
	 for(char ch = 'A';ch<'Z';ch++) {
		 System.out.println(ch);
	 }
  }
}
