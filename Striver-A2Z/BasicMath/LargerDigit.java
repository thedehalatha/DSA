//time complexity : O(log10(n))
//space complexity :O(1)
public class Largerdigit {
    public static int larger(int n){
        n=Math.abs(n); // convert negative number to positive 
        int larger=0;
        if(n==0){
            return 0;
        }
        while(n>0){
        int t= n%10;
        if(larger < t){
            larger = t;
        }
        n=n/10;
    }
    return larger;
}
public static void main (String args[]){
    int n=7658;
    System.out.println("The largest Digit in  "+n+" is " +larger(n));
}
}
