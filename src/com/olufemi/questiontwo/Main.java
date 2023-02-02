package com.olufemi.questiontwo;

import java.util.Scanner;

public class Main {

    private static Scanner scanner2 = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Enter number of rows: ");
//        int rows = scanner2.nextInt();
//        System.out.println("Enter number of columns: ");
//        int columns = scanner2.nextInt();
        Matrix matrix = new Matrix(2, 3).setMatrix();

        Matrix addedMatrix = matrix.addMatrix(new Matrix(2, 3).setMatrix());
        addedMatrix.printMatrix();


//        System.out.println("Enter number of rows: ");
//        int rows2 = scanner2.nextInt();
//        System.out.println("Enter number of columns: ");
//        int columns2 = scanner2.nextInt();
//        Matrix matrix2 = new Matrix(rows2, columns2);


    }

}
