class Main {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        strs = ["flower","flow","flight"]
        String s="java";
        char[] c=s.toCharArray();
        for(char i:c){
            System.out.println(i);
        }
    }
}

********************************************************************************

class Main {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        for(int i=0;i<strs.length;i++){
         String s=strs[i];
         int a=0;
         System.out.println(s.charAt(a));  //You can get the character at a particular index within a string by invoking the charAt() accessor method. The index of the first character is 0, while the index of the last character is length()-1 .
         
         //System.out.println(s[0]);  - *****error : array required, but String found*****
         int pre=s.length()/2;   // - dividing the string equally - to find the length of the prefix.
         //System.out.println(pre);
       /* char[] c=s.toCharArray();
        for(char k:c){
            //System.out.print(k+" ");
            
        } 
        System.out.println("\n");*/
        }
    }
}
count=0;
for(int r=0;r<strs.length;r++){
for(int i=0,j=1;i<strs.length;i++,j++){
    String s1=strs[i];
    String s2=strs[j];   // first element of the string ok but ... next
    int a=0;
    if(s1.charAt(a)!=s2.charAt(a)){
        System.out.print("");
        break;
    }
    else{
    //for(int k=0;k<) is this else needed?
    count+=1;
    continue;
    }
    
}
}

*******************************************************************************


/*

Yes, if a break statement is used inside an if statement that's within a for loop, and the if condition becomes true, the for loop 
will terminate immediately. The break statement causes the loop to exit prematurely, and program execution continues at the statement
following the loop. If you need to terminate the loop after the if condition in a way that doesn't immediately exit, you can use a return 
statement within the if block (if the loop is part of a method). 
Here's why and how:
Why break terminates the loop:
The break statement is designed to exit the nearest enclosing loop or switch statement. 
When break is encountered within a for loop, it causes the loop to stop executing and control to pass to the statement
immediately following the loop's closing curly brace.

How to terminate the loop conditionally (using return): 
If you need to exit the loop after a specific condition within the if statement, but you don't want to immediately terminate
execution, you can use a return statement within the if block. This is particularly useful if the loop is part of a method. 

*******
class LoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Exiting loop at i = " + i);
                return; // Exit the method, not the loop
            }
            System.out.println("Current value of i: " + i);
        }
        System.out.println("Loop finished.");
    }
}
*******

Explanation:

The for loop iterates from 0 to 9.
Inside the loop, the if statement checks if the value of i is equal to 5.
If i is equal to 5, the code prints a message and then uses return to exit the main method. The loop does not terminate, as break would do.
The method simply returns, and the rest of the code in main is not executed.
If the loop completes without finding i = 5, the final System.out.println message will be printed. 
Important Considerations:
Return vs. Break:
Using return inside the if statement will terminate the entire method, not just the loop. 
If you need to continue execution after the method, this might not be the desired behavior.
Nested Loops:
If you have nested loops, break will only exit the innermost loop, whereas return will exit all encompassing methods. 
In summary, break is for exiting the nearest loop, while return is for exiting the entire method, making return useful
when you need to control the flow of execution beyond the loop. 


*/

//valid paranthesis leetcode

class Main {
    public static void main(String[] args) {
        String s="aa";
        for(int i=0,j=1;i<s.length()-1;i++,j++){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(c1==c2){
                System.out.println("We found a method to solve valid parenthesis problem in leetcode.");
            }
            else{
                System.out.println("logic Fails");
            }
        }
    }
}


class Main {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
         static int ReplaceSpace(String s){
             for(int i=0;i<s.length();i++){
                 char c=s.charAt(i);
                 if(c==' '){
                     s=s.replace(' ',"-");
                 }
                 return s;
             }
         }
         String s1="string one";
         String s2="one string ";
         for(int i=0;i<)
    }
}
