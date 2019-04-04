import java.util.*;
import java.lang.*;
import java.io.*;

//using count
class Sort012UsingCount {
    
    public static void solve(int[] arr, int sizeOfArray) {
        
        int count0 = 0, count1 = 0 , count2 = 0;
        
        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] == 0)
                count0++;
            if (arr[i] == 1)
                count1++;
            if (arr[i] == 2)
                count2++;
        }
        
        for (int i = 0 ; i < count0; i++)
            arr[i] = 0;
        for (int i = count0 ; i < (count0+count1); i++)
            arr[i] = 1;
        for (int i = (count0+count1); i < sizeOfArray; i++)
            arr[i] = 2;
            
        printSolution(arr, sizeOfArray);
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