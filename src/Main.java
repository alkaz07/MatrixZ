import java.util.Arrays;
import java.util.Random;

public class Main {

    static final int N = 10;
    public static void main(String[] args) {
        int[][] matr = new int[N][N];
        fillRandomMatrix(matr);
        printMatrix(matr);
        printStar();
        int[] counts = countRepeatsInLines(matr);
        System.out.println(Arrays.toString(counts));
    }

    private static void fillRandomMatrix(int[][] matrix) {
        Random ran = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ran.nextInt(49) ;
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

    public static int[] countRepeatsInLines(int matrix[][]){
        int[] res = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = j+1; k < matrix[i].length; k++) {
                    if (matrix[i][j] == matrix[i][k])
                        res[i]++;
                }
            }
        }


        return res;
    }
}