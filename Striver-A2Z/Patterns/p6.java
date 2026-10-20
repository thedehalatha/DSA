//time complexity : O(n^2)
//Auxiliary space complexity :O(1)
public class p6 {
    public static void pattern5(int n) {
       
        for (int i = n; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j );
            }
            
            System.out.println();
        }
    }
    public static void main (String args []){
        int n=5;
        pattern5(n);
    }


}
