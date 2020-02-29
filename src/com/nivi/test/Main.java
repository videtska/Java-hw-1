package com.nivi.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*char ch1 = 'a';
        char ch2 = 'b';
        char ch3;
        ch3 = ch1 + ch2;
        System.out.println(ch3);*/
        /*MiniMu min = new MiniMu();
        System.out.println(min.findMin(6,6));*/

        /*****************1.Factorial************************
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Factorial fact = new Factorial();
        System.out.println(fact.calculationFactorialEasy(x));
        System.out.println(fact.calculationFactorialRec(x));*/

        /***************2.Distance between 2 dots**************************
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println(DistanceBetweenDots.getDistance(x1,y1,x2,y2));*/

        /***********3.Is it a triangle*********************
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(IsTriangle.checkSides(a,b,c));*/

        /**********4.MatrixZero****************************
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        MatrixZero.calcZero(x);*/

        /********************5.IndexWeight*****************
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println(IndexWeight.checkIndex(h, w));*/

        /***********6. EqualIntsInNumber********************
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(EqualsInNumber.checkEquals(a));*/

        /****************7.Swimming pool********************
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(SwimmingPool.poolSize(a,b,c));*/

        /*************8.StudentsFailed***********************
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(StudentsFailed.checkGrades(a, n));*/

        /***************9.ChooseBank************************
        Scanner sc = new Scanner(System.in);
        double a[];
        int n = sc.nextInt();
        BuyRUB.chooseBank(ReadAnArray.readAnArrDouble(n));*/

        /**************10.StringOutPut*********************
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        PrintString.printNTimes(s, n);*/

        /***************11.FindSummMaxMin******************
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FindMaxMin.sumMaxMin(ReadAnArray.readArrInt(n));*/

        /****************12.TriangleSquare******************
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(TriangleSquare.countS(a,b,c));*/

        /****************13.HexagonSquare*******************
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println(Hexagon.countHexagonS(a));*/

        /**************14.FactorialNotEven******************
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FactorialNotEven.countSumFact(n));*/

        /******************15.Discount**********************
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Discount.countDiscount(n);*/
    }
}
