package com.xhc.test.dubboclient.service;

import com.xhc.test.dubboclient.DubboRequest;
import com.xhc.test.dubboclient.DubboResponse;

public interface IDubboService {

    
    public DubboResponse service(DubboRequest dubboRequest);
}
