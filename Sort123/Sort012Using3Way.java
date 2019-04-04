package Sort123;

import java.util.*;
import java.lang.*;
import java.io.*;

//Dutch National Flag Algorithm, or 3-way Partitioning 
class Sort012Using3Way {
    
    public static void solve(int[] a, int sizeOfArray) {
        
        int low = 0;
        int high = sizeOfArray - 1;
        int mid = 0, temp = 0;
        
        while (mid <= high) {
            
            switch (a[mid]) {
                
                case 0: 
                    {
                        temp = a[low];
                        a[low] = a[mid];
                        a[mid] = temp;
                        low++;
                        mid++;
                        break;
                    }
                case 1:
                    {
                        mid++;
                        break;
                    }
                case 2: 
                    {
                        temp = a[high];
                        a[high] = a[mid];
                        a[mid] = temp;
                        high--;
                        break;
                    }
            }
        }
            
        printSolution(a, sizeOfArray);
    }
    
    //To print the solution 
    public static void printSolution(int[] arr, int n) {
        
            // Using string buffer to append each output in a string 
            StringBuffer sb = new StringBuffer(); 
            for (int i = 0; i < n; i++) 
                sb.append(arr[i] + " "); 
  
            // finally printing the string 
            System.out.println(sb);
    }
    
    // Driver Method
    public static void main (String[] args) throws java.lang.Exception 
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int noOfTestCases = Integer.parseInt(br.readLine()); 

        
        while(noOfTestCases-- > 0) {
            int sizeOfArray = Integer.parseInt(br.readLine()); 
            
            int[] arr = new int[sizeOfArray];
            
            // to read multiple integers line 
            String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
            
            for (int i = 0; i < sizeOfArray; i++) {
                arr[i] = Integer.parseInt(strs[i]); 
            }
            solve(arr, sizeOfArray); 
        }  
            
    }
    
    
}