package ua.goit.java;

/**
 * Created by 7 on 15.03.2016.
 */
public class MinAndMaxFromTheArray {

    public static void main(String[] args) {

        int[] array = {4, 1, -1, 11, -20, 17, -5, 10};
        minAndMaxFromTheArray(array,0,0);
    }

    public static String minAndMaxFromTheArray(int array[], int minimumOfArray, int maximumOfArray) {
        minimumOfArray = array[0];
        maximumOfArray = array[0];

        for (int a = 0; a < array.length - 1; a++) {

            if (array[a + 1] < array[a] && array[a + 1] < minimumOfArray) {
                minimumOfArray = array[a + 1];
            }


            if (array[a + 1] > array[a] && array[a + 1] > maximumOfArray) {
                maximumOfArray = array[a + 1];
            }
        }
        System.out.println(minimumOfArray + " - Minimum of Array.");
        System.out.println(maximumOfArray + " - Maximum of Array.");
        return null;
    }
}




