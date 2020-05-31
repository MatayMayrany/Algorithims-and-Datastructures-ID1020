public class scrap {
    public static void main(String[] args) {
        int N = 10;
        int sum = 0;
        for (int i = 1; i < N; i *= 2)
            for (int j = 0; j < N; j++)
                sum++;

        System.out.println(sum);
    }
}

