class Solution {
    public boolean isPalindrome(int x) {
        int rev=0,ld;
        
        int temp=x;
        while(x>0){
            ld=x%10;
            rev = rev * 10+ld;
            x=x/10;
        }
        return temp==rev;

    }
}