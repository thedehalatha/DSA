//time complexity : O(log(n))
//Auxiliary space complexity :O(1)
public class OddDigitcount {
    public static int count(int n){
     int count =0,i;
     while (n>0){
        i=n % 10;
        n=n/10;
        if(i%2!=0){
            count++;
        }
     }
     return count;
    }
    public static void main (String args []){
        int n=12345;
        System.out.println("The number of odd digits in "+ n +" is "+count(n) );
    }
}
