// Author: Prajwal Gadakh

package com.question3;

public class StringOperations {

	public static void main(String[] args) {
		
		
		
		String s1=new String("asdf@is@asdgasdg");
		String s2=new String("asdf");
		String s3="fasdf";
		String s4="anuja";
		
		System.out.println(s1.charAt(0));				//print the character at given position position
		System.out.println(s3.compareTo(s4));			//comparing two strings
		System.out.println(s1.concat(s2));			//here actual string concat perform
		System.out.println("------------------------");
		System.out.println(s1.indexOf("t"));		//Returns the index within this string.
		System.out.println(s1.replaceAll("rutuasdfsrl","sdffasdf fsadff fasdfg asdlaasfs girl"));	
		
		System.out.println(s1.substring(12));			
		System.out.println(s3.toLowerCase());	//convert upper case letter to lower case
		
		

	}

}