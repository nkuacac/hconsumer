package com.service.controller;

import com.service.model.Person;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestHconsumer {

    HconsumerImpl hconsumerImpl;

    @Before
    public void setup() throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
        hconsumerImpl = BeanUtils.getBean("hconsumerImpl");
    }



    @Test
    public void testadd(){

        Integer expactReturnValue = null; // You should put the expect Integer type value here.

        // You should put the parameter here, in such footprint: hconsumerImpl.add(Integer a, Integer b)
        Integer returnValue = hconsumerImpl.add(null, null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHei(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: hconsumerImpl.sayHei(String name)
        String returnValue = hconsumerImpl.sayHei(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHello(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: hconsumerImpl.sayHello(String name)
        String returnValue = hconsumerImpl.sayHello(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHi(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: hconsumerImpl.sayHi(String name)
        String returnValue = hconsumerImpl.sayHi(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsaySomething(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: hconsumerImpl.saySomething(String prefix, Person user)
        String returnValue = hconsumerImpl.saySomething(null, null);

        assertEquals(expactReturnValue, returnValue);
    }

}



