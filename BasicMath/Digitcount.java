//time complexity : 
//space complexity :
public class Digitcount{
    public static int count(int n){
        int count=0;

        if(n==0){ //for optimal approcah 
            return 1;
        }
        if(n<0){
            n=-n;   // handles negitive numbers 
        }
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }

public static void main (String args[]){
int n=1234;
System.out.println("Digit count for "+ n +" is " +count(n));

}
}