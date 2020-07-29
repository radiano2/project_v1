package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        // int a = 252;
        // int b = 105;

        // while (b != 0) {
        // int switch_var = a % b;
        // a = b;
        // b = switch_var;
        // }

        // System.out.print(a);

        // int a = 252;
        // int b = 105;

        // if(a < b) {
        // int switch_var = a;
        // a = b;
        // b = switch_var;
        // }
        // int res;

        // int multiplication = a * b;

        // do {
        // res = a % b;
        // a = b;
        // b = res;

        // } while (res != 0);

        // int nsk = multiplication / a;
        // System.out.print(nsk);

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Please enter day of the week : ");
        // String s = scanner.nextLine();

        // switch (s) {
        // case "monday" , "Monday" :
        // System.out.print("work");
        // break;
        // case "tuesday" , "Tuesday":
        // System.out.print("work and birhday");
        // break;
        // case "wednesday" , "Wednesday":
        // System.out.print("work again");
        // break;
        // case "thursday" , "Thursday":
        // System.out.print("work in depression");
        // break;
        // case "friday" , "Friday":
        // System.out.print("chill");
        // break;
        // case "saturday" , "Satuday":
        // System.out.print("Pool party");
        // break;
        // case "sunday" , "Sunday":
        // System.out.print("Friends birthday");
        // break;
        // default:
        // System.out.println("There is no such day");
        // }

        // int a = 90;
        // while (a != 0) {
        // System.out.println(a);
        // a = a - 5;

        // }

        // int b = 7;
        // if(b % 2 == 0){
        // System.out.println("The number is even");
        // }
        // else {
        // System.out.println("The number is odd");
        // }

        // int x = 13;
        // int y = 9;

        // int x_tmp = x - 10;
        // int y_tmp = y - 10;

        // if(x_tmp < 0){
        // x_tmp = x_tmp * -1;
        // }
        // else if (y_tmp < 0){
        // y_tmp = y_tmp * -1;
        // }

        // if(x_tmp < y_tmp){
        // System.out.print("The number x is closer");
        // }
        // else if (y_tmp < x_tmp) {
        // System.out.println("the number y is closer");
        // }
        // else {
        // System.out.println("The numbers are evenly close");
        // }

        // int array[] = { 5, 13, 26, 3, 18, 94, 63 };
        // // int temp;

        // int getmax = Arrays.stream(array).max().getAsInt();
        // int getmin = Arrays.stream(array).min().getAsInt();

        // for (int i = 1; i < array.length; i++) {
        // for (int j = i; j > 0; j--) {
        // if (array[j] < array[j - 1]) {
        // temp = array[j];
        // array[j] = array[j - 1];
        // array[j - 1] = temp;
        // }
        // }
        // }

        // for (int i = 0; i < array.length; i++) {
        // System.out.println(array[i]);
        // }

        // int temp2 = array.length;

        // System.out.println(temp2);

        // int getmin = array[0];
        // int getmax = array[array.length - 1];

        // System.out.print("Max is - ");
        // System.out.println(getmax);

        // System.out.print("Min is - ");
        // System.out.println(getmin);
        int[] array = {0, 24, 142, 252, 89, 239, 12, 212, 232, 162};
        int getmax = Arrays.stream(array).max().getAsInt();
        System.out.println(Arrays.toString(array));
        // int array[] = { 64, 34, 25, 12, 22, 11, 90, 5, 13, 26, 3, 18, 94, 63 };
        // int n = array.length; // bubblesort (low level)
        // for (int x = 0; x < n - 1; x++)
        // for (int y = 0; y < n - x - 1; y++)
        // if (array[y] > array[y + 1]) {

        // int temp = array[y];
        // array[y] = array[y + 1];
        // array[y + 1] = temp;
        // System.out.println(Arrays.toString(array));
        // }

//        int n = array.length;
//        IntStream.range(0, n - 1).flatMap(i -> IntStream.range(1, n - i)).forEach(j -> {
//            if (array[j - 1] > array[j]) {
//                int temp = array[j];
//                array[j] = array[j - 1];
//                array[j - 1] = temp;
//                System.out.println(Arrays.toString(array));
//            }
//        });
        //System.out.println(Arrays.toString(array));

    }
}



