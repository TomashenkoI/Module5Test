package ua.goit.java;

/**
 * Created by 7 on 15.03.2016.
 */
public class MinAndMaxFromTheArray {
    public static void main(String[] args) {

        int[] array = {4, 1, -1, 11, -20, 17, -5, 10};

        int minimumOfArray = array[0];
        int maximumOfarray = array[0];

        for (int a = 0; a < array.length-1; a++){

            if (array[a+1] < array[a] && array[a+1] < minimumOfArray)
            {
              minimumOfArray = array[a+1];
            }


            if (array[a+1] > array[a] && array[a+1] > maximumOfarray)
            {
                maximumOfarray = array[a+1];
            }
        }
        System.out.println(minimumOfArray+" - Minimum of Array.");
        System.out.println(maximumOfarray+" - Maximum of Array.");
        }
    }




