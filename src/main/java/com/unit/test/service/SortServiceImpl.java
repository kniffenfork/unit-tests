package com.unit.test.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortServiceImpl implements SortService {
    @Override
    public List<Integer> bubbleSort(List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = nums.size() - 1; j > i; j--) {
                if (nums.get(j - 1) > nums.get(j)) {
                    int tmp = nums.get(j - 1);
                    nums.set(j -1, nums.get(j));
                    nums.set(j, tmp);
                }
            }
        }
        return nums;
    }
}
