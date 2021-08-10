package com.raghu;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int[][] a = new int[20][20];
        int[][] b = new int[20][20];
        int[][] c = new int[20][20];
        int m, n, p, q;
        System.out.println("enter the nuber of rows and column");
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();
        System.out.println("enter number of rows and colums of 2nd matrix");
        p = input.nextInt();
        q = input.nextInt();
        if (n != p) {
            System.out.println("invalid input");
        } else {
            System.out.println("enter elements of matrix");
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    a[i][j] = input.nextInt();
                }
            }


            System.out.println("enter elements of second matrix");
            for (int i = 0; i <= p; i++) {
                for (int j = 0; j <= q; j++) {
                    b[i][j] = input.nextInt();
                }
            }

            System.out.println("the elements are");
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= q; j++) {
                    for (int k = 0; k <= p; k++) {
                        sum =  (a[i][k] + b[k][j]);
                    }
                    c[i][j] = sum;
                    sum = 0;
                }
            }
            System.out.println("the product of the matrix is this");
            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= q; j++) {
                    System.out.println(" " + (c[i][j]));
                }

            }
        }
    }
}
