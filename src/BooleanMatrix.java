import java.util.Scanner;

public class BooleanMatrix {
    public static void BooleanMatrixProblem(int[][] mat, int m, int n) {
        for (int i = 0; i < m; i++) {
            boolean hasOne = false;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    hasOne = true;
                    break;
                }
            }
            if (hasOne) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (!scanner.hasNextInt()) return;
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[][] mat = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (scanner.hasNextInt()) {
                        mat[i][j] = scanner.nextInt();
                    }
                }
            }

            BooleanMatrixProblem(mat, m, n);

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j] + (j == n - 1 ? "" : " "));
                }
                System.out.println();
            }
        }
    }
}
