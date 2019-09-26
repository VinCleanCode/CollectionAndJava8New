package com.rp.lib.optional;

import com.rp.lib.tuple.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class OptionalOnObjectTest {
    private static Logger log = LogManager.getLogger();

    @Test
    void processItem() {
    }

    @Test
    void TestProcessCustomer() throws IOException, ClassNotFoundException {
        Customer c = OptionalOnObject.processCustomer("customer.json");
        log.debug(c.toString());
        log.info(c.address);
        log.error("error log color test");
        log.fatal("fatal log color test");
    }
}