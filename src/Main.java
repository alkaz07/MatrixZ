import java.util.Random;

public class Main {

    static final int N = 10;
    public static void main(String[] args) {
        int[][] matr = new int[N][N];
        fillRandomMatrix(matr);
        printMatrix(matr);

    }

    private static void fillRandomMatrix(int[][] matrix) {
        Random ran = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ran.nextInt(99) ;
            }
        }
    }

    public static void printMatrix( int matrix[][]) {
        printStar();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
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