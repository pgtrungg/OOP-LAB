package OOP_LAB1;

import java.util.Scanner;
public class AddTwoMatrix {
    public static void main(String[] args)
    {
        int m, n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc ma tran m x n: ");
        m = sc.nextInt();
        n = sc.nextInt();

        int[][] matrix_1 = new int[m][n];
        int[][] matrix_2 = new int[m][n];
        int[][] res = new int[m][n];

        System.out.println("Nhap ma tran thu nhat:");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix_1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Nhap ma tran thu 2:");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix_2[i][j] = sc.nextInt();
            }
        }

        //Calculate
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                res[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }

        System.out.println("Tong cua 2 ma tran: ");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}