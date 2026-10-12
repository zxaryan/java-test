package com.java.dsa.basics;

import org.junit.jupiter.api.Test;

public class PatternsTest {
    
@Test    
void solidRactangle(){
    int rows = 3;
    int cols = 5;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}    

@Test
void HollowRactangle(){
    int rows = 4;
    int cols = 5;
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= cols; j++) {
            if (i==1||j==1||i==rows||j==cols){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

@Test
void halfPyramid(){

}

@Test
void invertedHalfPyramid(){
    int rows = 5;
    for (int i = rows; i >= 1; i--) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

@Test
void invertRotatedHalfPyramid(){
    int rows = 5;
    for (int i = rows; i >= 1; i--) {
        for (int j = 0; j < rows-i; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

@Test
void floydsTringle(){
    int rows = 5;
    int num = 1;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
    }
}

@Test
void numTringle(){
    int rows = 5;
    int num = 1;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < i; j++) {
           if ((i+j)%2==0){
               System.out.print("1");
           } else {
               System.out.print("0");
           }
        }
        System.out.println();
    }
}

}
