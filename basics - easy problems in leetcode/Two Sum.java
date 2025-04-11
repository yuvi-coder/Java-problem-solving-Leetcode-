  // ****************NOTES***************** \\

/*  1. looping logic improved - increment in second loop variable
    2. test case inputs are given through the class name as parameter no need to write code to get the inputs.
    3. printing the complete array - array size logic clear <[10000]>.
    4. return statement explored. */



//***************** Two Sum leetcode problem solution without using built-in functions or intermedicate java concepts like hashing *********************

import java.util.*;
import java.io.*;
public class Solution{
    public int[] twoSum(int[] nums, int target){
      //Scanner sc=new Scanner(System.in);
      int len=nums.length;
      //int[] arr=new int[len];
      //int t=sc.nextInt();
      int[] result_arr=new int[2];
      //for(int i=0;i<arr.length-1;i++){                // *****************commented lines are tried new logic lines***************
       // arr[i]=sc.nextInt();               
      //}
      //boolean n=true;                                
      //int j;
      for(int i=0;i<len;i++){          
        for(int j=i+1;j<len;j++){    
            if(nums[i]+nums[j]==target){            
                result_arr[0]=i;
                result_arr[1]=j;
                //n=true;
                //break;
            }
        }
        //if(n==true){
            //break;
       // }
      }
      return result_arr;
    }
}

//****************************************************Reference code from stackover flow************************************************************

/*public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
            int len = numbers.length;

        int[] result = new int[2] ;
        int number1 = 0;
        int sum = 0;

        for (int i = 0; i < len; i++) {
            number1 = numbers[i];

            for(int j = i+1; j < len; j++) // this logic is nice - i is a value the j should be the next value of i then don't declare sparatly just increment with i.
            {

                sum = number1+numbers[j];       
                if(sum == target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }
        
        }
        return result;
    }
}*/
