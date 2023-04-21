import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

        sortMatrix(matr);
    }

    private static void fillRandomMatrix(int[][] matrix) {
        Random ran = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ran.nextInt(49) ;
            }
        }
    }

    public static void sortMatrix (int num [][]){
        //ArrayList<Integer> array = new ArrayList<Integer>();
        int[] arr = new int[num.length*num[0].length];

        for (int i = 0, k=0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
               // array.add(num [i][j]);
                arr[k]= num[i][j];
                k++;
            }
        }
       // Collections.sort(array);
        Arrays.sort(arr);
       // System.out.println(array);
       // System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < array.size(); i++) {
//            System.out.print(array.get(i) + " ");
//        }
//
        int k = 0;
        int[][] num1 = new int[10][10];
        for (int i = 9; i >= 0 ; i--) {
            if(i%2 == 0)
            {
                for (int j = 0; j < 10 ; j++) {
                    //num1[i][j] = array.get(k);
                    num1[i][j] = arr[k];
                    k++;
                }
            }
            else
            {
                for (int j = 9; j >= 0; j--) {
                    //num1[i][j] = array.get(k);
                    num1[i][j] = arr[k];
                    k++;
                }
            }
        }
        printMatrix(num1);
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
        // если такая строка матрицы, то каким должен быть  ответ?
        // 6 27 42 42 46  3  3  3 15  7
        // сейчас res[i] = 4
        return res;
    }


    public static void sortMatrixSpiral (int num [][]){
        //построить массив из всех элементов матрицы
        //отсортировать массив
        //перезаполнить матрицу по спирали

    }
}