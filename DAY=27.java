class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[][] prefix = new int[rows + 1][cols + 1];

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                prefix[i][j] = mat[i - 1][j - 1]
                             + prefix[i - 1][j]
                             + prefix[i][j - 1]
                             - prefix[i - 1][j - 1];
            }
        }

        int maxSide = 0;

        for (int size = 1; size <= Math.min(rows, cols); size++) {
            boolean found = false;

            for (int i = size; i <= rows; i++) {
                for (int j = size; j <= cols; j++) {
                    int sum = prefix[i][j]
                            - prefix[i - size][j]
                            - prefix[i][j - size]
                            + prefix[i - size][j - size];

                    if (sum <= threshold) {
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }

            if (found) {
                maxSide = size;
            } else {
                break;   
            }
        }

        return maxSide;
    }
}