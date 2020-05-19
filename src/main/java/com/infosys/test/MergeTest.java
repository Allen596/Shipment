package com.infosys.test;

import com.infosys.service.MergeImpl;
import com.infosys.service.api.Merge;

public class MergeTest {

    public static void main(String[] args) {
        Merge merge=new MergeImpl();
        int[] quantityArray ={30,50};
        merge.CargoMerge(quantityArray);
    }
}
