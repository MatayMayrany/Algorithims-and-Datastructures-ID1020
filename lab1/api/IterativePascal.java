public class IterativePascal extends ErrorPascal implements Pascal {
    static int array[][];
    public void printPascal(int n, boolean upsideDown) {
        ErrorPascal(n);
        array = new int[n+1][n+1];
        if(upsideDown){
            for(int i = n; i >= 0; i--){
                System.out.println();
                for(int j = 0; j <= i; j++){
                    System.out.print(binom(i,j) + " ");
                }
            }
            System.out.println();
        }
        else{
            for(int i = 0; i <= n; i++){
                System.out.println();
                for(int j = 0; j <= i; j++){
                    System.out.print(binom(i,j) + " ");
                }
            }
            System.out.println();
        }
    }

    public int binom(int n, int k) {
        array[0][0] = 1;
        array[1][0] = 1;
        array[1][1] = 1;
        if (k>0) {
            if (array[n][k] == array[n - 1][k - 1] + array[n - 1][k]) return array[n][k];
        }
        for (int i = 2; i <= n; i++) {
            array[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                if(j==i){
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
        }
        return array[n][k];
    }

}
