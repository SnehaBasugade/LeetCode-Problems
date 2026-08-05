class Result {

    public static void plusMinus(List<Integer> arr) {

        int positive = 0;
        int negative = 0;
        int zero = 0;

        int n = arr.size();

        for (int i = 0; i < n; i++) {

            if (arr.get(i) > 0) {
                positive++;
            }
            else if (arr.get(i) < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }

        System.out.printf("%.6f%n", (double) positive / n);
        System.out.printf("%.6f%n", (double) negative / n);
        System.out.printf("%.6f%n", (double) zero / n);
    }
}