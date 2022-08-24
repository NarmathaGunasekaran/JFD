package com.nseit.Spring;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class BinarySerachImpl {
    @Inject
    private SortAlg sortAlg;

    public int binarySearch(int[] numbers, int numberToSearch) {
        int[] sortedNumbers = sortAlg.sort(numbers);
        System.out.println(sortAlg);
        return 12;
    }
}
