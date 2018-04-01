package org.ayusha.sample.service.impl;

import org.ayusha.sample.service.MyService;
import org.springframework.stereotype.Component;

@Component
public class MyServiceImpl implements MyService {
    @Override
    public Integer getValue() {
        return 4;
    }
}
