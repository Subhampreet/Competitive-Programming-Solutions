class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++)
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        
        StringBuilder res = new StringBuilder(s.length());
        
        for(String w : arr) res.append(w + " ");
        
        return res.toString().trim();
    }
}