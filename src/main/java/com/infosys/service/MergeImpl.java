package com.infosys.service;

import com.infosys.service.api.Merge;

public class MergeImpl implements Merge {


    public void CargoMerge(int[] quantityArray) {

        int sum = 0;
        for (int quantity : quantityArray) {
            sum += quantity;
        }
        System.out.println(sum);
    }
}
