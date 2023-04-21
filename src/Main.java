import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matr = new int[10][10];
        fillRandomMatrix(matr);
        printMatrix(matr);

    }

    private static void fillRandomMatrix(int[][] matrix) {
        Random ran = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = ran.nextInt(10) + 1;
            }
        }
    }

    public static void printMatrix( int matrix[][]) {
        printStar();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //System.out.print(matrix[i][j]+" ");
                System.out.printf("%3s", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void printStar () {
        System.out.println();
        System.out.println("*****************************************");
        System.out.println();
    }
}