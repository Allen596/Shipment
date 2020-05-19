package com.infosys.test;

import com.infosys.entity.Message;
import com.infosys.service.api.Split;
import com.infosys.service.SplitImpl;

public class SplitTest {

    public static void main(String[] args) {

        Split testSp=new SplitImpl();
        Message message=testSp.CargoSplit(100,5);
        if("success".equals(message.getResultCode())){
           System.out.println(message.getResultData());
        }else{
            System.out.println(message.getMsg());
        }
    }
}
