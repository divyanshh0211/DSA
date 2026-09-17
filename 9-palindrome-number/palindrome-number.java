class Solution {
    public boolean isPalindrome(int x) {
        int sign = 1;
    
        int orginal = x;
        int rev = 0;
        while(x>0){
            int last_digit = x%10;
            rev = (rev*10) + last_digit;
            x = x/10;

        }
        if(orginal == rev){
            return true;
        } else return false;
    }
}