package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //PrintMuti_Table();
        PrintMuti_Table_Triangle_Down();
    }

    public static void PrintMuti_Table(){

        for(int i = 1 ; i <= 9; i++){
            for(int j = 1 ; j <= 9 ; j++){
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }

    public static void PrintMuti_Table_Triangle_Down(){

        for(int i = 1 ; i <= 9; i++){
            for(int j = 1 ; j <= 9 ; j++){
                if (i == j || i < j) {
                    System.out.print(i + "*" + j + "=" + (i * j) + " ");
                }
            }
            System.out.println();
        }

    }

    public static void PrintMuti_Table_Triangle_Up(){

        
    }
}
