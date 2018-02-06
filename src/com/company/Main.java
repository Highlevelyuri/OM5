package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array ={9, 8, 4, 6, 6, 4, 3, 2, 2};
        for (int a : array) {
            System.out.print(a + "  ");
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] == array[i+1]) {
                array[i]=0;
                array[i+1]=0;

            }


            System.out.print("\nМассив после : ");
            for (int a : array) {
                System.out.print(a + " ");


            }

        }
    }
}

