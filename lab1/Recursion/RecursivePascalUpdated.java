
public class RecursivePascalUpdated{
    public static void printPascal(int n, boolean upsideDown) {
        int[] level = new int[(n/2) + 1];// new array to fill up with value which will be repeated after half way (+1) for unique middle values
        if (upsideDown){
            for (int i = 0; i < (n / 2) + 1; i++){
                level[i] = binom(n,i);                  // store values we are about to print so we can print them again without using repeated calculations
                System.out.print(binom(n,i) + " ");
            }
            if ( n % 2 == 0){
                for (int j = (n / 2) - 1; j >= 0; j--){     // if n is even then the number of components is and there is a unique middle value
                    System.out.print( level[j] + " ");
                }
            }
            if ( n % 2 != 0){
                for (int j = (n / 2); j >= 0; j--){         // if n is odd then number of components is even and we can just copy the firt half
                    System.out.print( level[j] + " ");
                }
            }
            System.out.println();
            if (n > 0) printPascal(n-1, upsideDown);   // recursion after print if upsidedown
        }
        else {
            if (n > 0) printPascal(n - 1, upsideDown); // recursion before print if normal
            for (int i = 0; i < (n / 2) + 1; i++) {
                level[i] = binom(n, i);
                System.out.print(binom(n, i) + " ");
            }
            if (n % 2 == 0) {
                for (int j = (n / 2) - 1; j >= 0; j--) {
                    System.out.print(level[j] + " ");
                }
            }
            if (n % 2 != 0) {
                for (int j = (n / 2); j >= 0; j--) {
                    System.out.print(level[j] + " ");
                }
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
        printPascal(50,true);
    }
    
    
}
