package com.codewithmo._09.Sort;

public class SelectionSort {
    // selection sort = search through an array and keep track of the minimum value during
    //			         each iteration. At the end of each iteration, we swap values.

    //				 Quadratic time O(n^2)
    //				 small data set = okay
    //				 large data set = BAD

    public static void main(String[] args) {

        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionSort(array);

        for(int i : array) {
            System.out.print(i + " ");
        }
    }

//    private static void selectionSort(int[] array) {
//
//        for(int i = 0; i < array.length - 1; i++) {
//            int min = i;
//            for(int j = i + 1; j < array.length; j++) {
//                if(array[min] > array[j]) {
//                    min = j;
//                }
//            }
//
//            int temp = array[i];
//            array[i] = array[min];
//            array[min] = temp;
//        }
//
//    }


    private static void selectionSort(int[] array) {

        int firstElement;
        int secondElement;

        for(firstElement = 0; firstElement < array.length - 1; firstElement++) {
            int min = firstElement;
            for(secondElement = firstElement + 1; secondElement < array.length; secondElement++) {
                if(array[min] < array[secondElement]) {
                    min = secondElement;
                }
            }

            int temp = array[firstElement];
            array[firstElement] = array[min];
            array[min] = temp;
        }

    }


}
