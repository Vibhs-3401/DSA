/*
Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.

Input Format:
    First and only argument of input contains an integer array A
Output Format:
    return a single integer denoting minimum xor value
Constraints:
2 <= N <= 100 000  
0 <= A[i] <= 1 000 000 000
For Examples :
Example Input 1:
    A = [0, 2, 5, 7]
Example Output 1:
    2
Explanation:
    0 xor 2 = 2
Example Input 2:
    A = [0, 4, 7, 9]
Example Output 2:
    3
*/

import java.util.*;
public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        int min_xor = Integer.MAX_VALUE;
        Collections.sort(A);
        int s = A.size();
        for(int i=0; i<s-1; i++) {
            min_xor = Math.min(min_xor, A.get(i)^A.get(i+1));
        }
        return min_xor;
    }
}
