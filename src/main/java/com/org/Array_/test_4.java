package com.org.Array_;

import java.util.Arrays;

public class test_4 {
    public static void main(String[] args) {
        int[][] ints = new test_4().generateMatrix(3);
        for (int[] anInt : ints) {
            System.out.println(Arrays.toString(anInt));
        }
    }

    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int startX=0,startY=0;
        int i=0;
        int j =0;
        int offset =1;
        int count =1;
        int mid = n/2;
        int loop = n/2;
        while (loop-->0){
            i = startX;
            j = startY;

            for (j = startY;j <startY+n-offset;j++){
                arr[i][j] = count++;
            }
            for (i = startX;i <startX+n-offset;i++){
                arr[i][j] = count++;
            }
            for (;j>startY;j--){
                arr[i][j] = count++;
            }
            for (;i>startX;i--){
                arr[i][j] = count++;
            }
            startX++;
            startY++;
            offset+=2;
        }
        if(n % 2 ==1){
            arr[mid][mid] = count;
        }
        return arr;
    }
}
