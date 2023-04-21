public class Main {
    public static void main(String[] args) {


    }

    public static void printMatrix( int matrix[][]) {
        printStar();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j]+" ");
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