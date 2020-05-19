package com.infosys.service.api;

import com.infosys.entity.Message;

public interface Split {

    Message CargoSplit(int sum, int quantity);
}
