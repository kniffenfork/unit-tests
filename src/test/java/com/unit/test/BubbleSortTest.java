package com.unit.test;

import com.unit.test.service.SortService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class BubbleSortTest {
    private static final List<Integer> UNSORTED_LIST = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
    private static final List<Integer> SORTED_LIST = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

    @Autowired
    private SortService sortService;

    @Test
    void shouldSortList() {
        Assertions.assertEquals(SORTED_LIST, sortService.bubbleSort(UNSORTED_LIST));
    }
}
