//time complexity :O(log(n));
//Space complexity:O(1)
public class Reversenum {
    public static int reverse(int n){
    int rev =0,rem;
    while(n>0){
        rem = n%10;
        rev = rev * 10 + rem;
        n=n/10;
    }
    return rev;
}
public static void main (String args []){
    int n=1234;
    System.out.println(reverse(n));
}
}
