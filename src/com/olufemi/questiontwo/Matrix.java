package com.olufemi.questiontwo;

public class Matrix {

    private int rows;
    private int columns;

    private int[][] elements = new int[rows][columns];

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}
