package com.olufemi.questiontwo;

import java.util.Scanner;

public class Matrix {

    private int rows;
    private int columns;

    private int[][] elements;
;
    private Scanner scanner = new Scanner(System.in);

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        elements = new int[this.rows][this.columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setElements(int i, int j, int value){
        this.elements[i][j] = value;
    }

    public Matrix setMatrix(){
        System.out.println("Enter the values for this matrix:");
        for (int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){
                System.out.println("Enter a value for element "+i+","+j+": ");
                setElements(i, j, scanner.nextInt());
            }
        }
        System.out.println("\n\n");
        return this;
    }

    public void printMatrix(){
        System.out.println("The value of the elements in this matrix are: \n");
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.columns; j++){
                System.out.println(i+","+j+": "+this.elements[i][j]);
            }
        }
        System.out.println("\n\n");
    }

    public Matrix addMatrix(Matrix other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            System.out.println("Matrices cannot be added");
            return null;
        }
        Matrix result = new Matrix(this.rows, this.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
            }
        }
        return result;
    }

}
