class Result {

    public static void miniMaxSum(List<Integer> arr) {

        long sum = 0;
        int min = arr.get(0);
        int max = arr.get(0);

        for(int i = 0; i < 5; i++) {

            int num = arr.get(i);

            sum += num;

            if(num < min) {
                min = num;
            }

            if(num > max) {
                max = num;
            }
        }

        long minSum = sum - max;
        long maxSum = sum - min;

        System.out.println(minSum + " " + maxSum);
    }
}