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

    @Test
    public void testMinAndMaxFromTheArray () throws Exception {
        final int min;
        final int max;
        int minimumOfArray = 0;
        int maximumOfArray = 0;

        final MinAndMaxFromTheArray minAndMax = new MinAndMaxFromTheArray();
        int[] array = {4, 1, -1, 11, -20, 17, -5, 10};

        minAndMax.minAndMaxFromTheArray(array,0,0);

        List<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            array1.add(array[i]);
        }
        max = Collections.max(array1);
        min = Collections.min(array1);

        Assert.assertEquals(min, minimumOfArray);
        Assert.assertEquals(max, maximumOfArray);
    }
}
