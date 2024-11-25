/*
The program must acces* an array Of integers Of Size N and two integers K, T as the input. The integers in
the given array are always sorted in ascending order. The program must insert T integers based on the
following conditions.
- The program must the sum of integers present the ISt subarray of size K. Then the must
insert the sum in the sorted array so that all integers in the array in sorted order.
* Then the program must find the sum of integers present in ttE 2nd subarray of size K. Then the program
must insert the sum in the sorted array SO that all htegers in the array in sorted order.
- Similarly, the program must modify the sorted array by inserting T integers using the sum of subarrays.
Finalty. the program must print the integers in modified sorted array as the output.

Input:
5 3 2
2 3 6 10 15

Output:
2 3 6 10 11 15 19
T = 1, the sum of integers in the first subarray of size 3 iS 11 (2 + 3 + 6).
After inserting 11 in the sorted array. the array becomes 2 3 6 10 11 15.
T = 2, the sum ot integers in the second subarray of size 3 is 19 (3 + 6 + 1O).
After inserting 19 in the sorted array, the array becomes 2 3 6 10 11 15 19.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arrSize = sc.nextInt();
		int terms = sc.nextInt();
		int arr[] = new int[N+terms];
		sc.nextLine();
		for(int i = 0 ; i< N ; i++){
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int index = terms;
        for(int i = 0 ; i < terms ; i++){
            int sum = 0;
            for(int j = index; j < index+arrSize ; j++){
                sum+=arr[j];
            }
            arr[0] = sum;
            Arrays.sort(arr);
        }
        for(int i : arr){
            System.out.printf("%d ",i);
        }

	}
}