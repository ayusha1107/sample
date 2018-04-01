package org.ayusha.sample.service;

import org.ayusha.sample.BaseTest;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

public class MyServiceTest extends BaseTest {

    @Inject
    MyService myService;

    @Test
    public void test() {
        Integer x = 4;
        assertEquals("test", x, myService.getValue());
    }
}
