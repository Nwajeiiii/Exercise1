package com.olufemi.questiontwo;

import java.util.Scanner;

public class Matrix {

    private int rows;
    private int columns;

    private int[][] elements;

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
        for (int i = 0; i < this.getRows(); i++){
            for(int j = 0; j < this.getColumns(); j++){
                System.out.println("Enter a value for element "+i+","+j+": ");
                setElements(i, j, scanner.nextInt());
            }
        }
        System.out.println("\n\n");
        return this;
    }

    public void printMatrix(){
        System.out.println("The value of the elements in this matrix are: \n");
        for(int i = 0; i < this.getRows(); i++){
            for(int j = 0; j < this.getColumns(); j++){
                System.out.println(i+","+j+": "+this.elements[i][j]);
            }
        }
        System.out.println("\n\n");
    }

    public Matrix addMatrix(Matrix other) {
        if (this.getRows() != other.getRows() || this.getColumns() != other.getColumns()) {
            System.out.println("Matrices cannot be added");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
            }
        }
        return result;
    }

    public Matrix multiply(Matrix other) {
        if (this.columns != other.rows) {
            System.out.println("Matrices cannot be multiplied");
            return null;
        }
        Matrix result = new Matrix(this.rows, other.columns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                for (int k = 0; k < this.columns; k++) {
                    result.elements[i][j] += this.elements[i][k] * other.elements[k][j];
                }
            }
        }
        return result;
    }

}
