package ua.goit.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 7 on 06.04.2016.
 */
public class MinAndMaxFromTheArrayTest {
    final MinAndMaxFromTheArray minAndMax = new MinAndMaxFromTheArray();
    int[] array = {4, 1, -1, 11, -20, 17, -5, 10};

    @Test
    public void testMinFromTheArray() throws Exception {
        final int min;

        int minimumOfArray = 0;

        minAndMax.minFromTheArray(array);

        List<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            array1.add(array[i]);
        }
        min = Collections.min(array1);

        Assert.assertEquals(min, minimumOfArray);
    }

    @Test
    public void testMaxFromTheArray() throws Exception {
        final int max;

        int maximumOfArray = 0;

        minAndMax.maxFromTheArray(array);

        List<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            array1.add(array[i]);
        }
        max = Collections.max(array1);

        Assert.assertEquals(max, maximumOfArray);
    }
}
