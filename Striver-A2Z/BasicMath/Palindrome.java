// Time complexity: O(log10 n)
// Space complexity: O(1)
public class Palindrome {
    public static boolean palindrome(int n){
        int rev=0,rem;
        int temp=n;
        while(n>0){
            rem = n % 10;
            rev = rev*10+rem;
            n=n/10;
        }
        if(rev==temp){
            return true;
        }else{
            return false;
        }
    }  
    public static void main (String args []){
        int n=121;
        System.out.println(palindrome(n));
    }
}
