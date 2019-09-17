package com.rp.lib.optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OptionalExampleTest {

    private static Logger log = LogManager.getLogger();

    @Test
    public void testOptionalFilter_null(){
        String result = OptionalExample.optionalFilter(null);
        Assertions.assertEquals("N",result);
        log.info("Optional result: {}",result);
    }

    @Test
    public void testOptionalFilter_18(){
        String result = OptionalExample.optionalFilter("18");
        log.info("Optional result: {}",result);
        Assertions.assertEquals("Y",result);

        result = OptionalExample.optionalFilter("19");
        log.info("Optional result: {}",result);
        Assertions.assertEquals("Y",result);
    }
}
