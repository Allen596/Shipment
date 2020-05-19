package com.infosys.service;

import com.infosys.entity.Message;
import com.infosys.service.api.Split;
import com.infosys.utils.MyUtils;

import java.util.ArrayList;
import java.util.List;

public class SplitImpl implements Split {


    public Message CargoSplit(int sum, int quantity) {
        Message message = new Message();
        message.setResultCode("fail ");
        List<Integer> cargoList = new ArrayList<Integer>();
        quantity = quantity ==0 ? 1: quantity;

        if (sum <= 0 || MyUtils.isNumber(String.valueOf(sum))) {
            message.setMsg("The total number must be greater than 0.");
        } else if (sum % quantity != 0) {
            message.setMsg("The query result contains decimals.");
        } else {
            int result = sum / quantity;
            for (int i = 0; i < quantity; i++) {
                cargoList.add(result);
            }
            message.setResultCode("success");
            message.setResultData(cargoList);
        }
        return message;

    }

}
