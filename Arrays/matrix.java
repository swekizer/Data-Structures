package Arrays;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {


        /*
                1 2 3
                4 5 6
                7 8 9
          
         */





        //2D Arrays
        //2D arrays are used to store multiple values of same type in a table format.

        //Syntax
        //datatype[][] arrayName = new datatype[rowSize][columnSize];
        //datatype[][] arrayName = {{value1, value2, value3}, {value4, value5, value6}, {value7, value8, value9}};
        //datatype[][] arrayName = new datatype[rowSize][columnSize]{{value1, value2, value3}, {value4, value5, value6}, {value7, value8, value9}};
        
        //Example
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = new int[3][3];

        //int[][] matrix3 = {{1, 2, 3}, {3}, {5, 6, 4}, {7, 8}};


        //Length of a 2D array
        System.out.println(matrix.length); //3 //no of rows
        

        //Accessing elements of a 2D array
        //arrayName[rowIndex][columnIndex]
        //Example
        System.out.println(matrix[0][0]); //1
        System.out.println(matrix[0][1]); //2
        System.out.println(matrix[0][2]); //3
        System.out.println(matrix[1][0]); //4
        System.out.println(matrix[1][1]); //5
        System.out.println(matrix[1][2]); //6
        System.out.println(matrix[2][0]); //7
        System.out.println(matrix[2][1]); //8
        System.out.println(matrix[2][2]); //9

        //Updating elements of a 2D array
        matrix[0][0] = 100;
        System.out.println(matrix[0][0]); //100

        //Printing a 2D array
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }

        }



        //Input 
        //int[][] matrix2 = new int[3][3];
        //Generally use i and j as loop variables for 2D arrays.
        try (Scanner sc = new Scanner(System.in)) {
            for(int row=0; row<matrix2.length; row++){
                for(int col=0; col<matrix2[row].length; col++){
                    matrix2[row][col] = sc.nextInt();
                }
            }

            //Printing a 2D array
            for(int i=0; i<matrix2.length; i++){
                for(int j=0; j<matrix2[i].length; j++){
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();//for new line
            }

            //Use toString() method to print a 2D array
            for(int i=0; i<matrix2.length; i++){
                System.out.println(java.util.Arrays.toString(matrix2[i]));
            }

            //Or
            System.out.println(java.util.Arrays.deepToString(matrix2));

            //Use Enhanced for loop to print a 2D array
            for(int[] arr : matrix2){
                System.out.println(java.util.Arrays.toString(arr));
            }
        }
    }
}
