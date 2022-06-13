/*
* You are given an array A of size N. You need to print elements of A in alternate order (starting from index 0).

Example 1:

Input:
N = 4
A[] = {1, 2, 3, 4}
Output:
1 3
Example 2:

Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
1 3 5
Your Task:
* */

import java.util.*;
public class alternateElement {

   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       int arr[] = new int[n];

       for(int j=0;j<n;j++){
           arr[j] = sc.nextInt();
       }

       for(int i=0;i<n;i=i+2){
           System.out.print(arr[i]+" ");
       }
   }

}
