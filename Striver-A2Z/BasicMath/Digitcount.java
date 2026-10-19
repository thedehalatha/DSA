//time complexity : O(log₁₀ n)
//Auxiliary space complexity :O(n)
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

/*optimal apprach 
class solution{
public int countdigit(int n){
int count;
count = (int)(Math.log10(n)+1);
return count;
}
}*/