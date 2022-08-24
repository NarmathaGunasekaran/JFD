package com.nseit.SpringExercise;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;

@Named
public class BinarySerachImpl {
    @Autowired
    private SortAlg sortAlg;

    public int binarySearch(int[] numbers, int numberToSearch) {
        int[] sortedNumbers = sortAlg.sort(numbers);
        System.out.println(sortAlg);
        return 12;
    }
}
