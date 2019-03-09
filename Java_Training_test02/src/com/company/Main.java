//Java_Training test02
//Basic Training
//==============================
//If...Else
//For loop
//while loop
//do..while loop
//switch case
//==============================
//1.金字塔圖案
//2.九九乘法表
//3.巴斯卡三角
//4.迴行矩陣
//5.鑽石圖形
//6.質數
//7.最大公因數

package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        //PrintTowerUP(in);       // 金字塔上
        //PrintTowerDown(in);     // 金字塔下
        //
        //PrintTriangleLeft_Up(in);   //三角形左上
        //PrintTriangleLeft_Down(in); //三角形左下
        //PrintTriangleRigh_Up(in);   //三角形右上
        //PrintTriangleRight_Down(in);//三角形右下
        PrintTriangle_Coordinate_Method(in);
    }

//    架構->方法->實作

    public static void PrintTowerUP(int number){        //OK
        int in = number;

        for (int i = 1; i <= in ; i++)
        {
            for(int j = 1 ; j <= in - i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i -1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void PrintTowerDown(int number){      //OK
        int in = number;

        for (int i = in ; i >= 1 ; i--){

            for(int j = 0 ;j < in - i ; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i -1) ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void PrintTriangleLeft_Up(int number){    //OK
        int in = number;
        for (int i = 1 ; i <= in; i++){
            for (int j = 1; j <= i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void PrintTriangleLeft_Down(int number){  //OK
        int in = number;
        for(int i = 1; i <= in; i++){
            for (int j = i ; j <= in; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void PrintTriangleRigh_Up(int number){    //OK
        int in = number;
        for(int i = 1 ; i <= in ; i++){

            for (int j = i; j <= in -1 ; j++){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void PrintTriangleRight_Down(int number){     //OK
        int  in = number;
        for (int i = 1 ;i <= in; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(" ");
            }
            for (int k = in ; k >= i ; k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void PrintTriangle_Coordinate_Method(int number){  //Coordinate


//        (1,1) (1,2) (1,3) (1,4) (1,5)
//        (2,1) (2,2) (2,3) (2,4) (2,5)
//        (3,1) (3,2) (3,3) (3,4) (3,5)
//        (4,1) (4,2) (4,3) (4,4) (4,5)
//        (5,1) (5,2) (5,3) (5,4) (5,5)

        int in = number;
        for (int x = 1 ; x <= in; x++){
            for (int y = 1 ; y <= in ; y++){
                System.out.print("(" + x + "," + y + ") ");
                //if ( condition graph) "*"
                //else " "
            }
            System.out.println();
        }

    }





}




