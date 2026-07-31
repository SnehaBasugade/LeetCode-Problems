class Solution:
    def maxSideLength(self, mat, threshold):
        rows, cols = len(mat), len(mat[0])


        prefix = [[0] * (cols + 1) for _ in range(rows + 1)]

        for i in range(1, rows + 1):
            for j in range(1, cols + 1):
                prefix[i][j] = (
                    mat[i - 1][j - 1]
                    + prefix[i - 1][j]
                    + prefix[i][j - 1]
                    - prefix[i - 1][j - 1]
                )

        max_side = 0

        for size in range(1, min(rows, cols) + 1):
            found = False

            for i in range(size, rows + 1):
                for j in range(size, cols + 1):
                    square_sum = (
                        prefix[i][j]
                        - prefix[i - size][j]
                        - prefix[i][j - size]
                        + prefix[i - size][j - size]
                    )

                    if square_sum <= threshold:
                        found = True
                        break

                if found:
                    break

            if found:
                max_side = size
            else:
                break   

        return max_side
