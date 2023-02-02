package com.olufemi.questiontwo;


import java.util.Scanner;

public class Main {

    private static Scanner scanner2 = new Scanner(System.in);

    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 3).setMatrix();

//        Matrix addedMatrix = matrix.addMatrix(new Matrix(2, 2).setMatrix());
//        addedMatrix.printMatrix();

        Matrix multipliedMatrix = matrix.multiply(new Matrix(3, 2).setMatrix());
        multipliedMatrix.printMatrix();


    }

}
