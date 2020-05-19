package com.infosys.entity;

import java.util.List;

public class Message {

    private String resultCode;
    private List resultData;
    private String msg;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public List getResultData() {
        return resultData;
    }

    public void setResultData(List resultData) {
        this.resultData = resultData;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
