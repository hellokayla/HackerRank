import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        
        
        int[] rotatedArray = new int[a.length];
        int tempIndex = 0; 
        
        // Take each index subtract the d length
        for (int i = 0; i < a.length; i++) {
            // if the number is negative, than have it wrap around
            if ((i-k) < 0) {
                tempIndex = a.length + (i-k);
                rotatedArray[tempIndex] = a[i];
            }
            else {
                rotatedArray[i-k] = a[i];
            }
            
        }
        /*for (int i=0; i<rotatedArray.length; i++) {
            
            System.out.println(rotatedArray[i]);
        }*/
        
        return rotatedArray;
      
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
