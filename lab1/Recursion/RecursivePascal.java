
public class RecursivePascal{
    public static void printPascal(int n, boolean upsideDown) {
        if (upsideDown){
            for (int i = 0; i <= n; i++){
                System.out.print(binom(n,i) + " ");
            }
            System.out.println();
            if (n > 0){
                printPascal(n-1,upsideDown);
            }
        }
        else{
            if (n > 0) printPascal(n-1,upsideDown);
            for (int i = 0; i <= n; i++){
                System.out.print(binom(n,i) + " ");
            }
            System.out.println();
        }
    }
    
    public static int binom(int n, int k) {
        if (k == 0) return 1; // start with 1
        if (n == k) return 1; // end with 1
        if (n < k) return 0;
        else {
            int leftValue = binom(n-1, k-1); // recursively take value one column up and to the left
            int rightValue = binom(n-1, k); // recursively take value up one column up and to the right
            return leftValue + rightValue;       // add two values and return result
        }
    }
    
    public static void main(String[] args) {
        printPascal(30,false);
    }
    
    
}
