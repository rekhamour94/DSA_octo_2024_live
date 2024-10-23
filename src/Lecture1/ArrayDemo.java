package Lecture1;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args){
        int[] array = new int[5];
        int array2[] = {2,6,8,9,0};
        System.out.println(array);
        array[0] = 5;
        array[1] = 15;
        array[2] =  12;
        array[3] =  9;
        array[4] =  1;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("enter you values  in array2");

        for(int i = 0;i<5;i++){
            Scanner sc= new Scanner(System.in);
            array2[i] = sc.nextInt();
            System.out.println("enter you next value");
        }
        for(int i= 0;i<5;i++){
            System.out.println(" the value is + " + array2[i]);
        }



    }
}
