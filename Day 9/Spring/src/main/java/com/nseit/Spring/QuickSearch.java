package com.nseit.Spring;

import org.springframework.context.annotation.Primary;

import javax.inject.Named;
@Primary
@Named
public class QuickSearch  implements SortAlg{
    public int[] sort(int[] numbers) {
        return numbers;
    }

}
