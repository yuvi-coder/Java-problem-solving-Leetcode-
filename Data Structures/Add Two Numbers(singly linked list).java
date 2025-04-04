// java consider everything as string - statement correct ? - research - learn
import java.util.*;
import java.io.*;
class Main {
    // java methods == functions (repeatation of same task for different parameters)
    static int mylogic(int[] input_list){  // [ int - void ] - methods
        int[] temp=new int[input_list.length]; // outofIndexing error - logic - known
        int len=input_list.length- 1;
        for(int i=len,j=0;i>=0;j++,i--){   //two variable declaration and operation - known
            temp[j]=input_list[i];
        }
        int result=0;
        for (int num : temp) {
            result = result * 10 + num; // Shift digits left and add new number - only for single digit numbers { note }
        }
        //System.out.println(Arrays.toString(temp)); - how to print a array in java 
       // System.out.println(result);
       return result; 
       
    }
    
    public static void main(String[] args) {  // - comment 01
       int[] arr1={2,4,6,8};  // array != list in java - learn?
       int[] arr2={3,5,7,9};
       int r1=mylogic(arr1);  //method return value is the variable value here - accessing method variable values outside or in the main function.
       int r2=mylogic(arr2);
       System.out.println("reversed addition of arr1 " +Arrays.toString(arr1)+" and arr2 "+Arrays.toString(arr2));
       System.out.println(r1+r2);
    }
}


// Output : 
/* reversed addition of arr1 [2, 4, 6, 8] and arr2 [3, 5, 7, 9]
18395 */


/* 
1. reversing a array - 
2. 





import java.util.*;
import java.io.*;
class Main {
    static int mylogic(int[] input_list){
        int[] temp=new int[input_list.length];
        int len=input_list.length- 1;
        for(int i=len,j=0;i>=0;j++,i--){
            temp[j]=input_list[i];
        }
        int result=0;
        for (int num : temp) {
            result = result * 10 + num; // Shift digits left and add new number
        }
        //System.out.println(Arrays.toString(temp));
       // System.out.println(result);
       return result;
       
    }
    
    public static void main(String[] args) {
       int[] arr1={2,4,6,8};
       int[] arr2={3,5,7,9};
       int r1=mylogic(arr1);
       int r2=mylogic(arr2);
       System.out.println(r1+r2);
    }
}
*/
