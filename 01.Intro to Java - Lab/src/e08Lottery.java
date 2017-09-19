public class e08Lottery {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10 ; j++) {
                for (int k = j; k <= 10 ; k++) {
                    if((i != j) && (j != k) && (i != k)){
                        System.out.printf("%d %d %d\n", i, j, k);
                    }
                }
            }
        }
    }
}
