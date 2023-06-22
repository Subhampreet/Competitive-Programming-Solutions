// Problem URL - https://leetcode.com/problems/reverse-string/description/
// Problem Solution - https://www.youtube.com/watch?v=081zwL7ut04&list=PLzffTJx5aHaRMfFodb4O5yyi6uSA4Q3E0

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        reverseArray(s, 0, n-1);
    }
    static void reverseArray(char[] arr, int start, int end){
        if(start > end) return;
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start+1, end - 1);
    }
}