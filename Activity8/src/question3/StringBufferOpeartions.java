// Author: Prajwal Gadakh

package question3;

public class StringBufferOperations {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("asdf ");
		System.out.println(s);
		
		System.out.println(s.append("asdfsadf "));		//adding the string at end of the string
			
		System.out.println(s.insert(432,"asdfsdfasdfl"));		//inserting the characters
		
		System.out.println(s.reverse());		//reversing the characters
		
		s.replace(42, 24, " asdfwe");  //replacing the characters
		
		
	}

}