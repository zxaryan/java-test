package com.java.dsa.basics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PatternTest {

//    @Test
//    void rightTriangle() {
//        int rows = 5;
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


    @Test
    void rightTriangle() {
        int rows = 5;
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                output.append("*");
            }
            output.append("\n");
        }

        assertEquals(
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n",
                output.toString()
        );
    }


    @Test
    void invertedTriangle() {
        int rows = 5;
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Test
    void pyramid() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("#");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            for (int l = 1; l <= rows - i; l++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}