package com.infosys.test;

import com.infosys.entity.Message;
import com.infosys.service.ChangRootImpl;
import com.infosys.service.api.ChangeRoot;

public class ChangeRootTest {

    public static void main(String[] args) {
        ChangeRoot root=new ChangRootImpl();
        Message message=root.CargoChangeRootQuantity(100);
        if("success".equals(message.getResultCode())){
            System.out.println(message.getResultData());
        }else{
            System.out.println(message.getMsg());
        }

    }
}
