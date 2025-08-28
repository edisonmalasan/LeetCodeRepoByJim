/**
Algorithm:
1. Initialize two pointers: set left = 0 and right = s.length - 1.
2. While left < right, do the following:
3. Swap s[left] and s[right].
4. Increment left by 1.
5. Decrement right by 1.
7. Repeat until the two pointers meet or cross.
*/
    

class Solution {
    public void reverseString(char[] s) {
        if (s.length == 0) return;
        int left = 0;
        int right = s.length - 1;

        while(left <right){
            if (s[left] != s[right]){
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
            }

            left++;
            right--;
        }
    }
}
