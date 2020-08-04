package com.emily.algorithm.sort;

/**
 * @program: my-test
 * @description: bubble sort
 * @author: Emily Ma
 * @create: 2020-07-18
 **/
public class Sort {
    public static int[] bubbleSort(int[] arrayInt)
    {
        if (arrayInt == null)
        {
            return null;
        }
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt.length-i-1; j++) {
                int tmp;
                if (arrayInt[j] < arrayInt[j+1])
                {
                    tmp = arrayInt[j];
                    arrayInt[j] = arrayInt[j+1];
                    arrayInt[j+1] = tmp;
                }
            }

        }
        return arrayInt;
    }
    public static void main(String[] args)
    {
        int[] arrayInt = {2,4,1,3,10,5,6};
        bubbleSort(arrayInt);
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i]);
        }
    }

}
