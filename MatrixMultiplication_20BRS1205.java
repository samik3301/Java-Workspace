import java.util.Scanner;

public class MatrixMultiplication_20BRS1205 {
        public static void main(String[] args) {
            int[][] a = new int[3][3];
            int[][] b = new int[3][3];
            int[][] c = new int[3][3];

            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number of rows of matrix 1: ");
            int r1 = s.nextInt();
            System.out.println("Enter the number of columns of matrix 1: ");
            int c1 = s.nextInt();
            System.out.println("Enter the number of rows of matrix 2: ");
            int r2 = s.nextInt();
            System.out.println("Enter the number of columns of matrix 2: ");
            int c2 = s.nextInt();
            System.out.println("Enter elements for matrix 1: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = s.nextInt();
                }
            }

            System.out.println("Matrix 1 is: ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }


            System.out.println("Enter elements for matrix 2: ");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = s.nextInt();
                }
            }
            System.out.println("Matrix 2 is: ");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Matrix Multiplication is: ");

            if(r1==c2 & r2==c1){
                for(int i=0;i<r1;i++){
                    for(int j=0;j<c2;j++){
                        c[i][j]=0;
                        for(int k=0;k<c1;k++){
                            c[i][j]=c[i][j]+a[i][k]*b[k][j];
                        }
                        System.out.print(c[i][j]+" ");
                    }
                    System.out.println();
                }
            }
            else{
                System.out.println("Matrix multiplication invalid as number of rows of matrix1 is not equal to the number of column of matrix 2.");
            }


        }
}
