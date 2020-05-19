package com.infosys.service;

import com.infosys.entity.Message;
import com.infosys.service.api.ChangeRoot;

import java.util.ArrayList;
import java.util.List;

public class ChangRootImpl implements ChangeRoot {


    public Message CargoChangeRootQuantity(int rootQuantity) {
        int sum = 0;
        int[] proportion = {5, 2};
        Message message = new Message();
        message.setResultCode("success");
        List<Integer> result = new ArrayList<Integer>();

        for (int quantity : proportion) {
            if(rootQuantity % quantity !=0){
                message.setResultCode("fail");
                message.setMsg("The result cannot be a decimal.");
               return message;
            }
            int current = rootQuantity / quantity;
            result.add(current);
            sum += current;
        }
        result.add(rootQuantity - sum);
        message.setResultData(result);
        return message;
    }
}
