// ************************************ problem logic ***********************************8
  
// converting (x) to string - coverting the string (x) to new char array (r)- reversing the char array(r) - converting the char array to string (str) - comparing both the strings ( (d) - (str) )

  
import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        String d=String.valueOf(x);   // coverting the given interger as string
        char[] c_d=d.toCharArray();   // then coverting the string as character array   - we can also do this in one line but we need to compare the strings after reversing the given input as strings
		int index=c_d.length;
		char[] r= new char[index];
		for(int i=0,j=index-1;i<index;i++,j--){
		    r[i]=c_d[j];
		}
		//int number = Integer.parseInt(new String(r)); - ****** // if we compare the given interger and the converted integer we get error that we cannot the string minus ( - ) into a integer.
		String str = String.valueOf(r);
		//int number = Integer.parseInt(str);
        boolean result;
		if(d.equals(str)){
		    result=true;
		}
		else{
		    result=false;
		}
        return result;
		
    }
}



//  ***********************************************  Same code compiled and tested in other compiler  ***************************************************************

/*import java.util.*;
public class Main {
	public static void main(String[] args) {
		//int n=1467551;
		char[] d=String.valueOf(x).toCharArray();
		int index=d.length;
		char[] r= new char[index];                              
		for(int i=0,j=index-1;i<index;i++,j--){
		    r[i]=d[j];
		}
		int number = Integer.parseInt(new String(r));
		//String str = String.valueOf(r);
		//int number = Integer.parseInt(str);
		if(n==number){
		    System.out.print("true");
		}
		else{
		    System.out.print("false");
		}
		
		//System.out.print(Arrays.toString(r));
		boolean result=Arrays.equals(d,r);
		if(result=true){
		    System.out.print("Given integer is a Palindrome!");
		}
		else{
		    System.out.print("Given integer is not a Palindrome!");
		}
	}
    */
