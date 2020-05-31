import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter level: ");
        int n = scanner.nextInt();

        System.out.println("Upside down? (enter true for upside down or false for normal");
        boolean bn = scanner.nextBoolean();

        System.out.println();

        System.out.println("IterativePascal (1) RecursivePascal (2):");
        int chooser = scanner.nextInt();
        if (chooser == 1){
            new IterativePascal().printPascal(n, bn);
            System.out.println();
        }
        if (chooser == 2){
            new RecursivePascalUpdated().printPascal(n, bn);
            System.out.println();
        }
    }
}

