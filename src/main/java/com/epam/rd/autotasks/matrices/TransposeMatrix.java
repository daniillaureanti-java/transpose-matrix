package com.epam.rd.autotasks.matrices;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] array = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};

        System.out.println(Arrays.deepToString(transpose(array)));
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] array = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = matrix[j][i];
            }
        }

        return array;
    }
}
